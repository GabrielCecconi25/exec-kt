package modulo02

/**
 * Faça um algoritmo que pergunte a distância que um
 * passageiro deseja percorrer em Km. Calcule o preço da
 * passagem, cobrando R$0.50 por Km para viagens até 200Km e
 * R$0.45 para viagens mais longas.
 */

fun main() {

    print("Digite a distância que deseja percorrer em Km: ")
    val distancia = readLine()!!.toFloat()

    val preco = if (distancia <= 200) {
        distancia * 0.5f
    } else {
        distancia * 0.45f
    }
    println("O preço da passagem é R$$preco")
}
