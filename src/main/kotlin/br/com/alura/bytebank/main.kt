package br.com.alura.bytebank


import br.com.alura.bytebank.modelo.Endereco
import kotlin.ArithmeticException

fun main() {
    println("início main")
    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    try{
        funcao2()
    } catch (e: ClassCastException){
        println("ClasssException foi pegada")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        }
    println("fim funcao2")
}


