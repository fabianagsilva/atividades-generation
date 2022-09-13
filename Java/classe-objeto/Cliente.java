/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package ExerciciosClasseObjeto;

public class Cliente {

	// Declaração dos Atributos da Classe
	private String nome;
	private char sexo;
	private String nacionalidade;
	private int idade;

	// Construtor
	public Cliente(String nome, char sexo, String nacionalidade, int idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
	}

	// Declaração dos demais métodos da Classe.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void imprimirInfo() {
		System.out.println("Nome do cliente: " + nome + "\nsexo [F] ou [M]: " + sexo + "\nNacionalidade: "
				+ nacionalidade + "\nIdade: " + idade);
	}

}
