fun main() {
    var valor1:Float? = 8.65f
    var valor2:Float? = 4.35f
    var operacao = 1 // operacao pode ir de 1 ate 6
    var fatorial:Int = 1
    
    if(valor1 != null && valor2 != null){
        println(operacao.getValorOperacao())
        if(operacao == 1){
            println("O resultado da soma entre $valor1 e $valor2 é: " + valor1.plus(valor2))
        }else if(operacao == 2){
            println("O resultado da subtração entre $valor1 e $valor2 é: " + valor1.minus(valor2))
        }else if (operacao == 3){
            println("O resultado da multiplicação entre $valor1 e $valor2 é: "+ valor1.times(valor2))
        }else if ( operacao == 4){
            println("O resultado da divisão entre $valor1 e $valor2 é: " + valor1.div(valor2))
        }else if (operacao == 5) {
			for(i in 1..valor1.toInt()){
               fatorial = fatorial * i
			}  
        println("O fator de $valor1 é: " + fatorial)
        }
        else{
            println("O valor é inválido.")
        }
    }else{
        println("Um dos valores é inválido.")
    }
}

fun Int.getValorOperacao():String{
    
    return when(this){
        1 -> "$this - soma"
        2 -> "$this - subtração"
        3 -> "$this - multiplicação"
        4 -> "$this - divisão"
        5 -> "$this - fatorial"
        else -> "O valor é inválido."
    }
}