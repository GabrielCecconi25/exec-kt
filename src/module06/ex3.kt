package module06

fun main() {
    var somaValores = 0
    var menorValor = Int.MAX_VALUE
    var totalValores = 0
    var totalPares = 0
    var continuar: String


    do {
        println("Digite um número:")
        val numero = readln().toInt()


        somaValores += numero
        totalValores++


        if (numero < menorValor) {
            menorValor = numero
        }


        if (numero % 2 == 0) {
            totalPares++
        }


        println("Deseja continuar? (S para sim, N para não)")
        continuar = readln().uppercase()

    } while (continuar == "S")


    if (totalValores > 0) {
        val mediaValores = somaValores.toDouble() / totalValores
        println("Somatório dos valores: $somaValores")
        println("Menor valor digitado: $menorValor")
        println("Média dos valores: %.2f".format(mediaValores))
        println("Quantidade de valores pares: $totalPares")
    } else {
        println("Nenhum valor foi digitado.")
    }
}
