package module09

fun main() {
    val n1: Int = readln().toInt()
    val n2: Int = readln().toInt()

    print(somador(n1, n2))

}

fun somador(a: Int, b: Int): Int {
    return a + b
}