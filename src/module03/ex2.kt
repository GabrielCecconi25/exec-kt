/*Escreva um algoritmo que leia dois números inteiros e compare-
os, mostrando na tela uma das mensagens abaixo:

• O primeiro valor é o maior
• O segundo valor é o maior
• Não existe valor maior, os dois são iguais*/

fun main(){
    println("Digite um número inteiro:")
    var a = readln().toInt()
    println("Digite outro número inteiro:")
    var b = readln().toInt()

    if (a > b){
        println("O primeiro valor é o maior")
    }else if(b > a){
        println("O segundo valor é o maior")
    }else{
        println("Não existe valor maior, os dois são iguais")
    }
}
