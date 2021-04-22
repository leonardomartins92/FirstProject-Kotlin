package desafios

fun main(){

    val n = readLine()!!.toInt()
    for (i in 1..n) {
        var cont = 0
        var primo = true
        var x = readLine()!!.toDouble()

        if(x <=1){
            primo = false
        }else if(x%2 ==0.0 && x != 2.0){
            primo = false
        }else{
            val raizNum = kotlin.math.sqrt(x).toInt()
            for(j in 3..raizNum step 2){
                if(x%j == 0.0){
                    primo = false
                }
            }
        }

        if(primo){
            println("Prime")
        }else{
            println("Not Prime")
        }
    }
}