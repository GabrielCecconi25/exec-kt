//Faça um algoritmo que leia a nota de 10 alunos de uma turma e
//guarde-as em um vetor. No final, mostre:
//• Qual é a média da turma
//• Quantos alunos estão acima da média da turma
//• Qual foi a maior nota digitada
//• Em que posições a maior nota aparece

fun main() {
    val notas = DoubleArray(10)

    println("Digite as notas de 10 alunos:")

    for (i in notas.indices) {
        print("Digite a nota do aluno ${i + 1}: ")
        notas[i] = readLine()?.toDoubleOrNull() ?: 0.0
    }

    val mediaTurma = notas.average()

    val alunosAcimaDaMedia = notas.count { it > mediaTurma }

    val maiorNota = notas.maxOrNull() ?: 0.0

    val posicoesMaiorNota = mutableListOf<Int>()
    for (i in notas.indices) {
        if (notas[i] == maiorNota) {
            posicoesMaiorNota.add(i)
        }
    }

    println("\nMédia da turma: %.2f".format(mediaTurma))
    println("Quantidade de alunos acima da média: $alunosAcimaDaMedia")
    println("A maior nota digitada foi: %.2f".format(maiorNota))
    println("A maior nota apareceu nas posições: ${posicoesMaiorNota.joinToString()}")
}
