//O Índice de Massa Corpórea (IMC) é um valor calculado baseado
//na altura e no peso de uma pessoa. De acordo com o valor do IMC,
//podemos classificar o indivíduo dentro de certas faixas.
//• abaixo de 18.5: Abaixo do peso
//• entre 18.5 e 25: Peso ideal
//• entre 25 e 30: Sobrepeso
//• entre 30 e 40: Obesidade
//• acima de 40: Obseidade mórbida

fun main(){
        println("Qual sua altura :")
        val altura = readln().toDouble()

        println("Qual seu peso :")
        val peso = readln().toDouble()

        val somaImc = peso /(altura * altura)


        if (somaImc < 18.5)
                println("%.2f, Abaixo do peso".format(somaImc))
        else if (somaImc < 25)
                println("%.2f, Peso ideal".format(somaImc))
        else if (somaImc < 30)
                println("%.2f, Sobrepeso".format(somaImc))
        else if (somaImc < 40)
                println("%.2f, Obesidade".format(somaImc))
        else
                println("%.2f, Obesidade mórbida".format(somaImc))
}



