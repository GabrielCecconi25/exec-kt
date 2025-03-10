package module05

fun main() {
    var soma = 0

    while (true) {
        println("Digite um número (1111 para parar):")
        val numero = readln().toInt()

        if (numero == 1111) {
            break
        }

        soma += numero
    }

    println("A soma dos números digitados é: $soma")
}
