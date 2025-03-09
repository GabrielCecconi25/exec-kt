fun main() {
    var maiorPreco = Double.MIN_VALUE
    var menorPreco = Double.MAX_VALUE

    for (i in 1..8) {
        print("Digite o preço do $i° produto: ")
        val preco = readLine()?.toDoubleOrNull() ?: 0.0

        if (preco > maiorPreco) {
            maiorPreco = preco
        }

        if (preco < menorPreco) {
            menorPreco = preco
        }
    }

    println("O maior preço é: R$ $maiorPreco")
    println("O menor preço é: R$ $menorPreco")
}