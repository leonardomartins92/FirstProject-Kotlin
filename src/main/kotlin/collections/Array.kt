package collections

fun main(){
    val values = IntArray(5)
    val salarios = DoubleArray(3)

    val values2 = intArrayOf(9,8,7,6,5)
    val salario2 = doubleArrayOf(9.0,10.1)
    val nomes2 = arrayOf("Maria","Ana","Leo")

    val nomes = Array(3){"Maria";"Ana";"Leo"}
    val telefones = Array(3){1;2;3}

    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5
    
    values.forEachIndexed{index, value ->
        values[index] = value * 2
    }

    for (v in values){
        println(v);
    }
    for (i in 0..4){
        values2.set(i,i)
    }
    for (v in values2){
        println(v);
    }
}
