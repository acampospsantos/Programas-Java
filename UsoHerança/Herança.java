package UsoHeran�a;

public class Heran�a {
	
	public static void main (String[]args) {
		
		//Instanciando Objetos ----> NESSA APLICA��O, N�O USEI COM DETALHES O M�TODO CONSTRUTOR
		Pessoa p1 = new Pessoa();
		
		Aluno p2 = new Aluno();
		
		Professor p3 = new Professor();
		
		Funcionaria p4 = new Funcionaria();
		
		
		//As classes(agora objetos) filhas utilizando os atributos da classe M�e (PESSOA)
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cl�udio");
		p4.setNome("Fabiana");
		
		p1.setSexo("Masculino");
		p4.setSexo("Feminino");
		p2.setIdade(18);
		
		//M�todos das Classe filhas
		p2.setCurso("Inform�tica");
		p3.setSalario(2500.75);
		p4.setSetor("Estoque");
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}

}
