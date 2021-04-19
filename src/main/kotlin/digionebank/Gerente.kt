package digionebank

class Gerente(nome: String, cpf: String, salario: Double, val senha: String):Funcionario(nome, cpf, salario), Log {
    override fun calculoAuxilio()= salario * 0.4

    override fun login(): Boolean = "senha123" == senha

}