package entradaSaida;

import java.util.Scanner;

public class AulaOperadores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		// Variaveis
		float celsius, fahrenheit;

		// Entrada de Dados
		System.out.println("Insira a temperatura em Celsius: ");
		celsius = leia.nextFloat();

		// Processamento
		fahrenheit = (celsius * 1.8f) + 32;

		// Saida de Dados
		System.out.println("A temperatua em fahrenheit é: " + fahrenheit);
		leia.close();
	}

}
