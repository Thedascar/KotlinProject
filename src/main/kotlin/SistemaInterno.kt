class SistemaInterno {

    fun entra(admin: FuncionarioAdmin,senha: Int){
        if(admin.autenticacao(senha)){
            println("Bem vido ao Bytebank")
        }else{
            println("Falha na autenticação")
        }
    }
}