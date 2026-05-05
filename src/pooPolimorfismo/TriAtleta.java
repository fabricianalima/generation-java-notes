package pooPolimorfismo;

public class TriAtleta extends Pessoa implements ICiclista{
	
	int competicoes;
	int numero;

	public TriAtleta(String nome, int idade, int competicoes) {
		super(nome, idade);
		this.competicoes = competicoes;
	}

	public int getCompeticoes() {
		return competicoes;
	}

	public void setCompeticoes(int competicoes) {
		this.competicoes = competicoes;
	}
	
	public void competicoesConcluidas () {
		System.out.println("Competições concluídas: " + this.competicoes);
	}
	
	//Polimorfismo de sobrecarga, o método possui o mesmo nome, mas diferentes parâmetros.
	public void competicoesConcluidas (int numero) {
		System.out.println("Competições concluídas: " + this.numero);
	}
	
	//Polimorfismo de sobreescrita, o método possui o mesmo nome, mas são adicionadas mais caracteristicas
	public void visualizar() {
		super.visualizar();
		System.out.println("Competições: " + competicoes);
	}

	//Métodos implementados das Interfaces
	//Implementar = Add lógica a um método (Objetivo da interface)

	@Override
	public void pedalar() {
		System.out.println("Estou pedalando...");
		
	}
	
	@Override
	public void aquecer() {
		System.out.println("Estou aquecendo...");
		
	}
}

