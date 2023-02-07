package KotlinAlura.modelo

import KotlinAlura.modelo.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
        }else{
            println("Falha na autenticação")
        }
    }
}