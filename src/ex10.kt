fun main() {
    print("Quanto dinheiro você tem em Real? R$")
    val cart = readln().toDouble()
    println("Cotação Dolár 3.45")
    val dol = cart/3.45

    print("Você consegue comprar $${String.format("%.2f", dol)} doláres")
}