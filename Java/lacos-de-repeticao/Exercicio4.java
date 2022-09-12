/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/

package ExercicioLacosDeRepeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {

		int idade, genero, fatorPsico, contCalmas = 0, contMulNerv = 0, contHomAgres = 0, contNaoDeclCalmas = 0,
				contNervMaisQuarenta = 0, contMenosDezoito = 0, pessoas = 1;

		Scanner leia = new Scanner(System.in);

		while (pessoas <= 150) {

			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			while (idade < 1 || idade > 120) {
				System.out.println("\nOpção Inválida!!! \nEntre com a sua idade novamente: ");
				idade = leia.nextInt();
			}
			System.out.println("\nEntre com o genero:\n(1)Feminino\n(2)Masculino\n(3)Não declarado ");
			genero = leia.nextInt();
			while (genero < 1 || genero > 3) {
				System.out.println("\nOpção Inválida!!! \nEntre com o genero novamente:\n(1)Feminino\n(2)Masculino\n(3)Não declarado ");
				genero = leia.nextInt();
			}
			System.out.println("\nEntre com o seu fator psicológico:\n(1)Calma\n(2)Nervosa\n(3)Agressiva ");
			fatorPsico = leia.nextInt();
			while (fatorPsico < 1 || fatorPsico > 3) {
				System.out.println("\nOpção Inválida!!! \nEntre com o seu fator psicológico novamente:\n(1)Calma\n(2)Nervosa\n(3)Agressiva ");
				fatorPsico = leia.nextInt();
			}

			if (fatorPsico == 1) {
				contCalmas++;
			}

			if (genero == 1 && fatorPsico == 2) {
				contMulNerv++;
			}

			if (genero == 2 && fatorPsico == 3) {
				contHomAgres++;
			}

			if (genero == 3 && fatorPsico == 1) {
				contNaoDeclCalmas++;
			}

			if (fatorPsico == 2 && idade > 40) {
				contNervMaisQuarenta++;
			}

			if (fatorPsico == 1 && idade < 18) {
				contMenosDezoito++;
			}

			pessoas++;
		}
		System.out.println("\nNúmero de pessoas calmas: " + contCalmas);
		System.out.println("\nNúmero de mulheres nervosas: " + contMulNerv);
		System.out.println("\nNúmero de homens agressivos: " + contHomAgres);
		System.out.println("\nNúmero de pessoas não declaradas calmas: " + contNaoDeclCalmas);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: " + contNervMaisQuarenta);
		System.out.println("\nNúmero de pessoas calmas com menos de 18 anos: " + contMenosDezoito);

	}

}