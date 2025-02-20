package module09

fun main() {
    gerador4("Olá, Mundo!", 4, 4)
}

fun gerador4(linha: String, r: Int, b: Int) {
    var outline: String

    outline = geradorLinha(linha, b)

    val message = "${" ".repeat(linha.length/2)}$linha${" ".repeat(linha.length/2)}"
    println(outline)
    print("${"$message\n".repeat(r)}")
    println(outline)
}

fun geradorLinha(linha: String, b: Int): String {
    var outline = ""
    when (b) {
        1 -> outline =  "${"-+".repeat(linha.length/2)}${"=".repeat(linha.length)}${"+-".repeat(linha.length/2)}"
        2 -> outline = "${"~".repeat(linha.length/2-1)}${":".repeat(linha.length+2)}${"~".repeat(linha.length/2-1)}"
        3 -> outline = "+${"-".repeat(linha.length/2-2)}${"=".repeat(linha.length+2)}${"-".repeat(linha.length/2-2)}+"
        else -> print("Só temos 3 tipos de linhas, escolher de 1 a 3")
    }

    return outline

}