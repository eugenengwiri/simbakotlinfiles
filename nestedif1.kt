fun main(args: Array<String>){
    var withdrawalAmount = 2000
    var Mpesacharges = 0

    if (withdrawalAmount >=200 && withdrawalAmount <=2500){
        Mpesacharges=34
        println("MpesaCharges")
    } else if (withdrawalAmount >=2501 && withdrawalAmount <=5000){
        Mpesacharges=67
        println("Mpesacharges")
    }else if (withdrawalAmount >=5001 && withdrawalAmount <=10000){
        Mpesacharges=112
        println("Mpesacharges")
    }else if (withdrawalAmount >=10001 && withdrawalAmount <=20000){
        Mpesacharges=134
        println("Mpesacharges")
    }else{
        println("Enter valid Amount ")
    }

}    

   

 
        
            