//Escreva um programa para aprovar ou não o empréstimo bancário
//para a compra de uma casa. O programa vai perguntar o valor da
//casa, o salário do comprador e em quantos anos ele vai pagar.
//Calcule o valor da prestação mensal, sabendo que ela não pode
//exceder 30% do salário ou então o empréstimo será negado.

fun main(){
    println("Qual o valor da casa :")
    val valorCasa = readln().toDouble()

    println("Qual seu salario :")
    val valorSalario = readln().toDouble()

    println("Quantos pretende pagar a casa :")
    val pagarCasa = readln().toDouble()

    val somaMeses = pagarCasa * 12
    val limite = 0.30 * valorSalario
    val prestacao = valorCasa / somaMeses

    if (prestacao <= limite){
        println("Empréstimo : Aprovado!")
    }else{
        println("Empréstimo : Reprovado!")
    }

}
