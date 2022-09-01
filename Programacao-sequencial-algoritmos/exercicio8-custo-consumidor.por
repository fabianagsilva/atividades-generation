/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

programa
{
	
	funcao inicio()
	{
		inteiro custoFabrica, distribuidor = 28, imposto = 45, custoConsumidor
				
		escreva("Informe o Custo de Fábrica: ")
		leia(custoFabrica)

		distribuidor = (custoFabrica * 28) / 100
		imposto = (custoFabrica * 45) / 100
		custoConsumidor = custoFabrica + distribuidor + imposto

		escreva("\n" + "O custo ao Consumidor é de: " + custoConsumidor + "\n")	
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 647; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */