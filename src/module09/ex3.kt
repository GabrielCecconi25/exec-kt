package module09

fun main() {
    gerador3("Olá, Mundo!", 4)
}

fun gerador3(linha: String, n: Int) {
    val outline: String
    if (linha.length%2 == 1) {
        outline = "${"-+".repeat(linha.length/2*2)}-"
    } else {
        outline = "-+".repeat(linha.length/2*2)
    }
    val message= "${" ".repeat(linha.length/2)}$linha${" ".repeat(linha.length/2)}"
    println(outline)
    print("${"$message\n".repeat(n)}")
    println(outline)
}