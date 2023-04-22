package exercicoInterfaceBanco;

public class BancoA implements Banco {

	private int conta;
	private double valor;
	private double dindin;
	
	
	public BancoA(int conta, double valor, double dindin) {
		super();
		this.conta = conta;
		this.valor = valor;
		this.dindin = dindin;
	}

	@Override
	public int getConta() {
		
		return conta;
	}

	@Override
	public double getSaque() {
		dindin = dindin - valor;
		return dindin;
	}

	@Override
	public double getDeposito() {
		dindin = dindin + valor;
		return dindin;
	}

	@Override
	public double getSaldo() {
		
		return dindin;
	}
	
}
