fun main() {
    var somaAlturas = 0.0
    var pessoasMaisDe90Kg = 0
    var pessoasMenosDe50KgMenosDe160m = 0
    var pessoasMaisDe190mMaisDe100Kg = 0

    // Lendo o peso e a altura de 7 pessoas
    for (i in 1..7) {
        println("Digite os dados da ${i}° pessoa:")

        print("Peso (kg): ")
        val peso = readLine()?.toDoubleOrNull() ?: 0.0

        print("Altura (m): ")
        val altura = readLine()?.toDoubleOrNull() ?: 0.0

        // Acumulando a soma das alturas
        somaAlturas += altura

        // Contagem de pessoas que pesam mais de 90kg
        if (peso > 90) {
            pessoasMaisDe90Kg++
        }

        // Contagem de pessoas que pesam menos de 50kg e têm menos de 1.60m
        if (peso < 50 && altura < 1.60) {
            pessoasMenosDe50KgMenosDe160m++
        }

        // Contagem de pessoas que medem mais de 1.90m e pesam mais de 100kg
        if (altura > 1.90 && peso > 100) {
            pessoasMaisDe190mMaisDe100Kg++
        }
    }

    // Calculando a média de altura do grupo
    val mediaAltura = somaAlturas / 7

    // Exibindo os resultados
    println("\nResultados:")
    println("Média de altura do grupo: %.2f".format(mediaAltura))
    println("Pessoas que pesam mais de 90kg: $pessoasMaisDe90Kg")
    println("Pessoas que pesam menos de 50kg e têm menos de 1.60m: $pessoasMenosDe50KgMenosDe160m")
    println("Pessoas que medem mais de 1.90m e pesam mais de 100kg: $pessoasMaisDe190mMaisDe100Kg")
}
