/*
Crie um programa que leia sexo e peso de 8 pessoas,
usando a estrutura “para”. No final, mostre na tela:
• Quantas mulheres foram cadastradas
• Quantos homens pesam mais de 100Kg
• A média de peso entre as mulheres
• O maior peso entre os homens
 */

class Cadastro {
    private val sexos = mutableListOf<String>()
    private val pesos = mutableListOf<Double>()

    fun cadastrarPessoas() {
        for (i in 1..8) {
            print("Digite o sexo (M/F) da pessoa $i: ")
            val sexo = readln().uppercase()
            sexos.add(sexo)

            print("Digite o peso (kg) da pessoa $i: ")
            val peso = readln().toDouble()
            pesos.add(peso)
        }
    }

    fun analisarDados() {
        var qtdMulheres = 0
        var somaPesoMulheres = 0.0
        var qtdHomensAcima100Kg = 0
        var maiorPesoHomem = 0.0

        for (i in sexos.indices) {
            if (sexos[i] == "F") {
                qtdMulheres++
                somaPesoMulheres += pesos[i]
            } else if (sexos[i] == "M") {
                if (pesos[i] > 100) {
                    qtdHomensAcima100Kg++
                }
                if (pesos[i] > maiorPesoHomem) {
                    maiorPesoHomem = pesos[i]
                }
            }
        }

        val mediaPesoMulheres = if (qtdMulheres > 0) somaPesoMulheres / qtdMulheres else 0.0

        println("\nResultados:")
        println("Quantidade de mulheres cadastradas: $qtdMulheres")
        println("Homens com mais de 100Kg: $qtdHomensAcima100Kg")
        println("Média de peso entre as mulheres: %.2f kg".format(mediaPesoMulheres))
        println("Maior peso entre os homens: %.2f kg".format(maiorPesoHomem))
    }
}

fun main() {
    val cadastro = Cadastro()
    cadastro.cadastrarPessoas()
    cadastro.analisarDados()
}
