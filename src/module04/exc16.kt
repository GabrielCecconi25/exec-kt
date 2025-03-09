fun main() {
    var somaIdadesGrupo = 0
    var somaIdadesHomens = 0
    var totalHomens = 0
    var totalMulheres = 0
    var mulheresMaisDe20 = 0

    for (i in 1..5) {
        print("Digite a idade da ${i}° pessoa: ")
        val idade = readLine()?.toIntOrNull() ?: 0

        print("Digite o sexo da ${i}° pessoa (M para masculino, F para feminino): ")
        val sexo = readLine()?.uppercase()

        somaIdadesGrupo += idade

        if (sexo == "M") {
            totalHomens++
            somaIdadesHomens += idade
        } else if (sexo == "F") {
            totalMulheres++
            if (idade > 20) mulheresMaisDe20++
        }
    }

    val mediaIdadesGrupo = somaIdadesGrupo / 5.0

    val mediaIdadesHomens = if (totalHomens > 0) somaIdadesHomens / totalHomens.toDouble() else 0.0

    println("Quantidade de homens cadastrados: $totalHomens")
    println("Quantidade de mulheres cadastradas: $totalMulheres")
    println("Média de idade do grupo: $mediaIdadesGrupo")
    println("Média de idade dos homens: $mediaIdadesHomens")
    println("Número de mulheres com mais de 20 anos: $mulheresMaisDe20")
}