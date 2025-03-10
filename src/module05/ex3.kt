package module05

fun main() {
    var totalAlunos = 0
    var somaIdades = 0
    var idade: Int

    while (true) {
        println("Digite a idade do aluno (ou 999 para encerrar):")
        idade = readln().toInt()

        if (idade == 999) {
            break
        }

        totalAlunos++
        somaIdades += idade
    }

    if (totalAlunos > 0) {
        val mediaIdade = somaIdades.toDouble() / totalAlunos
        println("Total de alunos na turma: $totalAlunos")
        println("Média de idade: %.2f".format(mediaIdade))
    } else {
        println("Nenhum aluno foi registrado.")
    }
}
