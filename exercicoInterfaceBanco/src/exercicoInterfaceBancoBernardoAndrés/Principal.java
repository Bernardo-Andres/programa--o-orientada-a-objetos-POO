package exercicoInterfaceBancoBernardoAndrés;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Conta> listaBanco = new ArrayList<Conta>();

		
		Conta conta = new Conta(1, 10000.00);
		
		
		
		Conta contaB = new Conta(2, 1000.00);
		listaBanco.add(contaB);
		
		BancoA bancoa = new BancoA(conta);
		
		BancoB bancob = new BancoB(contaB);
		
		//System.out.println(bancoa.getDeposito());
		System.out.println("Custo de taxa do banco de R$100,00 para o usuario: " + bancoa.getUserBanco() + " saldo final após manutenção R$ " + bancoa.getConta());
		
		System.out.println("O cliente sacou R$1000 e ficou com o saldo de : R$ " + bancoa.getSaque(1000.00));

		System.out.println("O cliente depositou R$ 5000 e ficou com o saldo de : R$ " + bancoa.getDeposito(5000.00));
		
		System.out.println("R$5000 foi transferido para o banco B");
		bancoa.transferencia(contaB, 5000.00);
		System.out.println("novo saldo: R$ " + bancoa.getSaldo());
		
		//System.out.println("Saldo antes da transferencia para o banco B: R$ " + bancoa.getSaldo());
		
		//System.out.println("Saldo do banco A pós transferencia: R$ " + bancoa.getSaldo());
		
		System.out.println("Numero da conta: " + bancob.getUserBanco() + " valor saldo: R$ " + bancob.getSaldo());
		
		System.out.println("Custo de taxa do banco de R$100,00 para o usuario: " + bancob.getUserBanco() + " saldo final após manutenção R$ " + bancob.getConta());
		
		System.out.println("O cliente sacou R$1000 e ficou com o saldo de : R$ " + bancob.getSaque(1000.00));

		System.out.println("O cliente depositou R$ 5000 e ficou com o saldo de : R$ " + bancob.getDeposito(5000.00));
		
		
		
		System.out.println("R$5000 foi transferido para o banco A");
		bancob.transferencia(conta, 5000.00);
		
		
		
	}
}
