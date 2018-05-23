
import TranslationMaps._

class NumberConverter {

  def toText(number: Int) = {
    if (number < 0 || number > 999999999) ""
    else if (number == 0) zero
    else if (number < 1000) convertHundredths(number)
    else if (number < 1000000) convertThousands(number)
    else convertMillions(number)
  }

  private def convertFirstTwenty(unit: Int) = basicsMaps(unit)

  private def convertTenths(number: Int, tenth: Int, unit: Int) = {
    if (number < 20) convertFirstTwenty(number)
    else convertThenties(tenth, unit)
  }

  private def convertThenties(tenth: Int, unit: Int) = {
    val extra = if (unit > 0) List(" ", basicsMaps(unit)) else Nil
    (tenthsMap(tenth) ++ extra).mkString
  }

  private def convertHundredths(number: Int): String = toDigits(number) match {
    case List(unit) => convertFirstTwenty(unit)
    case List(tenth, unit) => convertTenths(number, tenth, unit)
    case List(hundredth, tenth, unit) =>
      val extra = if (tenth > 0 || unit > 0) List(" and ", convertTenths(number - hundredth * 100, tenth, unit)) else Nil
      (List(basicsMaps(hundredth), " ", hundred) ++ extra).mkString
    case _ => ""
  }

  private def convertThousands(number: Int): String = {
    val oneThousand = 1000
    val thousands = number / oneThousand
    val hundredths = number - thousands * oneThousand
    val main = if (thousands > 0) List(convertHundredths(thousands), " ", thousand) else Nil
    val extra = if (hundredths > 0) List(thousandsSeparator(hundredths), convertHundredths(hundredths)) else Nil
    (main ++ extra).mkString
  }

  private def thousandsSeparator(remain: Int) = if (remain > 100) ", " else " and "

  // I feel there's a more functional way to do this and reuse some code between convertMillions and convert thousands,
  // but ran out of time. I'd focus on reusability and readibility if I was to spend more time with it.
  private def convertMillions(number: Int): String = {
    val oneMillion = 1000000
    val millions = number / oneMillion
    val thousands = number - millions * oneMillion
    val extra = if (thousands > 0) List(millionsSeparator(thousands), convertThousands(thousands)) else Nil
    (List(convertHundredths(millions), " ", million) ++ extra).mkString
  }

  private def millionsSeparator(remain: Int) = if (remain < 100) "" else if (remain > 1000) ", " else " and "

  private def toDigits(number: Int): List[Int] = number.toString.map(_.asDigit).toList
}
