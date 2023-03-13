package Exercicio5_BernardoAndrés;

import java.util.ArrayList;

public class VendaProdutos {
	private ArrayList<Cliente> cliente;
	private ArrayList<Produtos> produtos;
	private ArrayList<Fornecedor> fornecedor;
	private ArrayList<Funcionario> funcionario;
	private Double valorTotal;
	private Double valorFinal;
	
	
	
	public VendaProdutos(ArrayList<Cliente> cliente, ArrayList<Produtos> produtos, ArrayList<Fornecedor> fornecedor, ArrayList<Funcionario> funcionario, Double valorTotal,
			Double valorFinal) {
		super();
		this.cliente = cliente;
		this.produtos = produtos;
		this.fornecedor = fornecedor;
		this.funcionario = funcionario;
		this.valorTotal = valorTotal;
		this.valorFinal = valorFinal;
	}

	//Encapsulamento

	public ArrayList<Cliente> getCliente() {
		return cliente;
	}


	public void setCliente(ArrayList<Cliente> cliente) {
		this.cliente = cliente;
	}


	public ArrayList<Fornecedor> getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(ArrayList<Fornecedor> fornecedor) {
		this.fornecedor = fornecedor;
	}


	public ArrayList<Produtos> getProduto() {
		return produtos;
	}


	public void setProduto(ArrayList<Produtos> produto) {
		this.produtos = produto;
	}


	public ArrayList<Funcionario> getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(ArrayList<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}


	public Double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public Double getValorFinal() {
		return valorFinal;
	}


	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}
	
	
	public void getValorFinalComDesconto(String cpf) {
		
		int verificaPessoa = 0;
		for(Cliente cli: cliente) {
			if(cli.getCpf() == cpf) {
				//System.out.println("teste de for");
				System.out.println("Nome do cliente:" +cli.getNome());
				System.out.println("Valor total da comrpra: " + valorTotal);
				System.out.println("Valor Final da compra:" + valorTotal * 0.9);
				verificaPessoa = 1;
				//return valorTotal * 10;
				
			}
		}
		
		
		for(Funcionario fun: funcionario) {
			if(fun.getCpf() == cpf) {
				//System.out.println("teste de for");
				System.out.println("Nome do Funcionario: " + fun.getNome());
				System.out.println("Valor total da comrpra: " + valorTotal);
				System.out.println("Valor Final da compra:" + valorTotal * 0.8);
				verificaPessoa = 1;

				//return valorTotal * 40;

			}
		}
		
		
		
		for(Fornecedor forn: fornecedor) {
			if(forn.getCnpj() == cpf) {
				System.out.println("teste de for");
				System.out.println("Nome do Fornecedor: " + forn.getNome());
				System.out.println("Valor total da comrpra: " + valorTotal);
				System.out.println("Valor Final da compra:" + valorTotal * 0.8);
				verificaPessoa = 1;


				//return valorTotal * 1000;

			}
		}
		
		
		if(verificaPessoa == 0) {
			System.out.println("Conta do novo cliente: " + valorTotal);
			System.out.println("Valor final da compra" + valorTotal * 0.95);
			
		}
		
		
		System.out.println("-------------------------------------------------------------");
		
		
		
		
		//return teste;
		
	}

	/*public double getValorFinalComDesconto() {
    if (cliente == null) {
        return valorTotal * 0.95;
    } else if (funcionario instanceof Funcionario) {
        return valorTotal * 0.8;
    } else {
        return valorTotal * 0.9;
    }
}*/

}
