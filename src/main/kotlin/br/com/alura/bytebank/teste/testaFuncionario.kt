package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco


fun testaFuncionario2(){

       val enderecoNovo = Endereco("R janaina")
       val gerente = br.com.alura.bytebank.modelo.Gerente(
           nome = "Lucas",
           cpf = "123.456.789-98",
           salario = 1000.00,
           senha = 1000,
       )

        val diretora = br.com.alura.bytebank.modelo.Diretor(
            nome = "Aline",
            cpf = "789.456.123-78",
            salario = 2000.00,
            senha = 2000,
            plr = 2500.00
        )

        val cliente = br.com.alura.bytebank.modelo.Cliente(
            nome = "José",
            cpf = "456.789.123-45",
            senha = 1000,
            endereco = enderecoNovo
        )


        val sistema = br.com.alura.bytebank.modelo.SistemaInterno()
        sistema.entra(gerente,1000)
        sistema.entra(diretora,200)
        sistema.entra(cliente,1000)
        println(cliente.endereco)



    }
    fun testaFuncionario(){
        val Lucas = br.com.alura.bytebank.modelo.Analista(
            nome = "Lucas Ramon",
            cpf = "789.456.123-28",
            salario = 1000.00
        )
        println("KotlinAlura.modelo.Analista")
        println("Nome: ${Lucas.nome}")
        println("Cpf: ${Lucas.cpf}")
        println("Salario S/Bonus: ${Lucas.salario}")
        println( println("Salario C/Bonus: ${Lucas.bonificacao}"))

        println()

        val Aline = br.com.alura.bytebank.modelo.Gerente(
            nome = "Aline Lima",
            cpf = "123.456.789-10",
            salario = 2000.00,
            senha = 1234
        )

        println("KotlinAlura.modelo.Gerente")
        println("Nome: ${Aline.nome}")
        println("Cpf: ${Aline.cpf}")
        println("Salario S/Bonus: ${Aline.salario}")
        println( println("Salario C/Bonus: ${Aline.bonificacao}"))

        if(Aline.autentica(1234) == true){
            println("Autenticado com sucesso")
        }else{
            println("Senha incorreta")
        }

        println()

        val Bob = br.com.alura.bytebank.modelo.Diretor(
            nome = "Bob",
            cpf = "498.498.645-58",
            salario = 10000.00,
            senha = 4321,
            plr = 2580.87
        )

        val James = br.com.alura.bytebank.modelo.Auxiliar(
            nome = "James",
            cpf = "798.456.549-45",
            salario = 1251.45
        )

        println("KotlinAlura.modelo.Diretor")
        println("Nome: ${Bob.nome}")
        println("Cpf: ${Bob.cpf}")
        println("Salario S/Bonus: ${Bob.salario}")
        println( println("Salario C/Bonus: ${Bob.bonificacao}"))
        println("Bonus plr ${Bob.plr}")

        if(Bob.autentica(4321) == true){
            println("Autenticado com sucesso")
        }else{
            println("Senha incorreta")
        }

        println()

        val Bacon = br.com.alura.bytebank.modelo.Analista(
            nome = "Bacon",
            cpf = "597.628.489.35",
            salario = 4000.00
        )

        println("KotlinAlura.modelo.Analista")
        println("Nome: ${Bacon.nome}")
        println("Cpf: ${Bacon.cpf}")
        println("Salario S/Bonus: ${Bacon.salario}")
        println( println("Salario C/Bonus: ${Bacon.bonificacao}"))

        println()

        println("KotlinAlura.modelo.Auxiliar")
        println("Nome: ${James.nome}")
        println("Cpf: ${James.cpf}")
        println("Salario S/Bonus: ${James.salario}")
        println( println("Salario C/Bonus: ${James.bonificacao}"))

        println()

        val calculadora = br.com.alura.bytebank.modelo.CalculadoraBonificacao()
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