fun main() {
    // Kotlin Program to Add three Random Numbers

    // First number
    var first = (1..10).shuffled().first();
    println("First number = "+first);

    // Second number
    var second = (1..10).shuffled().first();
    println("Second number = "+second);

    // Sum operation
    var sum = first + second ;
    // Print result
    println("Sum of three Random Numbers is "+sum);
}