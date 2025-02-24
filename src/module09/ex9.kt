package module09

// Fibonacci Challenge

fun main() {
    fibonacciSequence(10)
}

fun fibonacciSequence (n: Int) {
    var seq1: Int = 0
    var seq2: Int = 1
    var count: Int = 1

    print("1 >> ")
    while (count != n) {
        print("${seq1 + seq2} >> ")
        seq2 += seq1
        seq1 = seq2 - seq1
        count += 1

    }
    print("FIM")
}