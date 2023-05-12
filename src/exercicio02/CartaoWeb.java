package exercicio02;

public abstract class CartaoWeb {

	
	
	public CartaoWeb(String destinatario) {
		super();
		this.destinatario = destinatario;
	}

	private String destinatario;
	
	
	
	public String getDestinatario() {
		return destinatario;
	}



	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}



	public abstract void showMessage();

}
