//Faça um programa que leia 7 nomes de pessoas e guarde-os em
//um vetor. No final, mostre uma listagem com todos os nomes
//informados, na ordem inversa daquela em que eles foram
//informados.


fun main() {
    val nomes = Array(7) { "" }

    println("Digite 7 nomes:")

    for (i in 0 until 7) {
        print("Digite o nome ${i + 1}: ")
        nomes[i] = readLine() ?: ""
    }

    println("\nNomes na ordem inversa:")
    for (i in 6 downTo 0) {
        println(nomes[i])
    }
}
