package digionebankTest

import digionebank.Cliente
import digionebank.Gerente
import digionebank.TipoCliente

    fun main(){
       var cliente = Cliente("Leo","1234",TipoCliente.PJ,"12345")
        var gerente = Gerente("Pedro","2233",8000.0,"senha124")
        println(cliente.login())
        println(gerente.login())
    }
