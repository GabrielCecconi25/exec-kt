package module06

fun main() {
    var somaIdades = 0
    var totalIdades = 0
    var pessoasCom21OuMais = 0
    var continuar: String


    do {
        println("Digite a idade da pessoa:")
        val idade = readln().toInt()

        somaIdades += idade
        totalIdades++

        if (idade >= 21) {
            pessoasCom21OuMais++
        }

        println("Deseja continuar? (S para sim, N para não)")
        continuar = readln().uppercase()

    } while (continuar == "S")


    if (totalIdades > 0) {
        val mediaIdades = somaIdades.toDouble() / totalIdades
        println("Total de idades digitadas: $totalIdades")
        println("Média das idades: %.2f".format(mediaIdades))
        println("Pessoas com 21 anos ou mais: $pessoasCom21OuMais")
    } else {
        println("Nenhuma idade foi registrada.")
    }
}
