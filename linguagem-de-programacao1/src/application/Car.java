package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import entities.Carro;

public class Car {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Gol");
		list.add("Fiat");
		list.add("peugeot");
		list.add("Chevrolet");

		list.remove("Fiat");

		System.out.println("Lista de carros: ");
		for (String x : list) {
			System.out.println(x);

		}

		{

			System.out.println("Total List: " + list.size());

		}

		Map<String, Double> tabela_placaCar_preço = new TreeMap<>();
		tabela_placaCar_preço.put("Gol", 20000.0);
		tabela_placaCar_preço.put("Peugeot", 28000.0);
		tabela_placaCar_preço.put("Fiat", 30000.0);
		tabela_placaCar_preço.put("Chevrolet", 25000.0);

		tabela_placaCar_preço.remove("Chevrolet", 25000.0);
		
		System.out.println("------------------");

		System.out.println("Listagem carros/preço Map: ");

		for (String key : tabela_placaCar_preço.keySet()) {
			System.out.println(key + ": " + tabela_placaCar_preço.get(key));
		}
		{

			System.out.println("Total Map: " + tabela_placaCar_preço.size());
		}

		System.out.println("------------------");
		
		Carro carro1 = new Carro ("Azul", "Fiat Uno", "Fiat", 2010, "XCF14");
		
		System.out.println("Dados do carro 1 = Cor: " + carro1.getCor() + " , Modelo: " + carro1.getModelo() + " , Marca: " + carro1.getMarca() + " , Ano: " + carro1.getAno() + " , Placa: " + carro1.getPlaca());
	}
	
	
	
	
}
