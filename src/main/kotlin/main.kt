fun main(){
    val Lucas = Funcionario(
        nome = "Lucas Ramon",
        cpf = "789.456.123-28",
        salario = 1000.00
    )

    println("Nome: ${Lucas.nome}")
    println("Cpf: ${Lucas.cpf}")
    println("Salario S/Bonus: ${Lucas.salario}")
    println( println("Salario C/Bonus: ${Lucas.bonificacao()}"))

    println()
    println()


    val Aline = Gerente(
        nome = "Aline Lima",
        cpf = "123.456.789-10",
        salario = 2000.00,
        senha = 1234
    )

    println("Nome: ${Aline.nome}")
    println("Cpf: ${Aline.cpf}")
    println("Salario S/Bonus: ${Aline.salario}")
    println( println("Salario C/Bonus: ${Aline.bonificacao()}"))

    if(Aline.autenticacao(1234) == true){
        println("Autenticado com sucesso")
    }else{
        println("Senha incorreta")
    }
}
