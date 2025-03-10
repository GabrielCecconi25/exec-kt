/*
Escreva um programa que leia um número qualquer e mostre a
tabuada desse número, usando a estrutura “para”.
Ex: Digite um valor: 5
5 x 1 = 5

5 x 2 = 10
5 x 3 = 15 ...
 */

fun main(){
    print("Digite um valor: ")
    var num = readLine()!!.toInt()
    for (i in 1 ..10){
        println("$num x $i = ${num * i}")
    }
}