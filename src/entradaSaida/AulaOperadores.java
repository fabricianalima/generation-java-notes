package entradaSaida;

import java.util.Scanner;

public class AulaOperadores {

	public static void main(String[] args) {
		// Variaveis
		float celsius, fahrenheit;

		Scanner leia = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Insira a temperatura em Celsius: ");
		celsius = leia.nextInt();

		// Processamento
		fahrenheit = celsius * 1.8f + 32;

		// Saida de Dados
		System.out.println("A temperatua em fahrenheit é: " + fahrenheit);

	}

}
