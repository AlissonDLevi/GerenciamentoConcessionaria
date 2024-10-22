package Projeto;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class GerirFunc{
	private static ArrayList<Funcionarios> lista = new ArrayList<Funcionarios>();
	static ArrayList<Clientes> lista1 = new ArrayList<Clientes>();
	
	public ArrayList<Clientes> getLista1() {
		return lista1;
	}

	public int Log(int m) {
		for(Funcionarios f: lista) {
			if(f.getMatri() == m) {
				if(f instanceof Vendedor) {
					return 1;
				}else if(f instanceof Gerente) {
					return 2;
			    }
		     }
	     }return 0;
	}
	
	public void CadastrarFuncionario() {
		Scanner ler = new Scanner(System.in);
		try{System.out.println("Digite o nome do Funcionário");
		System.out.println("Digite o sobrenome do Funcionário");
		System.out.println("Digite id e o salário do Funcionário");
		Vendedor V = new Vendedor(ler.next(),ler.next(),ler.nextInt(),ler.nextDouble());
		AddFunc(V);
		}catch(Exception e) {
			System.out.println("Erro, tente novamente");
		}
	}

	public void RemoveFuncionario() {
		Scanner ler = new Scanner(System.in);
	try{
		System.out.println("Informa a matrícula do funcionário que deseja demitir\n");
		int matri = ler.nextInt();
		for(Funcionarios f: lista) {
			if(f.getMatri() == matri) {
				lista.remove(f);
				System.out.println("Funcionário Removido\n");
				return;
			}
		}System.out.println("Funcionário Inexistente\n");
	}catch(Exception e){
		System.out.println("Letras não são permitidas\n");
		RemoveFuncionario();
	}
    }
	
	public Funcionarios EscolheFuncionario(int id) {
		for(Funcionarios f: lista) {
			if(f.getMatri() == id) {
				return f;		
			}
		}	return null;
	}
	
	public void FuncionarioVendedor() {
		for(Funcionarios f: lista) {
			if(f instanceof Vendedor) {
				Vendedor V = (Vendedor) f;
				System.out.println(f+ ", Comissão = " +V.getComissao());
			}		
		}
	}
	
	public void MostrarClientes() {
		if(lista1.size() == 0) {
			System.out.println("Você não tem clientes, feche sua loja\n");
			return;
		}
		for(Clientes A: lista1) 
		System.out.println(A);
	}
	
	public void FuncionarioGerente() {
		for(Funcionarios f: lista) {
				if(f instanceof Gerente) {
					System.out.println(f);
					return;
				}	
			}System.out.println("Sem gerente");
	}
	
	public void TodosFuncionarios() {
		if(lista.size() == 0) {
			System.out.println("Não há funcionários cadastrados\n");
			return;
		}
		for(Funcionarios f: lista) 
			System.out.println(f);
		}
	
	public void CadastrarCliente() {
		Scanner ler = new Scanner(System.in);
	try {System.out.println("Digite o nome do cliente\n");
	    String nome = ler.next();
	    System.out.println("Digite o sobrenome\n");
	    String sobrenome = ler.next();
	    System.out.println("Digite o CPF\n");
	    String cpf = ler.next();
	    if (cpf.matches("\\d+")){
	    System.out.println("Digite seu email:");
        String email = ler.next();
        for(Clientes cli: lista1){
        if(cli.getEmail().equals(email)){
        	System.out.println("Ja existe cliente com esse email\n");
            return;
        }
        }
	    while (true){
            if (ValidadeEmail(email)) {
               Clientes C = new Clientes(nome, sobrenome, cpf, email);
               AdicionarCliente(C);
               break;
            }else {
                System.out.println("E-mail inválido! Tente novamente.");
                CadastrarCliente();
            }            
        }	    
	}else {
		System.out.println("Esperava-se que o CPF fosse apenas números");
		CadastrarCliente();
	}
	   }catch(Exception e) {
			System.out.println("Escrita inválida, tente novamente");
	}
	}
	
	public Clientes EscolheCliente() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o CPF do cliente!\n");
		String cpf = ler.next();
		for(Clientes L: lista1)
		if(L.getCpf().equals(cpf)) {
		    return L;
		}
		return null;
	}
	
	public void AdicionarCliente(Clientes A) {
		for(Clientes B: lista1) {
	 		   if(B.getCpf().equals(A.getCpf())) {
	 			   System.out.println("Funcionário ja cadastrado com esssa CPF\n");  
	 			   return;
	 		   }
	 		   }
	 	   lista1.add(A);
	 	   System.out.println("Cliente cadastrado!");
	 	   }	
	
	public boolean ValidadeEmail(String email) {
		String emailvalido = "^[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	    String[] parts = email.split("@");
        if (parts.length != 2) {
            return false; 
        }
        String domain = parts[1];
        Pattern pattern = Pattern.compile(emailvalido);
        Matcher matcher = pattern.matcher(domain);
        return matcher.matches();
    }
	
	public void AddFunc(Funcionarios f) {
 	   for(Funcionarios A: lista) {
 		   if(A.getMatri() == f.getMatri()) {
 			   System.out.println("Funcionário ja cadastrado com esssa matrícula\n");  
 			   return;
 		   }
 		   }
 	   lista.add(f);
 	   System.out.println("Funcionário adicionado");
 	   }
	
	
	public void comissao() {
		   Scanner ler = new Scanner(System.in);
		   System.out.println("Informa a matrícula do vendedor que fez a venda");
		   int log = ler.nextInt();
		   for(Funcionarios f: lista) {
			   if(f.getMatri() == log) {
				   Vendedor V = (Vendedor) f;
				   V.setComissao(100);
			   }
		   }
	   }
	   	
	public double folhaSalarial() {
 	   if(lista.size() == 0) {
 		   return 0;
 	   }double folha = 0;
 	   for(Funcionarios x: lista) {
 		   folha = folha + x.CalculaSala();  
 	   }return folha;
    } 

}
