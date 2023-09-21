fun main(args: Array<String>){ 
    var marks:Int = 90 

    when (marks){
        in 1..30 ->println("You have $marks-Below average")
        in 30..50 ->println("You have $marks-Average")
        in 51..75 ->println("You have $marks-Above average")
        in 76..99 ->println("You have $marks-Excellent")
        else-> println("You have $marks-invalid Marks try again")
    }
       

}