fun main() {
    number(6)
    number(-1)
    Number(1)
    function(7,4,3)
}
//Positive or Negative: Write a Kotlin function that takes an integer as a parameter and prints "Positive" if the number is greater than 0, "Negative" if it's less than 0, and "Zero" if it's equal to 0.
fun number(x:Int){
    if (x>0)
        println("positive")
    else(println("negative"))
}

//Even or Odd: Create a Kotlin function that accepts an integer as an argument and returns true if the number is even and false if it's odd. Print the result.
fun Number(num1:Int){
    if (num1==2)
        println("even")
    else
        println("odd")
}
//Maximum of Three Numbers: Write a Kotlin function that takes three numbers as parameters and returns the maximum of the three. Print the result.
fun function(num1:Int,num2:Int,num3:Int){
    if (num1 >= num2 && num1 >= num3)
        println("$num1 is the maxmum number.")
    else if (num2 >= num1 && num2 >= num3)
        println("$num2 is the maxmum number.")
    else
        println("$num3 is the maxmum number.")

}
//Leap Year: Create a Kotlin function that takes a year as a parameter and returns true if it's a leap year and false otherwise. Print the result.

val year = 1900
var leap = false

