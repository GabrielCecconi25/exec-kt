fun main() {
    println("Redução do tempo de vida de um fumante!")
    print("Quantidade de cigarros fumados por dia: ")
    val cig = readln().toInt()
    print("Quantidade de anos que já fumou: ")
    var anos = readln().toInt()
    var dias: Double = (cig*10*365*anos /60 /24).toDouble()

    println("Você perdeu ${String.format("%.0f", dias)} dias da sua vida")
}