/*2) Elabore um programa que leia a variável N, número de horas trabalhadas de um operário. 
E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50. 
Calcule o excesso de pagamento armazenando-o na variável E, cas "o contrário zerar tal variável. 
A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.*/

package ExerciciosLacosDeDecisao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args){
		
		double salHora = 10.0, salarioNormal, salarioTotal, vHoraE = 20.0, salarioExtra;
		int horaE = 50, excesso, numeroH;
	
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a quantidade de horas trabalhadas: ");
		numeroH = leia.nextInt();
		
		salarioNormal = numeroH * salHora;
		excesso = numeroH - horaE;
		
		if (numeroH > horaE){
			salarioExtra = excesso * vHoraE;
			salarioNormal = (numeroH - excesso) * salHora;
			salarioTotal = salarioExtra + salarioNormal;
			System.out.println("Salário Normal: R$ " + salarioNormal + "\nSalário Extra: R$ " + salarioExtra + "\nSalário Total: R$ " +salarioTotal + "\n");
			
		}
		else{ 
			excesso = 0;
			System.out.println("\nSalário: R$ " + salarioNormal + "\nSalário extra: R$ " + excesso + "\n");
		}
	}
}