/*
[DESAFIO] Desenvolva um programa que leia o primeiro termo e a
razão de uma PA (Progressão Aritmética), mostrando na tela os 10
primeiros elementos da PA e a soma entre todos os valores da
sequência.
*/

fun main() {
    print("Digite o primeiro termo da PA: ")
    val primeiroTermo = readln().toInt()

    print("Digite a razão da PA: ")
    val razao = readln().toInt()

    var soma = 0

    println("\nOs 10 primeiros termos da PA são:")
    for (i in 0 until 10) {
        val termo = primeiroTermo + i * razao
        print("$termo ")
        soma += termo
    }

    println("\nA soma dos termos da PA é: $soma")
}