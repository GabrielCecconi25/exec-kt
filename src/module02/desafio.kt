package modulo02

/**
 * Crie um programa que leia o tamanho de três segmentos
 * de reta. Analise seus comprimentos e diga se é possível formar um
 * triângulo com essas retas. Matematicamente, para três segmentos
 * formarem um triângulo, o comprimento de cada lado deve ser menor
 * que a soma dos outros dois.
 */

fun main() {

    println("Informe o tamanho do primiero lado: ")
    val lado1 = readln().toInt()

    println("Informe o tamanho do segundo lado: ")
    val lado2 = readln().toInt()

    println("Informe o tamanho do terceiro lado: ")
    val lado3 = readln().toInt()

    if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
        println("Os lados formam um triângulo")
    } else {
        println("Os lados não formam um triângulo")
    }
}
