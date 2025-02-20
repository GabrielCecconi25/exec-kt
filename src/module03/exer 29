/*Desenvolva um programa que leia o nome de um funcionário,
seu salário, quantos anos ele trabalha na empresa e mostre seu
novo salário, reajustado de acordo com a tabela a seguir:
• Até 3 anos de empresa: aumento de 3%
• entre 3 e 10 anos: aumento de 12.5%
• 10 anos ou mais: aumento de 20%*/

fun main(){
    println("Digite seu nome:")
    val nome = readLine().toString()
    println("Digite seu salário:")
    val sal = readln().toDouble()
    println("Quanto tempo de empresa:")
    val temp = readln().toDouble()

    when{
        temp < 3 -> println("$nome, seu novo salário é de: R$${sal * 1.03}")
        temp > 3 && temp <= 10 -> println("$nome, seu novo salário é de: R$${sal * 1.125}")
        temp > 10 -> println("$nome, seu novo salário é de: R$${sal * 1.20}")
    }
}
