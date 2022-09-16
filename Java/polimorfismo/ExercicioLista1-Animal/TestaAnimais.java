package ExerciciosPolimorfismo;

public class TestaAnimais {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro();
		System.out.println("\nO cachorro: ");
		dog.dormir();
		dog.somAnimal();

		Preguica bicho = new Preguica();
		System.out.println("\nA preguiça: ");
		bicho.dormir();
		bicho.somAnimal();

		Cavalo ponei = new Cavalo();
		System.out.println("\nO cavalo: ");
		ponei.dormir();
		ponei.somAnimal();

	}

}