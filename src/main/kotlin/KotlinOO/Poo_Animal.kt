package KotlinOO

import javax.print.attribute.standard.PrinterLocation

fun main() {
    val pessoa = Pessoa()
    pessoa.respirar()
    val animal= Animal()
    animal.respirar()
}

open class Animal {
    open fun respirar(){
        println("Respirando como um animal")
    }

}

class Pessoa : Animal(){
    override fun respirar(){
        println("Respirando como uma pessoa")
    }

}
