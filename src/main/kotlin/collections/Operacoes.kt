package collections

fun main(){
    val salarios = doubleArrayOf(1000.0, 2200.0, 3000.0)

    println("max: " + salarios.max())
    println("min: " + salarios.min())
    println("max novo: " + salarios.max())
    println("min novo: " + salarios.min())
    println("media: " + salarios.average())

    val salariosRicos = salarios.filter { it > 2500.0 }
    println(salariosRicos)
    println(salarios.count{it in 2000.0..5000.0})
    println(salarios.find{it == 2200.0})
}