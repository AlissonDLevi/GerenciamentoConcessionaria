package Projeto;
import java.io.IOException;
import java.util.Scanner;
public class Principal{
		 static Clientes CC = new Clientes();	
		 static GerirCarros GG = new GerirCarros();
		 static GerirFunc GF = new GerirFunc();
	public static void main(String[] args)throws IOException{ 
		Gerente G = new Gerente("Ruan ", "Mendes", 001, 5000);
		GF.AddFunc(G);
		loguin();
	    }
		public static void loguin() {
	    GerirFunc GF = new GerirFunc();
		Scanner ler = new Scanner(System.in);
		System.out.println("Bem vindo, faça seu loguin!\n");
		try {int log = ler.nextInt();
		if(GF.Log(log) == 1) {
		 	MenuVendedor();
		 	return;
		}else if(GF.Log(log) == 2){
		   MenuGerente();
		}else if(GF.Log(log) == 0) {
			System.out.println("Não registrado!\n");			
			loguin();
		}
		}catch(Exception e){
			System.out.println("Loguin inválido, tente novamente!\n");
			loguin();
		   }
		}
	    public static void MenuVendedor() { 
	    Scanner ler = new Scanner(System.in);
	try{
		int op = 0;
		while(op != 7){
		    System.out.println("\t                       Bem vindo\n                    ");                                     					
            System.out.println("\t                        CARROS                       |");  				
			System.out.println("\t1                  Cadastrar cliente                 |");
            System.out.println("\t2 =                  Vender Carros                   |");
			System.out.println("\t3 =           Consultar o Carro por modelo           |");
			System.out.println("\t4 =        Consultar apenas Carros populares         |");
			System.out.println("\t5 =          Pesquisar apenas por Caminhões          |");			
			System.out.println("\t6 =   Mostrar todos os veículos da concessionária    |\n");
			System.out.println("                     Ou Digite '7' para sair              ");
           	op = ler.nextInt();
           	switch (op) {
           	case 1:
           		GF.CadastrarCliente();
           		break;
           	case 2:
           		GG.VenderCarros();         		
           		break;
           	case 3:
           		Scanner le = new Scanner(System.in);
                System.out.println("Informe o nome do carro\n");
                String nome = le.next();
           		GG.BuscarCarro(nome);
           		break;
           	case 4:
           		GG.CarroPasseio();
           		break;
           	case 5:
           		GG.Caminhao();
           		break;
            case 6:
            	GG.MostrarCarros();
            	break;
            case 7:
            	System.out.println("Até a próxima, meu amigo!");
            	loguin();
            	break;
            default:
            	System.out.println("Opção inválida\n");
           	} 
		}
	    }catch(Exception e) {
	    	System.out.println("Nada além de números!");
	    	MenuVendedor();
	    }
		}
	    
	    public static void MenuGerente() {
	    	    Scanner ler = new Scanner(System.in);
	        try{
	        	int op = 0;
	    	    while(op != 20) {
	    	    System.out.println("\t                                                 Bem vindo, Chefe\n                                              ");				
		        System.out.println("\t                   FUNCIONÁRIOS                                                    CARROS                        ");
		        System.out.println("\t1 =           Adicionar Funcionário                       11 =                 Adicionar Carros                 |");
		        System.out.println("\t2 =            Remover Funcionário                        12 =                      Empty                       |");
		        System.out.println("\t3 =    Consultar Funcionário pela matrícula               13 =          Consultar o Carro pelo modelo           |");
		        System.out.println("\t4 =          Mostrar apenas Vendedores                    14 =        Consultar apenas Carros populares         |");
		        System.out.println("\t5 =           Mostrar apenas Clientes                     15 =          Pesquisar apenas por Caminhões          |");			
		        System.out.println("\t6 =           Mostrar apenas Gerentes                     16 =     Mostrar todos os carros da concessionária    |");
		        System.out.println("\t7 =  Mostrar todos os Funcionários da Concessionária      17 =                 Receita em vendas                |");
		        System.out.println("\t8 =        Mostrar gasto da Concessionária                18 =              Lucro total da empresa              |");
		        System.out.println("\t9 =             Cadastrar cliente                         19 =                   Remover Carro                  |");
		        System.out.println("\t10=           Mostrar cliente por cpf                     22 =                      Empty                       |");
		        System.out.println("                                                   Ou digite '21' para sair                                      \n");
	    	    op = ler.nextInt();
	    	    switch (op) {
	    	    case 1:
	    	    	GF.CadastrarFuncionario();
	    	    	break;
	    	    case 2:
	    	    	GF.RemoveFuncionario();
	    	    	break;
	    	    case 3:
	    	    	Scanner le = new Scanner(System.in);
	                System.out.println("Informe o id do funcionário\n");
	                int id = le.nextInt();
	    	    	if((GF.EscolheFuncionario(id)) == null) {
	    	    		System.out.println("Funcionário inexistente\n");
	    	    	}else{
	    	    		System.out.println(GF.EscolheFuncionario(id));
	    	    	}
	    	    	break;
	    	    case 4:
	    	        GF.FuncionarioVendedor();
	    	    	break;
	    	    case 5:
	    	    	GF.MostrarClientes();
	    	    	break;
	    	    case 6:
	    	    	GF.FuncionarioGerente();
	    	    	break;
	    	    case 7:
	    	    	GF.TodosFuncionarios();
	    	    	break;
	    	    case 8:
	    	    	System.out.println(GF.folhaSalarial());
	    	    	break;
	    	    case 9:
	    	    	GF.CadastrarCliente();
	    	    	break;
	    	    case 10:
	    	    	System.out.println(GF.EscolheCliente());
	    	    	CC.MostrarCompras();
	    	    	break;
	    	    case 11:
	    	    	GG.CadastrarCarros();
	    	    	break;
	    	    case 12:
	    
	    	    	break;
	    	    case 13:
	    	    	Scanner l = new Scanner(System.in);
	                System.out.println("Informe o nome do carro\n");
	                String nome = l.next();
	                GG.BuscarCarro(nome);
	    	    	break;
	    	    case 14:
	    	    	GG.CarroPasseio();
	    	    	break;
	    	    case 15:
	    	    	GG.Caminhao();
	    	    	break;
	    	    case 16:
	    	    	GG.MostrarCarros();
	    	    	break;
	    	    case 17:
	    	    	System.out.println("Valor em vendas = "+GG.Receita());
	    	    	break;
	    	    case 18:
	    	    	double lucro = GG.Receita() - GF.folhaSalarial();
			    	System.out.println("Lucro atual = " +lucro);
			    	break;
	    	    case 19:
	    	    	GG.RemoverCarro();
	    	    	break;
	    	    case 21:
	    	    	loguin();
	    	    	break;
	    	    default:
	    	    	System.out.println("Opção inválida!");
	    	    	break;
	    	    }
	    }
}catch(Exception e){
	System.out.println("Letras não são permitidas\n");
	MenuGerente();
}
	    }
	    }
  
  