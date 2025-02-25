package modulo02

/**
 * Crie um algoritmo que leia o nome e as duas notas de um aluno,
 * calcule a sua média e mostre na tela. No final, analise a média e
 * mostre se o aluno teve ou não um bom aproveitamento (se ficou acima
 * da média 7.0).
 */

fun main() {

    println("Digite seu nome: ")
    val nome = readLine()!!

    println("Digite a primeira nota: ")
    val nota1 = readLine()!!.toDouble()

    println("Digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()

    val media = (nota1 + nota2) / 2

    if (media >= 7.0) {
        println("Aluno $nome, teve um bom aproveitamento com média $media")
    } else {
        println("Aluno $nome, não teve um bom aproveitamento com média $media")
    }
}
