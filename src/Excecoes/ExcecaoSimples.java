package Excecoes;

public class ExcecaoSimples extends Exception{

	//atributo que define a versão
	private static final long serialVersionUID = 1L;
	
	public ExcecaoSimples() {}
	
	public ExcecaoSimples(String mensagem) {
		super(mensagem);
	}

}
