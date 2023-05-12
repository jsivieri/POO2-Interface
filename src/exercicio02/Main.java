package exercicio02;

import java.util.ArrayList;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		DiaDosNamorados dn = new DiaDosNamorados("Lilian");
		CartaoWeb dncw = dn;
		Natal nt = new Natal("Joao");
		CartaoWeb ntcw = nt;
		Aniversario niver = new Aniversario("Rafael");
		CartaoWeb nivercw = niver;
		
		
		ArrayList<String> listaCartaoWeb = new ArrayList<>();
		listaCartaoWeb.add(dncw.getDestinatario());
		listaCartaoWeb.add(nt.getDestinatario());
		listaCartaoWeb.add(nivercw.getDestinatario());
		
		dncw.showMessage();
		ntcw.showMessage();
		nivercw.showMessage();
		
		
		

	}

}
