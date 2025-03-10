/*
[DESAFIO] Faça um programa que mostre os 10 primeiros elementos
da Sequência de Fibonacci:

1 1 2 3 5 8 13 21...
*/

fun main() {
    val termos = 10
    var primeiro = 1
    var segundo = 1

    print("Os 10 primeiros termos da sequência de Fibonacci:\n$primeiro $segundo ")

    for (i in 3..termos) {
        val proximo = primeiro + segundo
        print("$proximo ")
        primeiro = segundo
        segundo = proximo
    }
}
