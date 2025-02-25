package modulo02

/**
 * Escreva um programa que pergunte a velocidade de um carro.
 * Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário
 * foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por
 * cada Km acima da velocidade permitida.
 */

fun main() {

    println("Digite a velocidade do carro: ")
    val velocidade = readln().toInt()
    val velocidadePermitida = 80

    if (velocidade > velocidadePermitida){
        val multa = (velocidade - velocidadePermitida) * 5
        println("O carro foi multado. O valor da multa é de R$$multa")
    }
}
