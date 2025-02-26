package module10

fun main() {
    println(Potencia(5, 0))
}

fun Potencia(b: Int, e: Int): Int {
    var c: Int = 1
    if (e == 0) {
        return 1
    }
    for (i in 1..e) {
        c *= b
    }
    return c
}