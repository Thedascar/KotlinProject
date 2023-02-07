package br.com.alura.modelo

import br.com.alura.modelo.Autenticavel

class SistemaInterno {

    fun entra(admin: br.com.alura.modelo.Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
        }else{
            println("Falha na autenticação")
        }
    }
}