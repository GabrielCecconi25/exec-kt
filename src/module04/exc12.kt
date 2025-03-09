fun main() {
    var pares = 0
    var impares = 0

    for (i in 1..6) {
        print("Digite o $i° número: ")
        val numero = readLine()?.toIntOrNull() ?: 0

        if (numero % 2 == 0) {
            pares++
        } else {
            impares++
        }
    }

    println("Quantidade de números pares: $pares")
    println("Quantidade de números ímpares: $impares")
}