//Crie um programa que leia a idade de 8 pessoas e guarde-as em
//um vetor. No final, mostre:
//• Qual é a média de idade das pessoas cadastradas
//• Em quais posições temos pessoas com mais de 25 anos
//• Qual foi a maior idade digitada (podem haver repetições)
//• Em que posições digitamos a maior idade

fun main() {
    val idades = IntArray(8)

    println("Digite a idade de 8 pessoas:")

    for (i in 0 until 8) {
        print("Digite a idade da pessoa ${i + 1}: ")
        idades[i] = readLine()?.toIntOrNull() ?: 0
    }

    val mediaIdade = idades.average()

    val pessoasComMaisDe25 = mutableListOf<Int>()
    for (i in idades.indices) {
        if (idades[i] > 25) {
            pessoasComMaisDe25.add(i)
        }
    }

    val maiorIdade = idades.maxOrNull() ?: 0

    val posicoesMaiorIdade = mutableListOf<Int>()
    for (i in idades.indices) {
        if (idades[i] == maiorIdade) {
            posicoesMaiorIdade.add(i)
        }
    }

    println("\nMédia de idade: %.2f".format(mediaIdade))
    println("Pessoas com mais de 25 anos estão nas posições: ${pessoasComMaisDe25.joinToString()}")
    println("A maior idade digitada foi: $maiorIdade")
    println("A maior idade foi digitada nas posições: ${posicoesMaiorIdade.joinToString()}")
}
