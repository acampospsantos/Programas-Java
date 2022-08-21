package UsoHerança;

public class Pessoa {
	
	//Atributos (encapsulados)
	private String nome;
	private int idade;
	private String sexo;
	
	//Métodos acessores e modificadores(Getters e Setters)
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
	
	public void setSexo(String sexo) {
		if (sexo == "M" || sexo =="Masculino") {
			this.sexo = sexo;
		} else if(sexo == "F" || sexo == "Feminino"){
			this.sexo = sexo;
		}
	}
	public String getSexo() {
		return this.sexo;
	}
	
	//Métodos da Classe
	public void fazerAniver() {
		this.setIdade(this.getIdade() + 1); //this.idade = this.idade + 1
	}
	
	@Override
	public String toString() {
		return "Pessoa {" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
	}	

}
