package modulo02

/**
 * Numa promoção exclusiva para o Dia da Mulher, uma loja quer
 * dar descontos para todos, mas especialmente para mulheres. Faça
 * um programa que leia nome, sexo e o valor das compras do cliente
 * e calcule o preço com desconto. Sabendo que:
 * • Homens ganham 5% de desconto
 * • Mulheres ganham 13% de desconto
 */

fun main() {

    println("Digite o nome: ")
    val nome = readln()

    println("Digite o sexo (M/F): ")
    val sexo = readln()

    println("Digite o valor: ")
    val valor = readln().toDouble()

    val desconto = when (sexo) {
        "M" -> 0.05
        "F" -> 0.13
        else -> 0.0
    }

    val precoComDesconto = valor - (valor * desconto)
    val precofinal = String.format("%.2f", precoComDesconto)
    println("O preço com desconto é: $precofinal")
}
