package entradaSaida;

import java.util.Scanner;

public class AulaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		String nome;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		System.out.println("Bom dia, " + nome); //concatenar

	}

}
