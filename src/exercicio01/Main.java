package exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Gerente gerente = new Gerente("Joao","12356841",6000);
		Assistente assistente = new Assistente("Fabio","45286953",6000);
		Vendedor vendedor = new Vendedor("Paulo","5852369",6000,5);
		
		
		ArrayList<Double> lista = new ArrayList<Double>();
		lista.add(gerente.calculaSalario());
		lista.add(assistente.calculaSalario());
		lista.add(vendedor.calculaSalario());
		
		System.out.println("Salario gerente: "+gerente.calculaSalario());
		System.out.println("Salario assistente: "+assistente.calculaSalario());
		System.out.println("Salario vendedor: "+vendedor.calculaSalario());
		
		
		
		double somaLista = 0;
		
		for (int n = 0; n < lista.size(); n++) {
		   somaLista += lista.get(n);
		 }
		
		System.out.println("Soma dos salários: "+somaLista);
		
		
		

	}

}
