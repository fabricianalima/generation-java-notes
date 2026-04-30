package pooHeranca;

public class Estudante extends Pessoa {

	private String matricula;
	private String curso;

	public Estudante(String nome, int idade, String email, String matricula, String curso) {
		super(nome, idade, email); // super-> Representa o método construtor da classe mãe
		//Pessoa(nome, idade,email)
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}

