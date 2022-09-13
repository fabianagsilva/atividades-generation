/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/

package ExercicioMatrizesVetores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int par, impar, somaPar = 0, contImpar = 0, x;
		int[] numero = new int[6];

		for (x = 0; x < 6; x++) {
			System.out.println("\nDigite um número: ");
			numero[x] = leia.nextInt();
		}

		System.out.println("\nNúmero pares digitados: ");
		for (x = 0; x < 6; x++) {
			if (numero[x] % 2 == 0) {
				System.out.println(numero[x]);
				somaPar += numero[x];
			}
		}

		System.out.println("\nNúmeros ímpares digitados: ");
		for (x = 0; x < 6; x++) {
			if (numero[x] % 2 != 0) {
				System.out.println(numero[x]);
				contImpar++;
			}
		}

		System.out.println("\nSoma dos números pares: " + somaPar);
		System.out.println("\nQuantidade de números ímpares: " + contImpar);
	}
}