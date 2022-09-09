
/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3, media, mediaFinal
		
		escreva("Digite a 1ª nota: ")
		leia(nota1)
		
		escreva("Digite a 2ª nota: ")
		leia(nota2)
		
		escreva("Digite a 3ª nota: ")
		leia(nota3)
	
		media = (nota1 * 2) + (nota2 * 3) + (nota3 * 5) 
		mediaFinal = media / 10
		
		escreva("\n" + "A Média Final é: " + mediaFinal +"\n")
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 554; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */