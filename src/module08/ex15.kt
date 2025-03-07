//Faça um algoritmo que leia o nome, o sexo e o salário de 5
//funcionários e guarde esses dados em três vetores. No final,
//mostre uma listagem contendo apenas os dados das funcionárias
//mulheres que ganham mais de R$5 mil.

fun main() {
    val nomes = Array(5) { "" }
    val sexos = Array(5) { "" }
    val salarios = DoubleArray(5)

    println("Digite o nome, sexo e salário de 5 funcionários:")

    for (i in 0 until 5) {
        print("Digite o nome do funcionário ${i + 1}: ")
        nomes[i] = readLine() ?: ""

        print("Digite o sexo do funcionário ${i + 1} (M/F): ")
        sexos[i] = readLine() ?: ""

        print("Digite o salário do funcionário ${i + 1}: R$")
        salarios[i] = readLine()?.toDoubleOrNull() ?: 0.0
    }

    println("\nFuncionárias mulheres que ganham mais de R$5 mil:")

    for (i in 0 until 5) {
        if (sexos[i].equals("F", ignoreCase = true) && salarios[i] > 5000) {
            println("Nome: ${nomes[i]}, Sexo: ${sexos[i]}, Salário: R$${"%.2f".format(salarios[i])}")
        }
    }
}
