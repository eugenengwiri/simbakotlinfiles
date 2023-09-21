fun main(args:Array<String>){
 callme()
 addnumbers()
 area()
 check()
 add_numbers(12.0, 13.5)
 simple_intrest(6000, 12, 3.0)
 checkmarks(72.0, 76896)
 checkmarks(20.0, 76886)
 checkmarks(88.0, 76796)
 bmi(45, 5.2)
}
fun callme(){
    println("hello student")
}

fun addnumbers(){
    var num1:Int = 16
    var num2:Int =24
    var sum = num1+num2
    println("the sum is $sum")
}

fun area(){
    var b=16
    var h=7
    var area= 0.5*(b*h)
    println("area is $area")
}

fun check(){
    val number = -78

    if (number<0){
        println("$number negative number")
    }else if(number>0){
        println("$number possitive number")
    }else{
        println("$number invalid input")
    }
}


fun add_numbers(number1:Double,number2:Double){
    val answer  = number1 + number2
    println("the sum is $answer")
}

fun simple_intrest(number1:Int,number2:Int,number3:Double){
    var answer =number1*number2/100 * number3
    println("the area $answer")

}

fun checkmarks(marks:Double,AdminNo:Int){
    if(marks<30){
        println("your admission no is: $AdminNo, you've failed")
        println("you've scored $marks")
    }else if(marks>=30 && marks<75){
        println("your admission no is: $AdminNo, you've passed")
        println("you've scored $marks")

    }else if(marks>=75 &&marks<=100){
       println( "your admission no is: $AdminNo, very good")
       println("you've scored $marks")

    }else{
        println( "your admission no is: enter valid marks")

    }
}

fun bmi(w:Int,h:Double){
    val bmi = w/(h*h)
    println("your bmi $bmi")
   

}





