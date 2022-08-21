package UsoHerança;

public class Professor extends Pessoa{ // "extends" faz com que a Classe Professor herde a classe Pessoa

	//Atributos
	private String especialidade;
	private double salario;
	
	//Métodos Acessores e Modificadores
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getEspecialidade() {
		return this.especialidade;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}
	
	
	//Métodos da Classe
	public void receberAumento(double aumento) {
		this.setSalario(this.getSalario() + aumento);
	}
}
