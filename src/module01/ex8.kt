package module01

fun main() {
    print("Digite um número real: ")
    val nr = readln().toDouble()

    println("O dobro de $nr é ${nr * 2}")
    print("A terça parte de $nr é ${nr / 3}")
}