/*[DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de
mostrar que tipo de triângulo será formado:
• EQUILÁTERO: todos os lados iguais
• ISÓSCELES: dois lados iguais
• ESCALENO: todos os lados diferentes*/

fun main() {
    println("Digite o comprimento do primeiro segmento:")
    val a = readln().toDouble()
    println("Digite o comprimento do segundo segmento:")
    val b = readln().toDouble()
    println("Digite o comprimento do terceiro segmento:")
    val c = readln().toDouble()

    if (a + b > c && b + c > a && c + a > b) {
        if (a == b && b == c) {
            println("O triângulo é EQUILÁTERO: todos os lados iguais.")
        } else if (a == b || b == c || c == a) {
            println("O triângulo é ISÓSCELES: dois lados iguais.")
        } else {
            println("O triângulo é ESCALENO: todos os lados diferentes.")
        }
    } else {
        println("Não é possível formar um triângulo com esses segmentos.")
    }
}
