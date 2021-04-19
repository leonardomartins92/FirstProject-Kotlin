package digionebank

class Cliente(nome:String, cpf:String, val clienteTipo: TipoCliente, val senha:String):Pessoa(nome, cpf), Log {
    override fun login(): Boolean = "12345" == senha
}