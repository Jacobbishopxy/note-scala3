@main def hello: Unit =
  println("Hello world!")
  println(msg)
  println(day)

def msg = "I was compiled by Scala 3. :)"

val i = 2

val day = i match
  case 0 => "Sunday"
  case 1 => "Monday"
  case 2 => "Tuesday"
  case 3 => "Wednesday"
  case 4 => "Thursday"
  case 5 => "Friday"
  case 6 => "Saturday"
  case _ => "invalid day"
