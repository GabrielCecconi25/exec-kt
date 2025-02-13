fun main() {
    print("Quantos dias trabalhados? ")
    val d = readln().toDouble()

    print("Salário: R$${String.format("%.2f", 8 * d * 25)}")
}