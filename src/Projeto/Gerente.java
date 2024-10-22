package Projeto;

public class Gerente extends Funcionarios implements Salario{
        
	public Gerente() {
		super();
	}
	
	public Gerente(String nome, String sobrenome, int matri, double SalaBase) {
		super(nome, sobrenome, matri, SalaBase);
	}
	
	@Override
	public double CalculaSala() {
		double salario;
		salario = getSalaBase()*3.5;
		return salario;
	}
	
}
