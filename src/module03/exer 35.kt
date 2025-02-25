//Uma empresa de aluguel de carros precisa cobrar pelos seus
//serviços. O aluguel de um carro custa R$90 por dia para carro
//popular e R$150 por dia para carro de luxo. Além disso, o cliente
//paga por Km percorrido. Faça um programa que leia o tipo de carro
//alugado (popular ou luxo), quantos dias de aluguel e quantos Km
//foram percorridos. No final mostre o preço a ser pago de acordo com
//a tabela a seguir:
//• Carros populares (aluguel de R$90 por dia)
//• Até 100Km percorridos: R$0,20 por Km
//• Acima de 100Km percorridos: R$0,10 por Km
//• Carros de luxo (aluguel de R$150 por dia)
//• Até 200Km percorridos: R$0,30 por Km
//• Acima de 200Km percorridos: R$0,25 por Km

fun main() {
    print("Qual o tipo de carro alugado (Popular / Luxo ) :")
    val tipoCarro = readln().toString().lowercase().replaceFirstChar { it.uppercase() }

    print("Quantos dias de aluguel :")
    val dias = readln().toInt()

    print("Quantos km percorridos :")
    val kmPercorridos = readln().toDouble()

    if (tipoCarro == "Popular"){
        val aluguel = 90 * dias
        val precokm = if(kmPercorridos <= 100) kmPercorridos * 0.20 else (100 * 0.20) + ((kmPercorridos - 100) * 0.10)
        val total = aluguel + precokm
        println("O valor total a ser pago é: R$%.2f".format(total))
    }else if (tipoCarro == "Luxo"){
        val aluguel = 150 * dias
        val precoKm = if (kmPercorridos <= 200) kmPercorridos * 0.30 else(200 * 0.30) + ((kmPercorridos - 200) * 0.25)
        val total = aluguel + precoKm
        println("O valor total a ser pago é: R$%.2f".format(total))
    }else{
        println("Tipo de carro invalido!")

    }


}
