package module05

fun main() {
    var nomePessoaMaisVelha = ""
    var idadePessoaMaisVelha = 0
    var nomeMulherMaisJovem = ""
    var idadeMulherMaisJovem = Int.MAX_VALUE
    var somaIdades = 0
    var totalPessoas = 0
    var totalHomensAcimaDe30 = 0
    var totalMulheresAbaixoDe18 = 0
    var continuar: String

    do {

        println("Digite o nome da pessoa:")
        val nome = readln()

        println("Digite a idade da pessoa:")
        val idade = readln().toInt()

        println("Digite o sexo da pessoa (M para masculino, F para feminino):")
        val sexo = readln().uppercase()

        if (idade > idadePessoaMaisVelha) {
            idadePessoaMaisVelha = idade
            nomePessoaMaisVelha = nome
        }

        if (sexo == "F" && idade < idadeMulherMaisJovem) {
            idadeMulherMaisJovem = idade
            nomeMulherMaisJovem = nome
        }

        somaIdades += idade
        totalPessoas++

        if (sexo == "M" && idade > 30) {
            totalHomensAcimaDe30++
        }

        if (sexo == "F" && idade < 18) {
            totalMulheresAbaixoDe18++
        }

        println("Deseja cadastrar outra pessoa? (S para sim, N para não)")
        continuar = readln().uppercase()

    } while (continuar == "S")

    println("Nome da pessoa mais velha: $nomePessoaMaisVelha")
    if (nomeMulherMaisJovem.isNotEmpty()) {
        println("Nome da mulher mais jovem: $nomeMulherMaisJovem")
    } else {
        println("Nenhuma mulher foi cadastrada.")
    }

    if (totalPessoas > 0) {
        val mediaIdades = somaIdades.toDouble() / totalPessoas
        println("Média de idade do grupo: %.2f".format(mediaIdades))
    } else {
        println("Nenhuma pessoa foi cadastrada.")
    }

    println("Quantos homens têm mais de 30 anos: $totalHomensAcimaDe30")
    println("Quantas mulheres têm menos de 18 anos: $totalMulheresAbaixoDe18")
}
