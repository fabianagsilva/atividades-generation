	/* 1) João comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
	Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do 
	estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
	João precisa que você faça um sistema que leia a variável P (peso de tomates) e 
	verifique se há excesso. Se houver, gravar na variável E (Excesso) e na 
	variável M o valor da multa que João deverá pagar. Caso contrário mostrar
	tais variáveis com o conteúdo ZERO.*/

package ExerciciosLacosDeDecisao;

import java.util.Scanner;

public class Exercicio1{

	public static void main(String[] args){
		double p,e,m = 4.00, vM = 0.0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		p = leia.nextDouble();
				
		if (p <= 50) { 
		System.out.println("O valor da multa é de: R$ " + vM);
	} 
		else if(p > 50);{ 
		e = p - 50; 
		vM = m * e;
		System.out.println("O excesso de peso foi de: " + e + "Kg " + "\nO valor da multa é de: R$ " + vM + "\n");
		}
	}
}
