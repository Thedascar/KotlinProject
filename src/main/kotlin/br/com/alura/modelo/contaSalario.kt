package br.com.alura.modelo

import br.com.alura.modelo.Conta

class contaSalario(
    titular: String,
    numero: Int
) : br.com.alura.modelo.Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }

    }
}