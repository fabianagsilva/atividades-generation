package ExerciciosPolimorfismo;

public class Preguica extends SuperAnimal implements Animal{
	
	@Override
	public void somAnimal() {
		System.out.println("O som que a Preguiça faz é: aaAAh aaAAh");
	}

	@Override
	public void dormir() {
		System.out.println("Quando dorme faz: zzZZZ");
	}

}