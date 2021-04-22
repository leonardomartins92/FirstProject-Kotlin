package desafios

fun main(args: Array<String>) {

    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        var result = mdc(input[0], input[1])
        println(result)
    }

}

// máximo divisor comum (chamada recursiva)
fun mdc(n1: Int, n2: Int): Int {
    val restos = DoubleArray(1000)
    var maior: Double
    var menor: Double

    if(n1 == n2){ return n1 }
    if(n1 > n2) {
        maior = n1.toDouble()
        menor = n2.toDouble()
    }else{
        maior = n2.toDouble()
        menor = n1.toDouble()
    }
    if(maior%menor == 0.0){ return menor.toInt()}

    restos[0] = maior % menor

    if(menor%restos[0] == 0.0){ return restos[0].toInt()}

    restos[1] = menor % restos[0]

    for (i in 0..maior.toInt()){
        restos[2+i]=restos[i]%restos[1+i]

        if(restos[2+i]==0.0){
            return restos[1+i].toInt()
        }
        if(restos[2+i]==1.0){ return 1}
    }
    return 1
}