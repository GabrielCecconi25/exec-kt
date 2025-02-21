/**
 * DESAFIO Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
 */

import kotlin.random.Random

fun main(){

    val opcoes = listOf("Pedra","Papel", "Tesoura")
    println("Escolha um opção: Pedra, Papel ou Tesoura:")

    val escolhaJogador = readlnOrNull()?.trim()?.lowercase()?.replaceFirstChar { it.uppercaseChar() }?: ""

    if (escolhaJogador !in opcoes){
        println("Opção invalida, tente novamente")
        return
    }

    val escolhaComputador = opcoes[Random.nextInt(opcoes.size)]
    println("O computador escolheu a opção: $escolhaComputador")

    when{
        escolhaJogador == escolhaComputador -> println("Empate")
        (escolhaJogador == "Papel" && escolhaComputador == "Pedra") ||
        (escolhaJogador == "Tesoura" && escolhaComputador == "Papel") ||
        (escolhaJogador == "Pedra" && escolhaComputador == "Tesoura") -> println("Você venceu")
        else -> println("Você perdeu!!")
    }

}
