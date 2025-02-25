package modulo02

/**
 * Faça um programa que leia o ano de nascimento de uma pessoa,
 * calcule a idade dela e depois mostre se ela pode ou não votar.
 */

fun main() {

    println("Digite o ano de nascimento: ")
    val anoNascimento = readLine()!!.toInt()

    val idade = 2025 - anoNascimento
    if (idade >= 16) {
        println("Você pode votar")
    } else {
        println("Você nâo pode votar")
    }
}
