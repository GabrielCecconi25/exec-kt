/**
 * Crie um jogo onde o computador vai sortear um número
 * entre 1 e 5 o jogador vai tentar descobrir qual foi o valor
 * sorteado.
 */

import kotlin.random.Random


fun main(){
    val numeroSorteado = Random.nextInt(1,6)
    println("Digite um numero entre 1..5:")
    val jogador = readln().toInt()

    if (jogador > 5){
        println("Número invalido, pois foi maior que cinco")

    }else if(jogador == numeroSorteado){
        println("Você acertou!!!")
        println("O número sorteado foi: $numeroSorteado")

    }else{
        println("Você errou!, o número sorteado foi: $numeroSorteado")
    }
}
