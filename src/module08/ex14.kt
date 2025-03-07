//Crie um programa que leia o nome e a idade de 9 pessoas e
//guarde esses valores em dois vetores, em posições relacionadas. No
//final, mostre uma listagem contendo apenas os dados das pessoas
//menores de idade.

fun main() {
    val nomes = Array(9) { "" }
    val idades = IntArray(9)

    println("Digite o nome e a idade de 9 pessoas:")

    for (i in 0 until 9) {
        print("Digite o nome da pessoa ${i + 1}: ")
        nomes[i] = readLine() ?: ""

        print("Digite a idade da pessoa ${i + 1}: ")
        idades[i] = readLine()?.toIntOrNull() ?: 0
    }

    println("\nPessoas menores de idade:")

    for (i in 0 until 9) {
        if (idades[i] < 18) {
            println("Nome: ${nomes[i]}, Idade: ${idades[i]}")
        }
    }
}
