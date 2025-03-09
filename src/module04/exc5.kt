fun main() {
    print("Digite um valor: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null && numero > 0) {
        print("Contagem: ")
        for (i in 1..numero) {
            print("$i ")
        }
        println("Acabou!")
    } else {
        println("Por favor, digite um número válido e positivo.")
    }
}
