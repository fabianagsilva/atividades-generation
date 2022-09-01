/*2) Elabore um programa que leia a variável N, número de horas trabalhadas de um operário. 
E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50. 
Calcule o excesso de pagamento armazenando-o na variável E, cas "o contrário zerar tal variável. 
A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.*/

programa
{

	funcao inicio()
	{
		real salHora = 10.0, salarioNormal, salarioTotal, vHoraE = 20.0, salarioExtra
		inteiro horaE = 50, Excesso, numeroH
	
		escreva("Digite a quantidade de horas trabalhadas: ")
		leia(numeroH)
		
		salarioNormal = numeroH * salHora
		Excesso = numeroH - horaE
		
		se (numeroH > horaE){
			salarioExtra = Excesso * vHoraE
			salarioNormal = (numeroH - Excesso) * salHora
			salarioTotal = salarioExtra + salarioNormal
			escreva("Salário Normal: R$ " + salarioNormal + "\nSalário Extra: R$ " + salarioExtra + "\nSalário Total: R$ " +salarioTotal + "\n")
			
		}
		senao { 
			Excesso = 0
			escreva("\nSalário: R$ " + salarioNormal + "\nSalário extra: R$ " + Excesso + "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1107; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */