class Triangle{
    private var base:Double = 2.4
    private var height:Double =5.4

    fun area(){
        var area =0.5*(base*height)
        println("The are of the triangle is:$area")
    }
}

fun main(args: Array<String>){
//     // we create an object using val
//     // we initialize it to triangle class foo 
//     // create object of triangle class

    val triangle_object =Triangle()
//     // using the created object we call findArea() function
    triangle_object.area()

    val gross_income = payRoll()
    gross_income.findGross()
    
    val health=health()
    health.findBMI()
}

class payRoll{
    private var basic:Double=24000.0
    private var allowance:Double=2000.0
    private var tax:Double=3444.0
    private var name: String ="Hassan"

    fun findGross() {
        val gross:Double=(basic+allowance)-tax
        println("your name :"+name)
        println("gross pay is"+gross)
    }
}
// fun main(args: Array<String>){
// //     // we create an object using val
// //     // we initialize it to triangle class foo 
// //     // create object of triangle class
//     val triangle_object = Triangle()
// //     // using the created object we call findArea() function
// //     triangle_object.area()

//     val gross_income = payRoll()
//     gross_income.findGross()

// }

class health{
    private var weight:Int = 70
    private var height:Double =1.7

    fun findBMI(){
     var BMI=weight/(height*height)
     println("the BMI IS :$BMI")
    }

  
}



