// Teste para loop for...
//  for (i in 5 downTo 1 step 3){
//      println(i)
//}

// Teste com laço while
//var i = 0
//  while(i <= 5) {
//      println("Contador $i")
//      i++
//}
// Podemos parar um loop for com break e continue
//  loop@ for (i in 1..10){
//      println("i $i")
//          for (j in 1..10){
//              println("j $j")
//          if (j == 5) break@loop
//      }
//  }

// usando a estrutura when..
//when{
//   saldo > 0.0 -> println("Conta Positiva")
//  saldo == 0.0 -> println("Conta Neutra")
//   else -> println("Conta Negativa")
// }
    fun testaCondicoes(saldo : Double) {

        if (saldo > 0.0) {
            println("Conta Positiva")
        } else if (saldo == 0.0) {
            println("Conta Neutra")
        } else {
            println("Conta Negativa")
        }
    }
fun main() {

    println("Hello, Seja Bem Vindo(a) ao ByteBank")

    val titular = "Lucas Ramon"
    val numeroConta = 1758
    var saldo = 375.48
    testaCondicoes(saldo)

    println("Sr(a) $titular sua agência é $numeroConta com saldo de $saldo")
}