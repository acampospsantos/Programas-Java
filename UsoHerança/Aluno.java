package UsoHeran�a;

public class Aluno extends Pessoa { // "extends" faz com que a Classe Aluno herde a classe Pessoa

	// Atributos
	private int matricula;
	private String curso;

	// M�todos Acessores e Modificadores
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

	// M�todos da Classe
	public void cancelarMatricula() {
		if (matricula == 0) {
			System.out.println("Matr�cula CANCELADA");
		} else {
			System.out.println("MATR�CULA J� CANCELADA");
		}
	}

}
