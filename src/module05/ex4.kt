package module05

fun main() {
    var maiorIdade = 0
    var homensCadastrados = 0
    var somaIdadesHomens = 0
    var idadeMulherMaisJovem = Int.MAX_VALUE
    var totalHomens = 0
    var continuar: String

    do {
        println("Digite o sexo da pessoa (M para masculino, F para feminino):")
        val sexo = readln().uppercase()

        println("Digite a idade da pessoa:")
        val idade = readln().toInt()


        if (idade > maiorIdade) {
            maiorIdade = idade
        }


        if (sexo == "M") {
            homensCadastrados++
            somaIdadesHomens += idade
            totalHomens++
        } else if (sexo == "F") {

            if (idade < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idade
            }
        }


        println("Deseja cadastrar outra pessoa? (S para sim, N para não)")
        continuar = readln().uppercase()

    } while (continuar == "S")


    println("Maior idade lida: $maiorIdade")
    println("Quantidade de homens cadastrados: $homensCadastrados")


    if (idadeMulherMaisJovem != Int.MAX_VALUE) {
        println("Idade da mulher mais jovem: $idadeMulherMaisJovem")
    } else {
        println("Nenhuma mulher foi cadastrada.")
    }


    if (totalHomens > 0) {
        val mediaIdadeHomens = somaIdadesHomens.toDouble() / totalHomens
        println("Média de idade entre os homens: %.2f".format(mediaIdadeHomens))
    } else {
        println("Nenhum homem foi cadastrado.")
    }
}
