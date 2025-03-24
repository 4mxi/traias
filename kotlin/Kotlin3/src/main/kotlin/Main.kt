
//problema: ler 3 opções:1 - Fatorial.2 - Quadradro de um número.3 - Volume de uma lata.4 – Sair do Programa
fun main(){
    println("Digite a opção \n 1 - Fatorial\n 2 - Quadrado de um numero\n 3 - Volume de uma lata\n 4 - Sair do Programa")
    var opcao = readLine().toString().toInt()

    when(opcao){
        1->{
            println("Digite o numero oara calcular o seu Fatorial")
            var numeroFatoras = readLine().toString().toInt()
            var calculoFatoras: Int = 1
            for(i in 2..numeroFatoras){
                calculoFatoras *= i
            }
            println("O fatorial do seu numero é: $calculoFatoras")
        }
        2->{
            println("Digite o numero para calcular o seu Quadrado")
            var opcao2 = readLine().toString().toInt()
            var calculaQuadrado = opcao2 * opcao2
            println("O valor do quadrado do seu numero é: $calculaQuadrado")
        }
        3->{
            println("Digite o numero para calcular o Volume de uma lata")
            println("Primeiro digite o valor do Raio")
            var raio = readLine().toString().toDouble()
            println("Agora digite o valor da Altura")
            var altura = readLine().toString().toDouble()

            var volume: Double = 3.14159 * (raio * raio) * altura
            println("O volume da lata é: $volume")
        }
        else->{
            println("Saindo do programa....")
        }
    }
}