package module09

fun main() {
    gerador4("Olá, Mundo!", 4, 1)
}

fun gerador4(linha: String, r: Int, b: Int) {


    val outline: String
    if (linha.length%2 == 1) {
        outline = "${"-+".repeat(linha.length/2*2)}-"
    } else {
        outline = "-+".repeat(linha.length/2*2)
    }
    val message= "${" ".repeat(linha.length/2)}$linha${" ".repeat(linha.length/2)}"
    println(outline)
    print("${"$message\n".repeat(r)}")
    println(outline)
}