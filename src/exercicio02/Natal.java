package exercicio02;

public class Natal extends CartaoWeb {


	
	public Natal(String destinatario) {
		super(destinatario);
		// TODO Auto-generated constructor stub
	}

	public void showMessage() {
		System.out.println(this.getDestinatario()+" Feliz Natal!!!");
	}

}
