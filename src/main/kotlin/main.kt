fun main(){
    val Lucas = Funcionario(
        nome = "Lucas Ramon",
        cpf = "789.456.123-28",
        salario = 1000.00
    )
    println("Funcionário")
    println("Nome: ${Lucas.nome}")
    println("Cpf: ${Lucas.cpf}")
    println("Salario S/Bonus: ${Lucas.salario}")
    println( println("Salario C/Bonus: ${Lucas.bonificacao}"))

    println()

    val Aline = Gerente(
        nome = "Aline Lima",
        cpf = "123.456.789-10",
        salario = 2000.00,
        senha = 1234
    )

    println("Gerente")
    println("Nome: ${Aline.nome}")
    println("Cpf: ${Aline.cpf}")
    println("Salario S/Bonus: ${Aline.salario}")
    println( println("Salario C/Bonus: ${Aline.bonificacao}"))

    if(Aline.autenticacao(1234) == true){
        println("Autenticado com sucesso")
    }else{
        println("Senha incorreta")
    }

    println()

    val Bob = Diretor(
        nome = "Bob",
        cpf = "498.498.645-58",
        salario = 10000.00,
        senha = 4321,
        plr = 2580.87
    )

    println("Diretor")
    println("Nome: ${Bob.nome}")
    println("Cpf: ${Bob.cpf}")
    println("Salario S/Bonus: ${Bob.salario}")
    println( println("Salario C/Bonus: ${Bob.bonificacao}"))
    println("Bonus plr ${Bob.plr}")

    if(Bob.autenticacao(4321) == true){
        println("Autenticado com sucesso")
    }else{
        println("Senha incorreta")
    }

    println()

    val Bacon = Analista(
        nome = "Bacon",
        cpf = "597.628.489.35",
        salario = 4000.00
    )

    println("Analista")
    println("Nome: ${Bacon.nome}")
    println("Cpf: ${Bacon.cpf}")
    println("Salario S/Bonus: ${Bacon.salario}")
    println( println("Salario C/Bonus: ${Bacon.bonificacao}"))

    println()

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(Lucas)
    calculadora.registra(Aline)
    calculadora.registra(Bob)
    calculadora.registra(Bacon)
    println("Total de bonificação: ${calculadora.total}")
}
