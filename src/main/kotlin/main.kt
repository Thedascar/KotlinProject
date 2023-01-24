fun main(){
    val Lucas = Funcionario(
        nome = "Lucas Ramon",
        cpf = "789.456.123-28",
        salario = 1000.00,
        tipo = 0
    )

    println("Nome: ${Lucas.nome}")
    println("Cpf: ${Lucas.cpf}")
    println("Salario S/Bonus: ${Lucas.salario}")
    println( println("Salario C/Bonus: ${Lucas.bonificacao()}"))
}