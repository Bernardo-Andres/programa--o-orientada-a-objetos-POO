package exercicoInterfaceBancoBernardoAndrés;





public class BancoB implements Banco {
	
	private Double transferencia;
	private Conta conta;
	private Double saqueDindin;
	private Double depositoDindin;
	private Double dindin;
	



	public BancoB(Conta conta) {
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
	
	public void transferencia(Conta contaT, Double transferencia) {
		if(transferencia <= 500.00) {
			Double transferir = transferencia + contaT.getSaldo();
			Double retirar = conta.getSaldo() - transferencia;
			transferencia = transferencia + contaT.getSaldo();
			conta.setSaldo(retirar);
			contaT.setSaldo(transferir);
		}else {
			System.out.println("Valor acima do limite, tente com seu limite de ate 500 reais!");
		}
	}
	





}