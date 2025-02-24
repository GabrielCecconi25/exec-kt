package module09

fun main() {
    Contador(1, 10, 6)
}

fun Contador (ini: Int, end: Int, r: Int) {
    var count = ini

    while (count <= end) {
        print("${count} >> ")
        count += r
    }
    print("FIM")
}