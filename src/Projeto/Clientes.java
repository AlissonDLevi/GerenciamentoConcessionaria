package Projeto;
import java.util.ArrayList;
public class Clientes{
       private String nome;
       private String sobrenome;
       private String email;
       private String cpf;
       private ArrayList<Carros> compras = new ArrayList<>();

       public ArrayList<Carros> getCompras() {
		return compras;
	}

	public void setCompras(Carros ca) {
		compras.add(ca);
	}
     
	public void MostrarCompras() {
			for(Carros comp: compras) {
				System.out.println(comp);
			}
		}
	
	public Clientes() {
    	   this.nome = "-";
    	   this.sobrenome = "-";
    	   this.email = "-";
    	   this.cpf = "-"; 
    	   
       }
       
       public Clientes(String nome, String sobrenome, String cpf, String email) {
    	   this.nome = nome;
    	   this.sobrenome = sobrenome;
    	   this.cpf = cpf;
    	   this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return " "+nome+ " "+sobrenome+ " \n"+compras + "";
	}


}
	
	
	
	