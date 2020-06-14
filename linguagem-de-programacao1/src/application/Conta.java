package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


import entities.Pessoa;

public class Conta {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Conta1");
		list.add("Conta2");
		list.add("Conta3");
		list.add("Conta4");

		list.remove("Conta1");
		
		System.out.println("Listar contas: ");
		for (String x : list) {
			System.out.println(x);

		}

		{

			System.out.println("Total Conta List: " + list.size());

		}

		Map<String, Integer> conta_numero = new TreeMap<>();
		conta_numero.put("Conta1", 123);
		conta_numero.put("Conta2", 134);
		conta_numero.put("Conta3", 174);
		conta_numero.put("Conta4", 415);
		
		conta_numero.remove("Conta1", 123);

		System.out.println("------------------");

		System.out.println("Numeros Conta Map: ");

		for (String key : conta_numero.keySet()) {
			System.out.println(key + ": " + conta_numero.get(key));
		}
		{

			System.out.println("Total Map: " + conta_numero.size());
		}

		Set<Integer> CPFClientes = new HashSet<>();

		CPFClientes.add(422178444);
		CPFClientes.add(478885585);
		CPFClientes.add(1155777555);
		CPFClientes.add(1788999999);

		CPFClientes.remove(422178444);

		System.out.println("------------------");
		System.out.println("CPF Clientes: ");
		for (Integer p : CPFClientes) {
			System.out.println(p);
		}

	System.out.println("------------------");
		
		Pessoa pessoa1 = new Pessoa ("Caroline Sousa", 477845587, "4521-1", 1247);
		
		System.out.println("Dados Pessoa 1 = Titular: " + pessoa1.getTitular() + " , CPF: " + pessoa1.getCpf() + " , Agência: " + pessoa1.getAgencia() + " , Número: " + pessoa1.getNumero());
	}
}