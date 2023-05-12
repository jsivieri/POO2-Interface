package exercicio02;

public class Aniversario extends CartaoWeb{


	
	public Aniversario(String destinatario) {
		super(destinatario);
		// TODO Auto-generated constructor stub
	}

	public void showMessage() {
		System.out.println("Parabens "+this.getDestinatario()+" pelo seu aniversário");
	}

}
