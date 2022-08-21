package UsoHeran�a;

public class Funcionaria extends Pessoa { // "extends" faz com que a Classe Funcionaria herde a classe Pessoa

	//Atributos
	private String setor;
	private boolean trabalhando;
	
	//M�todos Acessores e Modificadores
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
	
	//M�todos da Classe
	public void mudarTrabalho() {
		if (this.getTrabalhando() == false) {
			this.setTrabalhando(true);
		} else { //this.getTrabalhando() == true
			this.setTrabalhando(false);
		}
	}
}
