package poo;

public class Carro {

	// Atributos
	private String marca;
	private int rodas;
	private int portas;
	private String modelo_motor;
	
	//Métodos de Acesso/Especiais - (Get/Set)
	public String getMarca() {
		return marca;
	}
	//Método Construtor
	public Carro(String marca, int rodas, int portas, String modelo_motor) {
		this.marca = marca; //This -> Classe
		this.rodas = rodas; //Carro.rodas = 
		this.portas = portas;
		this.modelo_motor = modelo_motor;
	}
	
	public void setMarca(String marca) {
		this.marca = marca; //(This) Essa classe
		
	}
	
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public String getModelo_motor() {
		return modelo_motor;
	}
	public void setModelo_motor(String modelo_motor) {
		this.modelo_motor = modelo_motor;
	}
	
	// métodos
	public void locomover() {
		System.out.println("Estou me locomovendo...");
	}

	public String parar() {
		return "Estou me parando";
		
	               
	}
}
