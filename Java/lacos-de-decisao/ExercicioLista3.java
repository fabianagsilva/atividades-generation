/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:

10-14 infantil
15-17 juvenil
18-25 adulto*/

package ExerciciosLacosDeDecisao;

import java.util.Scanner;

public class Exerciciolista3 {

	public static void main(String[] args) {
		
		int idade, categ = 0; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println ("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("\nEsta idade está na categoria Infantil! ");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("\nEsta idade está na categoria Juvenil! ");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("\nEsta idade está na categoria Adulto! ");
		}
		else {
			System.out.println ("\nEsta idade não está cadastrada em nenhuma categoria! \nTente outra vez!");
		}
		
		
		
	}

}
