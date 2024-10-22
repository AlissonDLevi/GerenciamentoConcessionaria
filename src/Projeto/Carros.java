package Projeto;

public abstract class Carros {
           private String marca;
           private String modelo;
           private int ano;
           private double preco;
           private int CodCar;
                    
         public Carros() {  
        	this.marca = "-";
            this.modelo = "-";
            this.ano = 0;
            this.preco = 0;
            this.CodCar = 0;
         }
        
		public Carros(String marca, String modelo, int ano, double preco, int CodCar) {  
         	 this.marca = marca;
             this.modelo = modelo;
             this.ano = ano;
             this.preco = preco;
             this.CodCar = CodCar;
          }

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public int getCodCar() {
			return CodCar;
		}

		public void setCodCar(int codCar) {
			CodCar = codCar;
		}
			
		public abstract double Receita();
		
		@Override
		public String toString() {
			return "Veículo: Marca = " + marca + ", Modelo = " + modelo + ", Ano = " + ano + ", Preço = " + preco + ", Codigo do Carro = "+ CodCar+"  ";
		}
         
           
}
