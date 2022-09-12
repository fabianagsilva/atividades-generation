/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

package ExercicioLacosDeRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int i, n, quantiaPar = 0, quantiaImpar = 0;

		for (i = 1; i <= 10; i++) {
			System.out.println("Entre com um número qualquer: ");

			n = leia.nextInt();

			if (n % 2 == 0) {
				quantiaPar++;

			} else {
				quantiaImpar++;
			}
		}

		if (quantiaPar == 1) {
			System.out.println("\n" + quantiaPar + " Número é par! ");
		} else {
			System.out.println("\n" + quantiaPar + " Números são pares! ");
		}

		if (quantiaImpar == 1) {
			System.out.println("\n" + quantiaImpar + " Número é ímpar! ");
		} else {
			System.out.println("\n" + quantiaImpar + " Números são ímpares! ");
		}
	}
}
