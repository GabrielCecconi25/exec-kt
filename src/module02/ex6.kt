package modulo02

/**
 * Escreva um programa que leia o ano de nascimento de um rapaz e
 * mostre a sua situação em relação ao alistamento militar.
 * • Se estiver antes dos 18 anos, mostre em quantos anos
 * faltam para o alistamento.
 * • Se já tiver depois dos 18 anos, mostre quantos anos já
 * se passaram do alistamento.
 */

fun main() {

    println("Digite seu ano de nascimento: ")
    val anoNascimento = readLine()!!.toInt()
    val idade = 2025 - anoNascimento

    if (idade < 18) {
        println("Falta ${18 - idade} anos para o alistamento")
    } else {
        println("Ja passou ${idade - 18} anos do alistamento")
    }
}
