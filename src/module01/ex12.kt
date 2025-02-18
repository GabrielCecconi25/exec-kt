package module01

fun main() {
    println("Equação de segundo Grau!")
    print("Valor de A, B e C: ")
    val (a, b, c) = readln().split(" ").map {it.toDouble() }

    val delta = b*b - 4 * a * c
    print("Valor de Delta: ${delta}Δ")
}