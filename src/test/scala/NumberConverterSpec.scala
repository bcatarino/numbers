import org.scalatest.{Matchers, WordSpec}

class NumberConverterSpec extends WordSpec with Matchers {

  val converter = new NumberConverter

  "NumberConverter#toText" should {

    "Be zero" in {
      converter.toText(0) shouldBe "zero"
    }

    "Be one" in {
      converter.toText(1) shouldBe "one"
    }

    "Be two" in {
      converter.toText(2) shouldBe "two"
    }

    "Be three" in {
      converter.toText(3) shouldBe "three"
    }

    "Be four" in {
      converter.toText(4) shouldBe "four"
    }

    "Be five" in {
      converter.toText(5) shouldBe "five"
    }

    "Be six" in {
      converter.toText(6) shouldBe "six"
    }

    "Be seven" in {
      converter.toText(7) shouldBe "seven"
    }

    "Be eight" in {
      converter.toText(8) shouldBe "eight"
    }

    "Be nine" in {
      converter.toText(9) shouldBe "nine"
    }

    "Be ten" in {
      converter.toText(10) shouldBe "ten"
    }

    "Be eleven" in {
      converter.toText(11) shouldBe "eleven"
    }

    "Be twelve" in {
      converter.toText(12) shouldBe "twelve"
    }

    "Be thirteen" in {
      converter.toText(13) shouldBe "thirteen"
    }

    "Be fourteen" in {
      converter.toText(14) shouldBe "fourteen"
    }

    "Be fifteen" in {
      converter.toText(15) shouldBe "fifteen"
    }

    "Be sixteen" in {
      converter.toText(16) shouldBe "sixteen"
    }

    "Be seventeen" in {
      converter.toText(17) shouldBe "seventeen"
    }

    "Be eighteen" in {
      converter.toText(18) shouldBe "eighteen"
    }

    "Be nineteen" in {
      converter.toText(19) shouldBe "nineteen"
    }

    "Be twenty" in {
      converter.toText(20) shouldBe "twenty"
    }

    "Be twenty one" in {
      converter.toText(21) shouldBe "twenty one"
    }

    "Be twenty five" in {
      converter.toText(25) shouldBe "twenty five"
    }

    "Be thirty" in {
      converter.toText(30) shouldBe "thirty"
    }

    "Be thirty nine" in {
      converter.toText(39) shouldBe "thirty nine"
    }

    "Be fourty" in {
      converter.toText(40) shouldBe "fourty"
    }

    "Be fifty" in {
      converter.toText(50) shouldBe "fifty"
    }

    "Be sixty" in {
      converter.toText(60) shouldBe "sixty"
    }

    "Be seventy" in {
      converter.toText(70) shouldBe "seventy"
    }

    "Be eighty" in {
      converter.toText(80) shouldBe "eighty"
    }

    "Be ninety" in {
      converter.toText(90) shouldBe "ninety"
    }

    "Be ninety nine" in {
      converter.toText(99) shouldBe "ninety nine"
    }

    "Be one hundred" in {
      converter.toText(100) shouldBe "one hundred"
    }

    "Be one hundred and five" in {
      converter.toText(105) shouldBe "one hundred and five"
    }

    "Be one hundred and eleven" in {
      converter.toText(111) shouldBe "one hundred and eleven"
    }

    "Be one hundred and fifty seven" in {
      converter.toText(157) shouldBe "one hundred and fifty seven"
    }

    "Be two hundred" in {
      converter.toText(200) shouldBe "two hundred"
    }

    "Be six hundred and fourty nine" in {
      converter.toText(649) shouldBe "six hundred and fourty nine"
    }

    "Be one thousand" in {
      converter.toText(1000) shouldBe "one thousand"
    }

    "Be one thousand and ten" in {
      converter.toText(1010) shouldBe "one thousand and ten"
    }

    "Be one thousand and seventy nine" in {
      converter.toText(1079) shouldBe "one thousand and seventy nine"
    }

    "Be one thousand, three hundred" in {
      converter.toText(1300) shouldBe "one thousand, three hundred"
    }

    "Be twenty six thousand and twenty seven" in {
      converter.toText(26027) shouldBe "twenty six thousand and twenty seven"
    }

    "Be three hundred and twenty five thousand, twenty seven" in {
      converter.toText(325027) shouldBe "three hundred and twenty five thousand and twenty seven"
    }

    "Be one million" in {
      converter.toText(1000000) shouldBe "one million"
    }

    "Be one million and two" in {
      converter.toText(1000002) shouldBe "one million and two"
    }

    "Be seven million, two thousand and seven" in {
      converter.toText(7002007) shouldBe "seven million, two thousand and seven"
    }

    "Be fifty six million, nine hundred and fourty five thousand, seven hundred and eighty one" in {
      converter.toText(56945781) shouldBe "fifty six million, nine hundred and fourty five thousand, seven hundred and eighty one"
    }

    "Be nine hundred and ninety nine million, nine hundred and ninety nine thousand, nine hundred and ninety nine" in {
      converter.toText(999999999) shouldBe "nine hundred and ninety nine million, nine hundred and ninety nine thousand, nine hundred and ninety nine"
    }

    "Be empty for under 0" in {
      converter.toText(-1) shouldBe ""
    }

    "Be empty for above 999999999" in {
      converter.toText(1000000000) shouldBe ""
    }
  }
}
