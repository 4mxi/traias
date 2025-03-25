
//problema: Criar uma coleção na linguagem Kotlin com 10 elementos–	Inserir os elementos de 1 a 10 no vetor–	Após a inserção, somente após a inserção mostrar o vetor.Obs. Não efetuar a leitura de 10 elementos
/*fun main() {
    val numeros = IntArray(10)

    for (i in numeros.indices) {
        numeros[i] = i + 1
    }

    println(numeros.joinToString (","))
}*/


//problema: Criar uma coleção “A” na linguagem Kotlin com 10 elementos–	Inserir os elementos de 1 a 10 na coleção–	Criar uma outra coleção B que conterá o elemento da coleção A multiplicado por 2–	Mostrar as duas coleçõesObs. Não efetuar a leitura de 10 elementos
/*fun main(){
    val A = List(10) {it + 1}

    val B = A.map {it * 2}

    println("Coleção A: ${A}")
    println("Coleção B: ${B}")
}*/


//problema:Fazer um procedimento para receber as notas da primeira e da segunda prova de cinco alunos. Armazenar as notas da primeira e da segunda prova em vetores distintos. Calcular e escrever a média de cada aluno
/*fun main(){
    val prova1 = DoubleArray(5)
    val prova2 = DoubleArray(5)

    for (i in 0..4){
        println("Digite a primeira Nota")
        prova1[i] = readLine().toString().toDouble()

        println("Digite a segunda Nota")
        prova2[i] = readLine().toString().toDouble()

    }

    for (i in 0..4){
        val media: Double = (prova1[i] + prova2[i])/2
        println("Médias: ${media}")
    }
}*/

//problema:Criar um vetor A do tipo inteiro de 5 elementos–	Solicitar os valores para o usuário e inserir no vetor A–	Criar um vetor B do tipo inteiro  –	Ler o vetor A e para cada elemento lido calcular o fatorial e gravar no B–	Após de todos os elementos do vetor A, mostrar os dois vetores
fun main(){
    val A = IntArray(5)
    val B = IntArray(5)

    for(i in 0 until A.size){
        println("Digite o ${i+1} valor para inserir na lista")
        A[i] = readLine().toString().toInt()

    }

    for(i in 0 until A.size) {
        var fatoras = 1

        for (j in 1..A[i]) {

            fatoras *= j
        }
        B[i] = fatoras
    }

    println("Vetor A: ${A.contentToString()}")
    println("Vetor B: ${B.contentToString()}")

}