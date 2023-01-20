import java.io.IOException

fun main() {
    print("Informe o preço do combustível:R$")
    try {
        val precoCombustivel = readln()
        if (precoCombustivel.isBlank()) {
            throw IOException("Por favor, insira um valor válido")
        }
        print("Informe quantos Km/l seu veículo faz: ")
        val kmporLitro = readln()
        if (kmporLitro.isBlank()) {
            throw Exception("Por favor, insira um valor válido")
        }
        print("Informe a quilometragem total do percurso: ")
        val kmTotal = readln()
        if (kmporLitro.isBlank()) {
            throw Exception("Por favor, insira um valor válido")
        }
        //s<-(((km+(km*0.05))/kml))*vcombustivel
        val valorTotal = calculaValor(kmTotal.toDouble(), kmporLitro.toDouble(), precoCombustivel.toDouble())
        println(String.format("R$%.2f",valorTotal)) //String.format("Escrevo a msg q eu quero%.numero de casas depois da virgula[f]") serve para formatar o texto,

    } catch (e: Exception) {
        println(e.message)
    }
}

fun calculaValor(kmTotal: Double, kmporLitro: Double, precoCombustivel: Double): Double {
    return (((kmTotal + (kmTotal * 0.05)) / kmporLitro)) * precoCombustivel
}
