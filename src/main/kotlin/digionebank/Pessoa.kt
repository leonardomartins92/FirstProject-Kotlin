package digionebank

abstract class Pessoa( val nome: String = "Leo",
                            val cpf: String = "123123") {

    override fun toString(): String {
        return "Pessoa(nome='$nome', cpf='$cpf')"
    }

}