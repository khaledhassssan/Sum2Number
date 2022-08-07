import java.util.Scanner
fun main() {
    // Kotlin Program to Add three Random Numbers
    val reader = Scanner(System.`in`)
    // First number
    print("Enter a number 1 : ")
    var first:Int = reader.nextInt()

    // Second number
    print("Enter a number 2 : ")
    var second :Int = reader.nextInt()

    // Third number
    print("Enter a number 3 : ")
    var third :Int = reader.nextInt()

    // Sum operation
    var sum = first + second +third;
    // Print result
    println(" - - - - - - - - - - - - - - - - - - - - ");
    println("  SUM = $first + $second + $third = $sum .");
    println(" - - - - - - - - - - - - - - - - - - - - ");

}