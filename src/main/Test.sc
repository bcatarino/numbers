val list = 2.toString.map(_.asDigit).toList

list match {
  case List(a, b, c) => c
  case _ => 4
}