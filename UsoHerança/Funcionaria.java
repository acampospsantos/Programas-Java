package UsoHerança;

public class Funcionaria extends Pessoa { // "extends" faz com que a Classe Funcionaria herde a classe Pessoa

	//Atributos
	private String setor;
	private boolean trabalhando;
	
	//Métodos Acessores e Modificadores
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getSetor() {
		return this.setor;
	}
	
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	public boolean getTrabalhando() {
		return this.trabalhando;
	}
	
	//Métodos da Classe
	public void mudarTrabalho() {
		if (this.getTrabalhando() == false) {
			this.setTrabalhando(true);
		} else { //this.getTrabalhando() == true
			this.setTrabalhando(false);
		}
	}
}
