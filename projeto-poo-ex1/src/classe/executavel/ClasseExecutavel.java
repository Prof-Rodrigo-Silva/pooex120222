package classe.executavel;

import classe.modelo.Conta;
import classe.modelo.Correntista;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Correntista correntista = new Correntista();
		correntista.setNome("Carlos Da Silva");
		correntista.setIdade(33);
		correntista.setCpf(00200200222L);
		correntista.setIdt(7070707070L);
		correntista.setTelefone(999443322L);
		
		Conta conta = new Conta(500D,1000D);
		
		conta.setCorrentista(correntista);
		conta.setNumeroConta(112233);
		conta.setTipoConta(1);
		
		System.out.println("Correntista............: "+conta.getCorrentista().getNome());
		System.out.println("Telefone...............: "+conta.getCorrentista().getTelefone());
		System.out.println("Idade..................: "+conta.getCorrentista().getIdade());
		System.out.println("CPF....................: "+conta.getCorrentista().getCpf());
		System.out.println("IDT....................: "+conta.getCorrentista().getIdt());
		System.out.println("Nro Conta..............: "+conta.getNumeroConta());
		System.out.println("Tipo Conta.............: "+conta.getTipoConta());
		System.out.println("Saldo................R$: "+conta.getSaldo());
		System.out.println("Limite...............R$: "+conta.getLimite());
		
		System.out.println("-----------------------------------");
		System.out.println(conta.sacar(1600D));
		//System.out.println(conta.sacar(1));
		System.out.println("-----------------------------------");
		System.out.println(conta.depositar(500D));
		System.out.println(conta.sacar(1600D));
		System.out.println("-----------------------------------");
		System.out.println(conta.Extrato());
		
		
		
		

	}

}
