/*Faça um programa que leia a largura e o comprimento de
um terreno retangular, calculando e mostrando a sua área em
m². O programa também devemostrar a classificação desse
terreno, de acordo com a lista abaixo:
• Abaixo de 100m² = TERRENO POPULAR
• Entre 100m² e 500m² = TERRENO MASTER
• Acima de 500m² = TERRENO VIP*/

fun main(){
    println("Digite o valor da largura:")
    val largura = readln().toDouble()
    println("Digite o valor do comprimento")
    val comprimento = readln().toDouble()

    val area = largura * comprimento

    if (area < 100){
        println("classificação $area m²: Terreno POPULAR")
    }else if (area > 500){
        println("classificação $area m²: Terreno VIP")
    }else{
        println("classificação $area m²: Terreno MASTER")
    }


}
