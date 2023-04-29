package exercicoInterfaceBancoBernardoAndrés;

public class Principal {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1, 10000.00);
		
		BancoA bancoa = new BancoA(conta);
		
		//System.out.println(bancoa.getDeposito());
		System.out.println("Custo de taxa do banco para o usuario: " + bancoa.getUserBanco() + " saldo final após manutenção R$ " + bancoa.getConta());
		
		System.out.println("O cliente sacou R$1000 e ficou com o saldo de : R$ " + bancoa.getSaque(1000.00));

		System.out.println("O cliente depositou R$ 5000 e ficou com o saldo de : R$ " + bancoa.getDeposito(5000.00));
		
	}
}
