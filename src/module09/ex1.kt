package module09

fun main() {
    Gerador("Olá mundos")

}

fun Gerador(linha: String): Unit {
    val outline: String = "-+".repeat(linha.length/2*2)
    val message: String = "${" ".repeat(linha.length/2)}$linha${" ".repeat(linha.length/2)}"
    if (linha.length%2 == 1) {
        println("$outline-")
        println(message)
        println("$outline-")
    } else {
        println(outline)
        println(message)
        println(outline)
    }
}