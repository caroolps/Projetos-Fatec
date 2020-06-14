package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import entities.Lugar;

public class Viagens {
	
public static void main(String[] args) {
		
		List<String> destinos = new ArrayList<>();

		destinos.add("Maresias");
		destinos.add("Ilhabela");
		destinos.add("Santos");
		destinos.add("Ubatuba");

		destinos.remove("Santos");
		
		System.out.println("Listar destinos: ");
		for (String x : destinos) {
			System.out.println(x);

		}

		{

			
			System.out.println("Total destinos List: " + destinos.size());

		}

		Map<String, Double> pacote = new TreeMap<>();
		pacote.put("Maresias", 300.0);
		pacote.put("Ilhabela", 250.0);
		pacote.put("Santos", 320.0);
		pacote.put("Ubatuba", 220.0);

		
		pacote.remove("ubatuba", 220.0);
		
		System.out.println("------------------");

		System.out.println("Pacotes Map: ");
		
		for (String key : pacote.keySet()) {
			System.out.println(key + ": " + pacote.get(key));
		}
		{
			
			System.out.println("Total Pacotes Map: " + pacote.size());
		}
		

	Set<Integer> CPFClientes = new HashSet<>();
		
	CPFClientes.add(422178444);
	CPFClientes.add(478885585);
	CPFClientes.add(1155777555);
	CPFClientes.add(1788999999);
	
		
    CPFClientes.remove(422178444);
		
	System.out.println("------------------");
	System.out.println("CPF Clientes: ");
		for(Integer p : CPFClientes) {
			System.out.println(p);		
	}
		
	System.out.println("------------------");
		
		Lugar pessoa1 = new Lugar ("Caroline Sousa", 477845587, "Crédito", "Santos");
		
		System.out.println("Dados Pessoa 1 = Nome: " + pessoa1.getNome() + " , CPF: " + pessoa1.getCpf() + " , Forma de Pagamento: " + pessoa1.getPagamento() + " , Destino: " + pessoa1.getDestino());
	}
		

}
	

