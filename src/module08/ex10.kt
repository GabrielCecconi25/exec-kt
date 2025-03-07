//Faça um algoritmo que preencha um vetor de 30 posições com
//números entre 1 e
//15 sorteados pelo computador. Depois disso, peça para o usuário
//digitar um número (chave) e seu programa deve mostrar em que
//posições essa chave foi encontrada. Mostre também quantas vezes a
//chave foi sorteada.

import kotlin.random.Random

fun main() {
    val vetor = IntArray(30)

    for (i in vetor.indices) {
        vetor[i] = Random.nextInt(1, 16)
    }

    println("Vetor gerado aleatoriamente:")
    println(vetor.joinToString(" "))

    print("\nDigite a chave (número entre 1 e 15) que deseja procurar: ")
    val chave = readLine()?.toIntOrNull() ?: return

    var count = 0

    println("\nPosições onde a chave $chave foi encontrada:")
    for (i in vetor.indices) {
        if (vetor[i] == chave) {
            println("Chave encontrada na posição $i")
            count++
        }
    }

    if (count > 0) {
        println("\nA chave $chave foi sorteada $count vezes.")
    } else {
        println("\nA chave $chave não foi encontrada no vetor.")
    }
}
