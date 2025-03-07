//Crie um programa que preencha automaticamente um vetor
//numérico com 7 números gerados aleatoriamente pelo
//computador e depois mostre os valores gerados na tela.

import kotlin.random.Random

fun main() {
    val vetor = IntArray(7)

    for (i in 0 until 7) {
        vetor[i] = Random.nextInt(1, 101)
    }

    println(vetor.joinToString(" "))
}
