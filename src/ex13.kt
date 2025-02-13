fun main() {
    print("Preço do produto: R$")
    val p = readln().toDouble()

    print("Preço do produto com desconto de %5 R$${String.format("%.2f", p*0.95)}")
}