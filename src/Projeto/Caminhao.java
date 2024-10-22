package Projeto;

public class Caminhao extends Carros{
        private int pMax;
     
        public Caminhao() {
        	super();
        }
        
        public Caminhao(String marca, String modelo, int ano, double preco, int CodCar, int pMax) {
        	super(marca, modelo, ano, preco, CodCar);
        	this.pMax = pMax;
        }

		public int getpMax() {
			return pMax;
		}

		public void setpMax(int pMax) {
			this.pMax = pMax;
		}

		public double Receita() {
    		return 0;
    	}

}
