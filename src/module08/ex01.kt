//Faça um programa que preencha automaticamente um vetor
//numérico com 8 posições, conforme abaixo:
//999 999 999 999 999 999 999 999
//0 1 2 3 4 5 6 7

fun main() {

    val vetor1 = IntArray(8) { 999 }

    val vetor2 = IntArray(8) { it }

    println(vetor1.joinToString(" "))
    println(vetor2.joinToString(" "))
}