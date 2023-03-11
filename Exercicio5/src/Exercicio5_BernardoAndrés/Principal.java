package Exercicio5_BernardoAndrés;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class Principal {
	static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) throws ParseException {
		
		ArrayList<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
		
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		
		ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
		
		ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
		
		ArrayList<VendaProdutos> listaVendaProdutos = new ArrayList<VendaProdutos>();
		
		List<String> telefones = new ArrayList<String>();
		
		telefones.add("741963258");
		telefones.add("852456963");
		
		
		Fornecedor fornecedor1 = new Fornecedor ("Roberto", "robertofazendinha@gmail.com", telefones ,"rua 12", "22/09/1990", "895623147");
		listaFornecedor.add(fornecedor1);
		
		telefones.clear();
		
		telefones.add("789654123");
		telefones.add("321456987");
		
		Fornecedor fornecedor2 = new Fornecedor ("Claudio", "Claudiofazendinha@gmail.com", telefones ,"rua 15", "20/09/1991", "741258963");
		listaFornecedor.add(fornecedor2);
		
		telefones.clear();
		
		
		
		
		Produtos produtos = new Produtos (01, "Placa mãe", 1267.00, fornecedor1);
		listaProdutos.add(produtos);
		
		produtos = new Produtos (01, "Placa de video", 1599.00, fornecedor1);
		listaProdutos.add(produtos);
		
		produtos = new Produtos (02, "Memória RAM", 469.00, fornecedor2);
		listaProdutos.add(produtos);
		
		produtos = new Produtos (02, "HD", 260.00, fornecedor2);
		listaProdutos.add(produtos);
		
		
		
		
		telefones.add("984878118");
		
		Cliente cliente = new Cliente("Bernardo", "br.abar33@gmail.com", telefones, "Av. olegario", "02/09/1997", "10583710688");
		listaCliente.add(cliente);
		
		telefones.clear();
		
		telefones.add("33317524");
		telefones.add("33333342");
		
		cliente = new Cliente("Joao Bonato", "jaozin@gmail.com", telefones, "Rua 7", "02/09/1997", "10689710511");
		listaCliente.add(cliente);
		
		telefones.clear();
		
		telefones.add("33318521");
		telefones.add("65689895");
		
		
		cliente = new Cliente("Joao Arthur", "jaozinArthur@gmail.com", telefones, "Rua 20", "17/07/1998", "45493826691");
		listaCliente.add(cliente);
		
		
		
		
		
		telefones.add("988231298");
		telefones.add("33325896");	
		
		Funcionario funcionario = new Funcionario("Hanna", "hanna@gmail.com", telefones, "Rua 13", format.parse("22/10/2000"), "vendedor", "10690877", format.parse("22/06/1990"));
		listaFuncionario.add(funcionario);
		
		telefones.clear();
		
		telefones.add("99998528");
		
		funcionario = new Funcionario("Mauro", "mauro@gmail.com", telefones, "Rua 19", format.parse("22/10/2000"), "vendedor", "10690877", format.parse("22/06/1990"));
		listaFuncionario.add(funcionario);
		
		
		
		
		
		for(Produtos prod: listaProdutos ) {
			System.out.println(prod.getNome()+"  "+ prod.getForn().getNome());
		}
		
		for(Cliente cli: listaCliente) {
			System.out.println(cli.getNome() + "  "+ cli.getTelefone());
		}
		
		for(Funcionario func: listaFuncionario) {
			System.out.println(func.getNome());
			System.out.println(func.getDataadm());
		}
		
		
		
		
		
			
		
		
		
		
		
	}
}
