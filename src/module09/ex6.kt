package module09

fun main() {
    val n1: Int = readln().toInt()
    val n2: Int = readln().toInt()

    Maior(n1, n2)
}

fun Maior(a: Int, b: Int) {
    if (a > b) {
        print("Número: ${a} é maior")
    } else if (b > a) {
        print("Número: ${b} é maior")
    } else {
        print("Os dois valores são iguais: ${a} ${b}")
    }
}