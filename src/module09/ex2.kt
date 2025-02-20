package module09

fun main() {
    gerador2("Olá mundos")

}

fun gerador2(linha: String) {
    val outline: String = "-+".repeat(linha.length/2*2)
    val message= "${" ".repeat(linha.length/2)}$linha${" ".repeat(linha.length/2)}"
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