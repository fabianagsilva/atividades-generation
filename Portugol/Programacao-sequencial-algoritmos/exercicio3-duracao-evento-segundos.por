
/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

programa
{
	
	funcao inicio()
	{
		inteiro hora, minutos, segundos = 3600 , duracao
			
		escreva("Digite os segundos de duração do seu evento: ")
		leia(duracao)
			
		hora = duracao /segundos
		minutos = (duracao % segundos) / 60
		segundos = (duracao % segundos) % 60

		escreva("\n" + "Seu evento teve a duração de: " + hora + " horas, " + minutos + " minutos e " + segundos + " segundos" + "\n") 
			
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 563; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */