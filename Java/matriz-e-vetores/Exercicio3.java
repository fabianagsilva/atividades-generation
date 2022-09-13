/* 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

package ExercicioMatrizesVetores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		int[][] numero = new int[3][3];
		int somaNumero = 0, linha, coluna;

		Scanner ler = new Scanner(System.in);

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {

				System.out.println("\nEntre com um número na linha: " + linha + " e coluna: " + coluna + " : ");
				numero[linha][coluna] = ler.nextInt();

				if (numero[linha][coluna] > 10) {
					somaNumero += numero[linha][coluna];
				}
			}
		}

		System.out.println("\nSomatório dos números maiores que 10: " + somaNumero);
	}

}
