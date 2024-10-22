package Projeto;
import java.util.ArrayList;
import java.util.Scanner;
public class GerirCarros{
	   private double receita = 0;
	   private double valor = 0;
	   private static ArrayList<Carros> carros = new ArrayList<Carros>();
	   private static ArrayList<Carros> ListaCompras = new ArrayList<Carros>();
	   GerirFunc GF = new GerirFunc();

		public void setReceita(double receita) {
			this.receita = receita;
		}
	   
	    public double getReceita() {
		return receita;
	    }
	   
	   public void CadastrarCarros() {
		Scanner ler = new Scanner(System.in);
	try{
		System.out.println("1 = Carro popular"
				+ "\n2 = Caminhão\n");
		int TCarro = ler.nextInt();
		if(TCarro == 1) {
			System.out.println("Informe a marca do carro");
	   		String marca = ler.next();
	   		System.out.println("Informa o modelo do carro");
	   		String modelo = ler.next();
	   		System.out.println("Informe o ano de lançamento");
	   		int ano = ler.nextInt();
	   		System.out.println("Informe o preço a ser vendido");
	   		double preco = ler.nextDouble();
	   		System.out.println("Informe o código para cadastrar o carro");
	   		int cod = ler.nextInt();
	   		Passeio p = new Passeio(marca, modelo, ano, preco, cod);
			AddCarros(p);
		}else if(TCarro == 2) {
			System.out.println("Informe a marca do carro");
	   		String marca = ler.next();
	   		System.out.println("Informa o modelo do carro");
	   		String modelo = ler.next();
	   		System.out.println("Informe o ano de lançamento");
	   		int ano = ler.nextInt();
	   		System.out.println("Informe o preço a ser vendido");
	   		double preco = ler.nextDouble();
	   		System.out.println("Informe o código para cadastrar o carro");
	   		int cod = ler.nextInt();
	   		System.out.println("Informe o peso máximo suportado em toneladas\n");
	   		int pesoM = ler.nextInt();
	   		Caminhao C = new Caminhao(marca, modelo, ano, preco, cod, pesoM);
	   		AddCarros(C);
		}else{
			System.out.println("Opção inválida, tente novamente\n");
			CadastrarCarros();
		}		
        }catch(Exception e) {
			System.out.println("Erro, tente denovo");
			CadastrarCarros();
		}
	   }
	    
	   public void AddCarros(Carros C) {
		       for(Carros c: carros) {
			   if(c.getCodCar() == C.getCodCar()) {
				   System.out.println("Já existe um carro cadastrado com esse código");
				   return;
			   }
		   }
		   carros.add(C);
		   System.out.println("Carro adicionado");

	   }
	   
	   public void BuscarCarro(String nome) {
		   for(Carros c: carros) {
			   if(c.getModelo().equalsIgnoreCase(nome)) {
				   if(c instanceof Caminhao){
					   Caminhao C= (Caminhao) c;
					   System.out.println(C+ ", Peso Máximo = "+C.getpMax());
				   }else {
					   System.out.println(c);
				   }
			   }
		   }
	   }
	   
	   public void MostrarCarros() {
		   if(carros.size() == 0) {
			   System.out.println("Não há carros no estoque");
			   return;
		   }
		   for(Carros c: carros) {
			   if(c instanceof Caminhao) {
					   Caminhao C= (Caminhao) c;
					   System.out.println(C+ ", Peso Máximo = "+C.getpMax());
			   }else if(c instanceof Passeio){
			   System.out.println(c);
			   }
		   }
	   }   
	   
	   public void VenderCarros() {
		   Scanner ler = new Scanner(System.in);
		   try{
		   System.out.println("Informa o código do carro a ser vendido\n");
		   int cod = ler.nextInt();
		   for(Carros car: carros) {
			   if(car.getCodCar() == cod) {
				   System.out.println("Informe CPF do comprador\n");
				   String cpf = ler.next();
				   for(Clientes C: GF.getLista1()) {
					   if(C.getCpf().equals(cpf)){						  
						   System.out.println("Carro = " +car+ "Vendido para: "+C );					   
						   valor = valor + car.getPreco();
						   ListaCompras.add(car);
						   C.setCompras(car);
						   carros.remove(car);
						   GF.comissao();
						   return;
					   }
				   }				   			   				   
			   }		  
		   }
           }catch(Exception e) {
			   System.out.println("Erro!\n");
			   VenderCarros();
		   }
	   }
	   
	   public void RemoverCarro() {
		   Scanner ler = new Scanner(System.in);
		  try {
		   System.out.println("Digite o id do carro para exluir\n");
		   int id = ler.nextInt();
		   for(Carros c: carros) {
			   if(c.getCodCar() == id) {
				   carros.remove(c);
				   System.out.println("Carro removido\n");
				   return;
			   }
		   }System.out.println("Carro inexistente ou código errado!\n");
		  }catch(Exception e) {
			  System.out.println("Tente novamente\n");
		  }
	   }
	   
	   public void CarroPasseio() {
		   for(Carros c: carros) {
			   if(c instanceof Passeio) {
				   System.out.println(c);
			   }
		   }
	   }
	   
	   public void Caminhao() {
		   for(Carros c: carros) {
			   if(c instanceof Caminhao) {
				   Caminhao C= (Caminhao) c;
				   System.out.println(C+ ", Peso Máximo = "+C.getpMax());				 
			   }
		   }
	   }  
	   
	   public double Receita() {
		    this.receita = this.valor + this.valor;
		    return valor;	  
	   }
}
