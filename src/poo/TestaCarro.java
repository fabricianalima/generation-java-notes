package poo;

public class TestaCarro {

	public static void main(String[] args) {
		//Instanciamento | Instanciar um objeto
		
		Carro c1 = new Carro("Kombi", 4, 4, "XYZ"); //Foi criado o método construtor, agora não é possivel criar um objeto sem os parametros
		Carro c2 = new Carro("Toyota", 2, 4, "Supra");
		
		//Atributos private não podem ser acessados diretamente
		//c1.marca = "kombi";
		//c1.portas = 4;
		
		/*
		c1.setMarca("Kombi");
		c1.setPortas(4);
		*/
		
		c1.locomover();
		
		
		System.out.println("Marca: " + c1.getMarca());
		System.out.println("Qtde. Portas" + c1.getPortas());
		System.out.println("Modelo: " + c1.getModelo_motor());
		System.out.println("Marca: " + c2.getMarca());
		System.out.println("Qtde. Portas" + c2.getPortas());
		System.out.println("Modelo: " + c2.getModelo_motor());

		System.out.println(c1.parar());
	}

}
