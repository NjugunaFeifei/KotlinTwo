fun main(args: Array<String>) {
    var age = 20
    if (age < 18) {
        println("You are underage")
    } else {
        println("Welcome to the party")
    }


    var weight = 100
    var height = 1.9
    var bmi = weight / (height * height)
    if (bmi <= 18) {
        println("Underweight")
    } else if (bmi <= 29) {
        println("Normal weight")
    } else if (bmi <= 34) {
        println("Overweight")
    } else {
        println("Obese")
    }
    //WHEN STATEMENTS

    var Math = 90
    var Eng = 86
    var Kisw = 94
    var sci = 74
    var sst = 84
    var mean = (Math + Eng + Kisw + sci + sst) / 5
    if (mean <= 50) {
        println("E")
    }else if(mean <= 60){
        println("D")
    }else if(mean <= 70){
        println("B")
    }else{
        println("A")
    }

    var bettingnumber = 3
    when (bettingnumber){
        1 ->{
            println("You lost")
        }
        2 ->{
            println("You lost")
        }
        3 ->{
            println("You won")
        }
        4 ->{
            println("You lost")
        }
        else ->{
            println("Enter a number from 1 - 4 to bet")
        }
    }
}