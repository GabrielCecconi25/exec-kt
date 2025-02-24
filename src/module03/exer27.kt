/*Crie um programa que leia duas notas de um aluno e calcule
a sua média, mostrando uma mensagem no final, de acordo com a
média atingida:
• Média até 4.9: REPROVADO
• Média entre 5.0 e 6.9: RECUPERAÇÃO
• Média 7.0 ou superior: APROVADO*/

fun main(){
    println("Digite a primeira nota:")
    var primeiraNota = readln().toDouble()
    println("Digite a segunda nota:")
    var segundaNota = readln().toDouble()

    val media = (primeiraNota + segundaNota) / 2

    if(media <= 4.9){
        println("Sua média: $media - REPROVADO")
    }else if (media >= 7){
        println("Sua média: $media - APROVADO")
    }else{
        println("Sua média: $media - RECUPERAÇÂO")
    }

}
