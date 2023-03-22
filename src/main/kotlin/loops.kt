fun main(args: Array<String>) {
    //1. WHILE LOOPS
        //while loop
    var counterOne = 0
    while (counterOne <= 5){
        println(counterOne)
        counterOne++
    }
        //do while loop
    var counterTwo = 50
    do {
        println(counterTwo)
        counterTwo++
    }
        while (counterTwo <=15)
    //2. FOR LOOPS
            //for in loop
    for (num in 20..25){
        println(num)
    }

    for (num2 in 50..45){
        println(num2)
    }

        //foreach loop
    var names = listOf("June", "Chris", "Berur", "Amal", "Shemaiyah")
    names.forEach {
        println(it)
    }
    //3. REPEAT LOOP
    repeat(5){
        println("Hello World")
    }
}