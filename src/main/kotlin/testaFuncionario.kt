
    fun testaFuncionario2(){
       val gerente = Gerente(
           nome = "Lucas",
           cpf = "123.456.789-98",
           salario = 1000.00,
           senha = 1000
       )

        val diretora = Diretor(
            nome = "Aline",
            cpf = "789.456.123-78",
            salario = 2000.00,
            senha = 2000,
            plr = 2500.00
        )


        val sistema = SistemaInterno()
        sistema.entra(gerente,1000)
        sistema.entra(diretora,200)

    }
    fun testaFuncionario(){
        val Lucas = Analista(
            nome = "Lucas Ramon",
            cpf = "789.456.123-28",
            salario = 1000.00
        )
        println("Analista")
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

        val James = Auxiliar(
            nome = "James",
            cpf = "798.456.549-45",
            salario = 1251.45
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

        println("Auxiliar")
        println("Nome: ${James.nome}")
        println("Cpf: ${James.cpf}")
        println("Salario S/Bonus: ${James.salario}")
        println( println("Salario C/Bonus: ${James.bonificacao}"))

        println()

        val calculadora = CalculadoraBonificacao()
        calculadora.registra(Lucas)
        calculadora.registra(Aline)
        calculadora.registra(Bob)
        calculadora.registra(Bacon)
        calculadora.registra(James)
        println("Total de bonificação: ${calculadora.total}")
    }

    fun main(){
        testaFuncionario2()
    }