package oop

import java.awt.Color

fun main(args: Array<String>) {
    //These are objects
    var f1 = Fruit("Mango","Yellow", "200g", 30.0)
    var f2 = Fruit("Apple", "Pink", "250g", 50.0)
    println(f1.name)
    println(f2.color)

    var c1 = Car("Toyota", "KDG 980J", 2000000.00)
    var c2 = Car("Mercedes", "KDG 795G", 4500000.00)
    c2.accelerate()
    c1.brake()
    println(c2.model)
    println(c1.reg_no)
}

//This is a class
class Fruit(name: String, color: String, size:String, price:Double){
    //declare the properties to be intialised
    var name:String
    var color:String
    var size:String
    var price:Double
    //Initialised the properties
    init {
        this.name = name
        this.color = color
        this.size = size
        this.price = price
    }
}

class Car(model:String, reg_no:String, price:Double){
    var model:String
    var reg_no:String
    var price:Double
    init {
        this.model = model
        this.reg_no = reg_no
        this.price = price
    }
    //These are class funtions
    fun accelerate(){
        println("Yeah, I can accelerate")
    }
    fun brake(){
        println("I am a $model and I can brake")
    }
}
