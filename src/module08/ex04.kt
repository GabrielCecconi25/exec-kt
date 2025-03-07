//Crie um programa que preencha automaticamente (usando
//lógica, não apenas atribuindo diretamente) um vetor numérico
//com 10 posições, conforme abaixo:
//5 3 5 3 5 3 5 3 5 3
//0 1 2 3 4 5 6 7 8 9

fun main() {
    val vetor1 = IntArray(10)

    val vetor2 = IntArray(10)

    for (i in 0 until 10) {
        vetor1[i] = if (i % 2 == 0) 5 else 3
    }

    for (i in 0 until 10) {
        vetor2[i] = i
    }

    println(vetor1.joinToString(" "))
    println(vetor2.joinToString(" "))
}
