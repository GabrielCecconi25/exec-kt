fun main() {
    print("Digite o primeiro valor: ")
    val inicio = readLine()?.toIntOrNull() ?: 0

    print("Digite o último valor: ")
    val fim = readLine()?.toIntOrNull() ?: 0

    print("Digite o incremento: ")
    val incremento = readLine()?.toIntOrNull() ?: 1

    print("Contagem: ")

    if (inicio <= fim) {
        for (i in inicio..fim step incremento) {
            print("$i ")
        }
    } else {
        for (i in inicio downTo fim step -incremento) {
            print("$i ")
        }
    }

    println("Acabou!")
}