import kotlin.random.Random

fun main() {
    val numeroSorteado = Random.nextInt(1, 11)
    var tentativas = 4
    var acertou = false

    println("Bem-vindo ao jogo! Eu sorteiei um número entre 1 e 10.")
    println("Você tem $tentativas tentativas para acertar. Boa sorte!")

    while (tentativas > 0 && !acertou) {
        print("Digite seu palpite: ")
        val palpite = readLine()?.toIntOrNull()

        if (palpite == null) {
            println("Por favor, digite um número válido.")
            continue
        }

        if (palpite == numeroSorteado) {
            println("Parabéns! Você acertou o número!")
            acertou = true
        } else {
            tentativas--
            println("Errou! Você ainda tem $tentativas tentativas.")
            if (palpite < numeroSorteado) {
                println("Dica: O número sorteado é maior.")
            } else {
                println("Dica: O número sorteado é menor.")
            }
        }
    }

    if (!acertou) {
        println("Você perdeu! O número sorteado era: $numeroSorteado")
    }
}

