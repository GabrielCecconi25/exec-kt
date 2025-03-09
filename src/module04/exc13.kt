import kotlin.random.Random

fun main() {
    val numerosSorteados = mutableListOf<Int>()

    for (i in 1..20) {
        val numero = Random.nextInt(0, 11)
        numerosSorteados.add(numero)
    }

    println("Números sorteados: ${numerosSorteados.joinToString(" ")}")

    val acimaDeCinco = numerosSorteados.count { it > 5 }
    println("Quantidade de números acima de 5: $acimaDeCinco")

    val divisiveisPorTres = numerosSorteados.count { it % 3 == 0 }
    println("Quantidade de números divisíveis por 3: $divisiveisPorTres")
}