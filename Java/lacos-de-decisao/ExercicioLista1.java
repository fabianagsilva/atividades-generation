//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

package ExerciciosLacosDeDecisao;

import java.util.Scanner;

public class ExercicioLista1 {

	public static void main(String[] args) {
		int n1, n2, n3, result = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();

		System.out.println("Digite o segundoo número: ");
		n2 = leia.nextInt();

		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();

		if (n1 > n2 && n1 > n3) {
			result = n1;
			//System.out.println("\nO número " + n1 + " é o maior valor digitado!!!");
		} else if (n2 > n1 && n2 > n3) {
			result = n2;
			//System.out.println("\nO número " + n2 + " é o maior valor digitado!!!");
		} else if (n3 > n1 && n3 > n2) {
			result = n3;
			//System.out.println("\nO número " + n3 + " é o maior valor digitado!!!");
		}
		System.out.println("\nO número " + result + " é o maior valor digitado!!!");

	}
	
}
