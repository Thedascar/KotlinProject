package Basic

import Conta
fun main(){

    // aqui vemos uma passagem de valor por parâmetro
    // que gera uam cópia da variável
    var nota1 = 10;
    var nota2 = nota1;
    println(nota1)
    println(nota2)

    // No OO o valor é por referência ou seja apenas aponta
    // o valor

    val contaLucas = Conta();
    contaLucas.titular = "Lucas"

    val contaAline = contaLucas
    contaAline.titular = "Bacon e Bob"

    // aqui podemos ver o valor hash em memória
    println(contaLucas)
    println(contaAline)

    println(contaLucas.titular)
    println(contaAline.titular)
}