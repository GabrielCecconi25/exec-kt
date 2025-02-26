///Um programa de vida saudável quer dar pontos atividades
//físicas que podem ser trocados por dinheiro. O sistema funciona
//assim:
//• Cada hora de atividade física no mês vale pontos
//• até 10h de atividade no mês: ganha 2 pontos por hora
//• de 10h até 20h de atividade no mês: ganha 5 pontos por hora
//• acima de 20h de atividade no mês: ganha 10 pontos por hora
//• A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
//Faça um programa que leia quantas horas de atividade uma pessoa teve
//por mês, calcule e mostre quantos pontos ela teve e quanto dinheiro
//ela conseguiu ganhar.

fun main() {
    print("Quantas horas no mês praticou exercício físico: ")
    val horas = readln().toDouble()
    val horasMes = 720

    if (horas > horasMes){
        println("Você não pode praticar mais de $horasMes horas no mês.")
        return
    }

    val pontos: Double
    val dinheiro: Double

    if (horas <=10){
        pontos = horas * 2
    }else if (horas > 10 && horas <=20){
        pontos = horas * 5
    }else{
        pontos = horas * 10
    }

    dinheiro = pontos * 0.05
    println("Você teve $pontos pontos, conseguiu ganhar R$$dinheiro")
}








