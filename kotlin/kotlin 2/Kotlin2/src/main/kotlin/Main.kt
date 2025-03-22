//Nome:Marcus Antonio da Rocha Filho
//RA: 2171392321029
//Problema: ler 3 valores inteiros, e apresentar os 3 numeros em ordem. Criei uma lista, as vars poderiam ser a mesma ( a de input), mas separei pra ficar bonito e pq tem poucas, depois ordenei com sort e printei o resultado.

/*fun main (){
    var lista = mutableListOf<Int>()

    println("Insira um numero inteiro")
    var numero1 = readLine().toString().toInt()
    lista.add(numero1)

    println("Insira mais um numero inteiro")
    var numero2 = readLine().toString().toInt()
    lista.add(numero2)

    println("Insira um ultimo numero inteiro")
    var numero3 = readLine().toString().toInt()
    lista.add(numero3)

    lista.sort()

    println("Lista em ordem Crescente: ${lista}")
}*/

//Nome:Marcus Antonio da Rocha Filho
//RA: 2171392321029
//Problema: ler quatro numeros double, tirar média aritmetica, depois testar se os valores são validos com a condição >=7. primeiro cada var recebe um double, dps na var media tiramos a média que é comparada numa condicional simples(>=7)

/*fun main(){
    println("insira a nota do primeiro bimestre")
    var nota1 = readLine().toString().toDouble()

    println("insira a nota do segundo bimestre")
    var nota2 = readLine().toString().toDouble()

    println("insira a nota do terceiro bimestre")
    var nota3 = readLine().toString().toDouble()

    println("insira a nota do quarto bimestre")
    var nota4 = readLine().toString().toDouble()

    var media: Double = (nota1 + nota2 + nota3 + nota4)/4

    if(media >= 7.0){
        println("Parabéns você foi aprovado! Sua nota foi: ${media}")
    }else {
        println("Parabéns você vai fazer esta aula mais uma vez! Sua nota foi: ${media}")
    }

}*/

//Nome:Marcus Antonio da Rocha Filho
//RA: 2171392321029
//Problema:Faça um programa na Linguagem Kotlin que leia 3 números inteiros e mostre o maior deles. lista pra receber os inputs, dessa vez uma variavel pro tds os input. dps um for que checa cada posição com o maior numero recebido na var maiornumero. dava pra fazer com lista.maxOrNull() tbm mt mais simples.

/*fun main(){
    var lista = mutableListOf<Int>()

    println("Insira o primeiro numero")
    var input = readLine().toString().toInt()
    lista.add(input)

    println("Insira o segundo numero")
    input = readLine().toString().toInt()
    lista.add(input)

    println("Insira o terceiro numero")
    input = readLine().toString().toInt()
    lista.add(input)

    var maiorNumero = lista[0]
    for(num in lista){
        if(num > maiorNumero) maiorNumero = num
    }

    println("O maior numero é: ${maiorNumero}")
}*/

//Nome:Marcus Antonio da Rocha Filho
//RA: 2171392321029
//Problema: Faça um programa na Linguagem Kotlin que efetue a leitura de cinco números inteiros e identificar o maior e o menor valor. mesma coisa do anterior, poderia usar o maxOrNull ou o reduce eu acho( pra achar o menor)

/*fun main() {
    var lista = mutableListOf<Int>()

    println("Insira o primeiro numero")
    var input = readLine().toString().toInt()
    lista.add(input)

    println("Insira o segundo numero")
    input = readLine().toString().toInt()
    lista.add(input)

    println("Insira o terceiro numero")
    input = readLine().toString().toInt()
    lista.add(input)

    println("Insira o quarto numero")
    input = readLine().toString().toInt()
    lista.add(input)

    println("Insira o quinto numero")
    input = readLine().toString().toInt()
    lista.add(input)

    var maiorNumero = lista[0]
    for(num in lista){
        if(num > maiorNumero) maiorNumero = num
    }

    var menorNumero = lista[0]
    for(num in lista){
        if(num < menorNumero) menorNumero = num
    }

    println("O maior numero é: ${maiorNumero}")
    println("O menor numero é: ${menorNumero}")

}*/

//Nome:Marcus Antonio da Rocha Filho
//RA: 2171392321029
//Problema: Faça um programa na Linguagem Kotlin que efetue a leitura de um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar. recebe o input e divide por 2, se tiver 0 de resto é par senão é impar cabo.

/*fun main(){
    println("Insira o numero a ser testado se é par ou impar")
    var numero = readLine().toString().toInt()

    if(numero % 2 == 0){
        println("é par!")
    }else{
        println("è impar")
    }
}*/

//Nome:Marcus Antonio da Rocha Filho
//RA: 2171392321029
//Problema: Faça um programa na Linguagem Kotlin que leia o código do item pedido, a quantidade e calcule o valor a ser pago por aquele lanche. fiz com uma lista de if else, poderia ser um switch case mas ai é preferencia, n usei list pq seria com map? n sei ainda.

/*fun main(){
    println("qual o codigo do lanche que voce quer?")
    var lanche = readLine().toString().toInt()

    println("Qual a quantidade?")
    var qtd = readLine().toString().toInt()

    if(lanche == 100){
        var preco: Double = qtd * 1.20
        println("o preço é: R$ ${preco}")
    }else if(lanche == 101){
        var preco: Double = qtd * 1.30
        println("o preço é: R$ ${preco}")
    }else if(lanche == 102){
        var preco: Double = qtd * 1.50
        println("o preço é: R$ ${preco}")
    }else if(lanche == 103){
        var preco: Double = qtd * 1.20
        println("o preço é: R$ ${preco}")
    }else if(lanche == 104){
        var preco: Double = qtd * 1.30
        println("o preço é: R$ ${preco}")
    }else if(lanche == 105){
        var preco: Double = qtd * 1.00
        println("o preço é: R$ ${preco}")
    }else{
        println("codigo invalido")
    }
}*/

//Nome:Marcus Antonio da Rocha Filho
//RA: 2171392321029
//Problema: Faça um programa na Linguagem Kotlin que que receba um número e mostre o fatorial desse número. le um numero, testa dps faz um loop de fatorial, n era necessario mas é legal usar o null.

/*fun main(){
    println("Insira um numero pra ver o fatorial dele")
    var input = readLine().toString().toInt()

    if (input != null && input >= 0) {
        var fatorial = 1
        for (i in 1..input) {
            fatorial *= i
        }
        println("O fatorial de $input é: $fatorial")
    } else {
        println("Insira um numero válido")
    }
}*/

//Nome:Marcus Antonio da Rocha Filho
//RA: 2171392321029
//Problema: Faça um programa na Linguagem Kotlin para apresentar o total da soma obtida dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100).

/*fun main(){
    var somaTotal = 0
    var inicio = 0

    while(inicio<100){
        inicio++
        somaTotal = somaTotal + inicio
    }

    println("A soma total é: ${somaTotal}")

}*/

//Nome:Marcus Antonio da Rocha Filho
//RA: 2171392321029
//Problema: Faça um programa na Linguagem Kotlin que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius.
// loop usando in e step pra pular de 10 em 10 e dentro do loop printa uma vez cada vez printando C e a conversão em F

/*fun main(){
    var celsius: Double = 0.0
    var faren: Double= 0.0

    for (celsius in 10..100 step 10) {

        val fahrenheit = (celsius * 9.0 / 5.0) + 32
        println("a temperatura em C é: ${celsius} \t em fahrenheit é: ${fahrenheit}")
    }
}*/