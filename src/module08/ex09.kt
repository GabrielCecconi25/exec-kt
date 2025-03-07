//Desenvolva um programa que leia 10 números inteiros e guarde-os
//em um vetor. No final, mostre quais são os números pares que foram
//digitados e em que posições eles estão armazenados.

fun main() {
    val numeros = IntArray(10)

    println("Digite 10 números inteiros:")

    for (i in 0 until 10) {
        print("Digite o número ${i + 1}: ")
        numeros[i] = readLine()?.toIntOrNull() ?: 0
    }

    println("\nNúmeros pares e suas posições:")
    for (i in numeros.indices) {
        if (numeros[i] % 2 == 0) {
            println("Número ${numeros[i]} encontrado na posição $i")
        }
    }
}
