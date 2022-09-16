package ExerciciosHeranca;

public class TestaAnimais {

	public static void main(String[] args) {
		Cachorro auau = new Cachorro();

		auau.setNome("Billy");
		auau.setIdade(10);
		auau.setCorrer("corria muito!");

		Preguica bicho = new Preguica();

		bicho.setIdade(8);
		bicho.setSubir("gosto de subir em árvore para dormir em paz zzZZ!!!");

		Cavalo ponei = new Cavalo();

		ponei.setNome("Arco-íris");
		ponei.setIdade(5);
		ponei.setCorrer("correr delicadamente...s2");

		System.out.println("\nO nome do meu cachorro era " + auau.getNome() + ", ele tinha " + auau.getIdade()
				+ " anos e " + auau.getCorrer());
		auau.correr();

		System.out.println("\nSou uma preguiça, tenho " + bicho.getIdade() + " anos e "
				+ bicho.getSubir());
		bicho.subir();

		System.out.println(
				"\nEu queria ter um pônei chamado " + ponei.getNome() + " para ficar olhando ele " + ponei.getCorrer());
		ponei.correr();
	}
	
}
