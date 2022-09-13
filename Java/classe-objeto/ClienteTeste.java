/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package ExerciciosClasseObjeto;

public class ClienteTeste {

	public static void main(String[] args) {

		// instancia classe Cliente
		Cliente cliente1 = new Cliente("\nPriscila Davanse", 'F', "Brasileira", 29);
		Cliente cliente2 = new Cliente("\nFabiana Gonçalves", 'F', "Brasileira", 37);

		System.out.println("\n*****************Cadastro realizado com sucesso****************");
		cliente1.setNome("Patricia");
		cliente1.setIdade(33);
		cliente1.imprimirInfo();

		System.out.println("\n*****************Cadastro realizado com sucesso****************");
		cliente2.setNome("Rebeca");
		cliente2.setIdade(45);
		cliente2.imprimirInfo();

	}

}
