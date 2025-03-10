/*
Desenvolva um programa usando a estrutura “para” que
mostre na tela a seguinte contagem:

100 90 80 70 60 50 40 30 20 10 0 Acabou!
 */

fun main() {
    var i = 100

    while (i >= 0) {
        print("$i ")
        i -= 10
    }
    print("Acabou!")
}
