package modulo02

/**
 * Faça um algoritmo que leia um determinado ano e mostre se
 * ele é ou não BISSEXTO.
 */

fun main() {

    println("Digite um ano: ")
    val ano = readLine()!!.toInt()

    if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
        println("O ano $ano é bissexto")
    } else {
        println("O ano $ano não é bissexto")
    }
}
