package KotlinAlura

class contaPoupanca(
    titular: String,
    numero: Int
) : ContaTrasnferivel(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }

    }
}