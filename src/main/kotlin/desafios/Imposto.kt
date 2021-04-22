package desafios

fun main(args: Array<String>) {
    //continue a solução
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()
    var i = 0F

    if ( r<2000 ) {
        i = 0F
    } else if (r<=3000) {
        i = (r-2000) * 0.08F
    } else if (r<=4500) {
        i = (r-3000) * 0.18F + 80F
    } else if (r > 4500) {
        i = (r-4500) * 0.28F + 350F
    }
    if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")


}