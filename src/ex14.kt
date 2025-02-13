fun main() {
    print("Nome do Funcionário: ")
    val name = readLine()
    print("Salário: ")
    val salario = readln().toDouble()

    print("O funcionario $name, tem um aumento de 15% com um novo salário de R$${String.format("%.2f", salario*1.15)}")
}