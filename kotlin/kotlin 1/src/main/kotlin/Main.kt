
//Problema: programa que recebe duas entradas e retorna a soma delas. Inicio a primeira e segunda var ( numero1, numero2), recebe duas entradas com readLine, depois realiza a soma na var Soma, retorna um print com a var soma.

/*fun main() { // primeiro exercicio, funcional
    var numero1: Int
    var numero2: Int

    println("Para realizar a soma de dois numeros: Digite o primeiro numero")
    numero1 = readLine().toString().toInt()
    println("Digite o segundo numero")
    numero2 = readLine().toString().toInt()

    var soma: Int = numero1 + numero2

    println("O valor da Soma é ${soma}")
    }
*/


//Problema: converter uma entrada numerica para fahrenheit. primeiro inicio a var que recebe a temp em C, depois a var recebe uma entrada pro usuario, a segunda var converte e depois é printada

/*fun main(){ // funcionou normal.
    var tempCelsius: Int

    println("digite a Temperatura em Celsius para ser convertida para Fahrenheit")
    tempCelsius = readLine().toString().toInt()

    var conversaoFahrenheit = (9 * tempCelsius + 160)/5

    println("A conversão é: ${conversaoFahrenheit}")

}*/


//Problema: Receber valor da Temp fahrenheit e converter para C. A var recebe double pro calculo não quebrar( apesar de F receber numero quebrado e C tbm). o calculo recebe double pq 5/9 vai dar um numero quebrado. no print o calculo é exibido com .toInt() pra ficar bonito em C

/*fun main(){ // funcionou normal, cuidado com as conversões e transformações dos numeros dentro dos calculos.
    var tempFahrenheit: Double

    println(" Digite a Temperatura em Fahrenheit para ser convertida para Celsius")
    tempFahrenheit = readLine().toString().toDouble()

    var conversaoCelsius: Double = (tempFahrenheit - 32.0) * (5.0/9.0)

    println("A temperatura em Celsius é: ${conversaoCelsius.toInt()}")

}*/


//Problema: receber dois valores e calcular o volume da lata. As duas primeiras var recebem os valores do raio e altura, a terceira calcula o volume, que é printado no fim.

/*fun main(){ // funciona...
    var raio: Double
    var altura: Double

    println("Calcule o volume da sua lata de oleo, por qualquer que seja o motivo de voce querer uma coisa dessas")
    println("--------------------------------------------------")
    println("Digite o raio da lata abaixo")
    raio = readLine().toString().toDouble()
    println("Digite a altura da lata abaixo")
    altura = readLine().toString().toDouble()

    var volume: Double = 3.14159 * (raio * raio) * altura

    println("O volume da sua lata é: ${volume}")

}*/


//Problema: calcular dias de vida do usuario. uma var para ano mes e dia, e uma para ano atual, pra caso o ano passe o calculo continue funcionando.

/*fun main(){ //funcionando
    var ano: Int
    var mes: Int
    var dia: Int
    var anoAtual: Int

    println("Calcule seus dias de vida, basta inserir em que ano nasceu, mes e dia!")

    println("Digite o ano em que nasceu")
    ano = readLine().toString().toInt()

    println("Digite o mês em que nasceu")
    mes = readLine().toString().toInt()

    println("Digite o dia em que nasceu")
    dia = readLine().toString().toInt()

    println("Digite agora o ano em que estamos")
    anoAtual = readLine().toString().toInt()

    var diasDeVida: Int = ((anoAtual - ano) * 365) + (mes * 30) + dia

    println("Voce viveu ${diasDeVida} Parabéns!")
}*/


//Problema: calcular a area. duas var, uma recebe o raio do usuario, a outra calcula atraves da formula de area, a var area é printada no fim do programa.

/*fun main(){ // funcionando
    var raio: Double
    var area: Double

    println("Calcule a area da circunferencia do circulo")
    println("Digite abaixo o valor do raio")
    raio = readLine().toString().toDouble()

    area = 3.14159 * (raio * raio)

    println("O valor da Area é: ${area}")

}*/


//Problema: calcular valor de prestação atrasada. as primeiras var recebem o valor do usuario, e na var prestacao é realizado o calculo, que é depois exibido no print.

/*fun main(){ // funciona
    var valor: Double
    var taxa: Double
    var tempo: Double
    var prestacao: Double

    println("Calcule sua prestação em atraso seu irresponsavel!")

    println("Digite abaixo o valor da prestação")
    valor = readLine().toString().toDouble()

    println("Digite abaixo o valor da taxa")
    taxa = readLine().toString().toDouble()

    println("Digite abaixo quanto tempo esta atrasada a prestação")
    tempo = readLine().toString().toDouble()

    prestacao = valor + (valor * (taxa/100) * tempo)

    println("O valor da prestação atrasada vai ser: ${prestacao}")

}*/


//Problema: converter Dolar pra Real. var para receber a cotacao e a quantia do usuario, e uma var para o calculo, que é exibida no fim do programa.

/*fun main(){ // funcionando.
    var cotacao: Double
    var dolares: Double
    var valorEmReal: Double

    println("Calcule a conversao do seu Dolar pra Reais e saiba quanto voce ganha no PJ da gringa!")

    println("Digite abaixo a cotacao do dolar")
    cotacao = readLine().toString().toDouble()

    println("Digite abaixo quantos dolares voce possui, ou vai ganhar")
    dolares = readLine().toString().toDouble()

    valorEmReal = dolares * cotacao

    print("Digite o Valor em Reais é : R$ ${valorEmReal}")

}*/


//Problema: trocar o valor de duas variaveis. "trocar" os valores na exibição não conta, ja que as variaves não são trocadas de fato na memoria, pra isso é necessaria uma terceira var pra "segurar" um dos valores, escolher uma var pra ser segura e fazer um pequeno malabarismo.

/*fun main(){ // funciona padrão.
    var a: Int
    var b: Int
    var c: Int

    println("Troque o valor de A por B!")

    println("Digite abaixo o valor de A")
    a = readLine().toString().toInt()

    println("Digite abaixo o valor de B")
    b = readLine().toString().toInt()

    c = a
    a = b
    b = c

    println("O valor trocado de A é: ${a} e o valor trocado de B é: ${b}")
}*/

//Problema: calcular o quadrado do numero. uma var recebe o valor do numero, e a outra calcula o quadrado com o numero inserido, e é exibido ao fim do programa.

/*fun main(){ // funcionando
    var numero: Int
    var aoQuadrado: Int

    println("Calcule o quadrado do seu numero!")
    println("Digite o numero abaixo")
    numero = readLine().toString().toInt()

    aoQuadrado = numero * numero

    println("O quadrado do seu numero é: ${aoQuadrado}")

}*/


//Problema: calcular resto de um numero dividido por 6. uma var pra receber o numero do usuario, e outra pra calcular, coloquei td INT pois divisão com resto deveria ser de numero inteiro(?)

/*fun main(){ // funcionando
    var numero: Int
    var resto: Int

    println("Saiba o resto da divisão do SEU NUMERO divido por 6!")
    println("Digite abaixo o seu numero")
    numero = readLine().toString().toInt()

    resto = numero % 6

    println("O resto da divisão é: ${resto}")
}*/