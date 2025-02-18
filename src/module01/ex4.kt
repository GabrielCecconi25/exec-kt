package module01

fun main() {
    print("Escolha um número: ")
    val n1 = readln().toInt()
    print("Escolha um outro número: ")
    val n2 = readln().toInt()

    print("A soma entre $n1 e $n2 é igual a ${n1 + n2}")
}