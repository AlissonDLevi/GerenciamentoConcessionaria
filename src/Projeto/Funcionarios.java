package Projeto;

public abstract class Funcionarios implements Salario{
       private String nome;
       private String sobrenome;
       private int matri;
       private double SalaBase;
             
       public Funcionarios() {
    	   this.nome = "-";
    	   this.sobrenome = "-";
    	   this.matri = 0;
    	   this.SalaBase = 0; 
       }
       
       public Funcionarios(String nome, String sobrenome, int mat, double SalaBase) {
    	   this.nome = nome;
    	   this.sobrenome = sobrenome;
    	   this.matri = mat;
    	   this.SalaBase = SalaBase;
       }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getMatri() {
		return matri;
	}

	public void setMatri(int matri) {
		this.matri = matri;
	}

	public double getSalaBase() {
		return SalaBase;
	}

	public void setSalaBase(double salaBase) {
		SalaBase = salaBase;
	}
	
	@Override
	public String toString() {
		return "Funcionarios: Nome = " + nome+ " "+sobrenome + ", Matrícula = " + matri + ", Salário = " +CalculaSala();
	}    
}
