package Projeto;

public class Vendedor extends Funcionarios implements Salario{
        private int comissao;      
        
        public Vendedor() {
        	super();
        	this.comissao = 0;
        }
        
        public Vendedor(String nome, String sobrenome, int matri, double SalaBase) {
        	super(nome, sobrenome, matri, SalaBase);
        }

		public int getComissao() {
			return comissao;
		}

		public void setComissao(int comissao) {
			this.comissao += comissao;
		}
		
		@Override
		public double CalculaSala() {
			double salario; 
			salario = getSalaBase() + this.comissao;
			return salario;
		}
}
