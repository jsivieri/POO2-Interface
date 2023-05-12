package exercicio01;

public class Assistente extends Funcionario {

	public Assistente(String nome, String matricula, double salario_base) {
		super(nome, matricula, salario_base);
		
	}

	public double calculaSalario() {
		return this.getSalario_base();
	}
	

}
