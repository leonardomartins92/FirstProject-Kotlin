package collections

fun main(){
    val joao = Funcionario("Joao", 1000.0)
    val maria = Funcionario("Maria", 3000.0)
    val pedro = Funcionario("Pedro", 2000.0)

    val funcionario = listOf<Funcionario>(joao,maria,pedro)

}
data class Funcionario(
    val nome: String,
    val salario: Double
)
