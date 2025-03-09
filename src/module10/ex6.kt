package module10

fun main() {
    var med = Media2(2.0, 7.0)
    println(Situacao(med))
}

fun Media2(a: Double, b: Double): Double {
    return (a + b) / 2
}

fun Situacao(a: Double): String {
    if (a >= 7) {
        return "APROVADO"
    } else if (a >= 5){
        return "RECUPERAÇÃO"
    } else {
        return "REPROVADO"
    }
}