package exercicio01;

public class Vendedor extends Funcionario {


	
	
	
	public Vendedor(String nome, String matricula, double salario_base, double comissao) {
		super(nome, matricula, salario_base);
		this.comissao = comissao;
	}


	private double comissao;

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calculaSalario() {
		return this.getSalario_base()*(1+this.getComissao()/100);
	}



	

}
