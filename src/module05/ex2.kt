package module05

fun main() {
    var totalHomens = 0.0
    var totalMulheres = 0.0

    do {

        println("Digite o sexo do funcionário (M para masculino, F para feminino):")
        val sexo = readln().uppercase()


        println("Digite o salário do funcionário:")
        val salario = readln().toDouble()


        if (sexo == "M") {
            totalHomens += salario
        } else if (sexo == "F") {
            totalMulheres += salario
        } else {
            println("Sexo inválido! Por favor, digite M para masculino ou F para feminino.")
            continue
        }


        println("Deseja continuar? (S para sim, N para não):")
        val continuar = readln().uppercase()

    } while (continuar == "S")


    println("Total de salários pagos aos homens: R$ %.2f".format(totalHomens))
    println("Total de salários pagos às mulheres: R$ %.2f".format(totalMulheres))
}
