package module10

fun main() {
    print(SuperSomador(1, 5))
}

fun SuperSomador(a: Int, b: Int): Int {
    var count: Int = 0
    for (n in a..b) {
        count += n
    }
    return count
}