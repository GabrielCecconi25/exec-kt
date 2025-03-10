/*
Faça um programa usando a estrutura “para” que leia um
número inteiro positivo e mostre na tela uma contagem de 0
até o valor digitado:
Ex: Digite um valor: 9
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!
*/

fun main(){
    print("Digite um valor: ")
    val num = readln().toInt()

    if (num >= 0){
        print("Contagem: ")
        for (i in 0 .. num){
            print("$i, ")
        }
        print("FIM!")
    } else{
        println("Informe um número positivo")
    }
}