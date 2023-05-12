package exercicio01;

public abstract class Funcionario {


	
	public Funcionario(String nome, String matricula, double salario_base) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salario_base = salario_base;
	}

	private String nome, matricula;
	private double salario_base;
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public double getSalario_base() {
		return salario_base;
	}



	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}



	abstract double calculaSalario();

}
