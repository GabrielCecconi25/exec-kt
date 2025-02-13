fun main() {
    print("Largura da parede: ")
    var area = readln().toDouble()
    print("Altura da parede: ")
    area *= readln().toDouble()

    print("Na parede com uma area de ${String.format("%.2f", area)}m²\nVocê consegue usar ${String.format("%.2f", area/2)}l litros de tinta")
}