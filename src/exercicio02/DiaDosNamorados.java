package exercicio02;

public class DiaDosNamorados extends CartaoWeb{

	
	
	public DiaDosNamorados(String destinatario) {
		super(destinatario);
		// TODO Auto-generated constructor stub
	}

	public void showMessage() {
		System.out.println("Parabens "+this.getDestinatario()+" pelo dia dos namorados");
		
	}

}
