fun main() {
    var soma = 0

    for (i in 1..7) {
        print("Digite o $i° número: ")
        val numero = readLine()?.toIntOrNull() ?: 0
        soma += numero
    }

    println("O somatório dos números é: $soma")
}
