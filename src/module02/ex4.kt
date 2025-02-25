package modulo02

/**
 * Desenvolva um programa que leia um número inteiro e mostre se
 * ele é PAR ou ÍMPAR.
 */

fun main() {
    print("Digite um número: ")
    val num = readLine()!!.toInt()

    if (num % 2 == 0) {
        println("$num é par")
    } else {
        println("$num é impar")
    }
}
