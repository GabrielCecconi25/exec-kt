//Escreva um programa que leia 15 números e guarde-os em um
//vetor. No final, mostre o vetor inteiro na tela e em seguida
//mostre em que posições foram digitados valores que são múltiplos
//de 10.

fun main() {
    val numeros = IntArray(15)


    println("Digite 15 números:")

    for (i in 0 until 15) {
        print("Digite o número ${i + 1}: ")
        numeros[i] = readLine()?.toIntOrNull() ?: 0
    }


    println("\nVetor completo:")
    println(numeros.joinToString(" "))


    println("\nPosições com múltiplos de 10:")
    for (i in numeros.indices) {
        if (numeros[i] % 10 == 0) {
            println("Valor ${numeros[i]} encontrado na posição $i")
        }
    }
}
