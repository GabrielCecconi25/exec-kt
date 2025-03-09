for (i in 1..10) {
    print("Digite a idade da $i° pessoa: ")
    val idade = readLine()?.toIntOrNull() ?: 0

    somaIdades += idade

    if (idade > maiorIdade) {
        maiorIdade = idade
    }

    if (idade > 18) {
        pessoasMaisDe18++
    }

    if (idade < 5) {
        pessoasMenosDe5++
    }
}

val mediaIdades = somaIdades / 10.0

println("Média de idade do grupo: $mediaIdades")
println("Número de pessoas com mais de 18 anos: $pessoasMaisDe18")
println("Número de pessoas com menos de 5 anos: $pessoasMenosDe5")
println("A maior idade lida foi: $maiorIdade")
}