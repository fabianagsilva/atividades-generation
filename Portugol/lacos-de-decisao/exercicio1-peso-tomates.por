
/* 1) João comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do 
estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
João precisa que você faça um sistema que leia a variável P (peso de tomates) e 
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na 
variável M o valor da multa que João deverá pagar. Caso contrário mostrar
tais variáveis com o conteúdo ZERO.*/

programa{

 	funcao inicio (){
		
		real P,E, M = 4.00, vM = 0.0
		escreva ("Digite o peso: ")
		leia (P)
		se (P <= 50){ 
			escreva ("O valor da multa é de: R$ " + vM)
		} senao se (P > 50) { 
			E = P - 50 
			vM = M * E
			escreva ("O excesso de peso foi de " + E + " Kg " + "\nO valor da multa é de: R$ " + vM + "\n")
		}

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 560; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */