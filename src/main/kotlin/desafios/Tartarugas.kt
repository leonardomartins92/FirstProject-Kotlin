package desafios

import java.io.EOFException

fun main(args: Array<String>) {

    while (true) {

        try {
            val l = readLine()!!.toInt()
            val v = readLine()!!.split(" ").run { map { it.toInt()}.toMutableList() }
            v.sort()

            when(v.last()){
                in 0..9 ->  println(1)
                in 10..19 -> println(2)
                in 20..50 -> println(3)
            }
            v.clear()

        } catch (f : Exception ) {
            break
        } catch (n : Exception ) {
            break
        } catch (e : Exception) {
            break
        }
    }
}