package module10

fun main() {
    print(Maior(16, 12, 2))
}

fun Maior(a: Int, b: Int, c:Int): Int {
    if (a > b && a > c) {
        return a
    } else if (b > c) {
        return b
    } else {
        return c
    }
}