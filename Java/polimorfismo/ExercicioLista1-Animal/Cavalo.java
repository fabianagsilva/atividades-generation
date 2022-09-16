package ExerciciosPolimorfismo;

public class Cavalo extends SuperAnimal implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("O som que o Cavalo faz é: iiirrrrí rilinchin");
	}

	@Override
	public void dormir() {
		System.out.println("Quando dorme faz: zzZZZ");
	}

}