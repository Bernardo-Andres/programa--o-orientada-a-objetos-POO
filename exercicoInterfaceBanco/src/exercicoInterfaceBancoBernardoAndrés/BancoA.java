package exercicoInterfaceBancoBernardoAndrés;

public class BancoA implements Banco {
	
	private Double transferencia;
	private Conta conta;
	private Double saqueDindin;
	private Double depositoDindin;
	private Double dindin;
	



	public BancoA(Conta conta) {
		super();
		
		this.conta = conta;
		
	}

	@Override
	public Double getConta() {
		Double taxa = conta.getSaldo() - 100;
		return conta.setSaldo(taxa);
	}

	@Override
	public Double getSaque(Double saqueDindin) {
		Double retira = conta.getSaldo() - saqueDindin;
				return conta.setSaldo(retira);
	}

	@Override
	public Double getDeposito(Double depositoDindin) {
		Double acrescenta = conta.getSaldo() + depositoDindin;
		return conta.setSaldo(acrescenta);
	}

	public int getUserBanco() {
		
		return conta.getNumeroConta();
	}
	
	
	@Override
	public Double getSaldo() {
		
		return conta.getSaldo();
	}
	





}