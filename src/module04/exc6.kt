fun main() {
    for (contador in 30 downTo 1) {
        if (contador % 4 == 0) {
            print("[$contador] ")
        } else {
            print("$contador ")
        }
    }
    println("...")
}
