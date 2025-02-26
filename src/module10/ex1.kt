/* Refaça o exercício 90, só que agora em forma de função
Somador(), que vai receber dois parâmetros e vai retornar o
resultado da soma entre eles para o programa principal.
 */

package module10

fun main() {
    println(Somador(10, 15))
}

fun Somador (a: Int, b: Int):Int {
    return a + b
}