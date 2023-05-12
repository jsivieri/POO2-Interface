package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Retangulo retangulo = new Retangulo(3,4);
		Circulo circulo = new Circulo(5);
		
		List<Double> lista = new ArrayList<Double>();
		lista.add(retangulo.calcularArea());
		lista.add(circulo.calcularArea());
		lista.add(retangulo.calcularPerimetro());
		lista.add(circulo.calcularPerimetro());
		
		for (int n = 0; n < lista.size(); n++) {
			   System.out.println(lista.get(n));
			 }
		
		
		

	}

}
