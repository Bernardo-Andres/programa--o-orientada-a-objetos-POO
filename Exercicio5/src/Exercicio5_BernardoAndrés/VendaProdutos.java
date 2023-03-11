package Exercicio5_BernardoAndrés;

public class VendaProdutos {
private Cliente cliente;
private Produtos produto;
private Fornecedor fornecedor;
private Funcionario funcionario;
private Double valorTotal;
private Double valorFinal;


public VendaProdutos(Cliente cliente, Produtos produto, Fornecedor fornecedor, Funcionario funcionario,
		Double valorTotal, Double valorFinal) {
	super();
	this.setCliente(cliente);
	this.setProduto(produto);
	this.setFornecedor(fornecedor);
	this.setFuncionario(funcionario);
	this.setValorTotal(valorTotal);
	this.setValorFinal(valorFinal);
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}

public Produtos getProduto() {
	return produto;
}

public void setProduto(Produtos produto) {
	this.produto = produto;
}

public Fornecedor getFornecedor() {
	return fornecedor;
}

public void setFornecedor(Fornecedor fornecedor) {
	this.fornecedor = fornecedor;
}

public Funcionario getFuncionario() {
	return funcionario;
}

public void setFuncionario(Funcionario funcionario) {
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

/*public double getValorFinalComDesconto() {
    if (cliente == null) {
        return valorTotal * 0.95;
    } else if (cliente instanceof funcionario) {
        return valorTotal * 0.8;
    } else {
        return valorTotal * 0.9;
    }
}*/

}
