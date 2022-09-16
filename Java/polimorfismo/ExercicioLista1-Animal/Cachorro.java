package ExerciciosPolimorfismo;

public class Cachorro extends SuperAnimal implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("Quando late faz: auu auu");
	}

	@Override
	public void dormir() {
		System.out.println("Quando dorme faz: zzZZZ");
	}

}