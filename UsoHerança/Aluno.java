package UsoHerança;

public class Aluno extends Pessoa { // "extends" faz com que a Classe Aluno herde a classe Pessoa

	// Atributos
	private int matricula;
	private String curso;

	// Métodos Acessores e Modificadores
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCurso() {
		return this.curso;
	}

	// Métodos da Classe
	public void cancelarMatricula() {
		if (matricula == 0) {
			System.out.println("Matrícula CANCELADA");
		} else {
			System.out.println("MATRÍCULA JÁ CANCELADA");
		}
	}

}
