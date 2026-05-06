package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {

	public static void main(String[] args) {

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");

		// Stream
		List<String> estadoEmMaiusculo = estados.stream()
				.map(x -> x.toUpperCase()) // Operação intermediária (Processamento)
				.collect(Collectors.toList()); // Operação terminal (Finalização)

		List<String> estadosUnicos = estados.stream()
				.distinct()
				.collect(Collectors.toList());
		
		long quantidadeDeEstados = estados.stream()
				.distinct()
				.count(); //Operação Terminal

		System.out.println("Quantidade de estados únicos " + quantidadeDeEstados);
		System.out.println("\nEstados únicos: " + estadosUnicos);
		System.out.println("\nEstados em Maiúsculo: " + estadoEmMaiusculo);
		System.out.println("\nColeção/Dados Inicial: " + estados);

	}

}
