package module09

fun main() {
    val n1: Int = readln().toInt()

    ParOuImpar(n1)
}

fun ParOuImpar(a: Int) {
    if (a % 2 == 0) {
        print("O valor é par")
    } else {
        print("O valor é impar")
    }
}