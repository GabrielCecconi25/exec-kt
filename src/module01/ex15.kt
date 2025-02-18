package module01

fun main() {
    println("Locadora")
    print("Quantidade de Km percorridos: ")
    val km = readln().toDouble()
    print("Quantidade de dias: ")
    val d = readln().toInt()

    print("Valor a ser cobrado: R$${String.format("%.2f", km*0.20 + 90*d)}")
}