//[DESAFIO] Crie uma lógica que preencha um vetor de 20 posições
//com números aleatórios (entre 0 e 99) gerados pelo computador.
//Logo em seguida, mostre os números gerados e depois coloque o
//vetor em ordem crescente, mostrando no final os valores ordenados.

import kotlin.random.Random

fun main() {
    val vetor = IntArray(20)

    for (i in vetor.indices) {
        vetor[i] = Random.nextInt(0, 100)
    }

    println(vetor.joinToString(" "))

    vetor.sort()

    println(vetor.joinToString(" "))
}
