package classe.modelo;

public class Conta {
	
	private int numeroConta, tipoConta;
	private Double limite, saldo;
	private Correntista correntista;
	
	public Conta() {
		
	}
	
	public Conta(Double limite, Double saldo) {
		this.limite = limite;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}
	
	public String depositar(Double valor) {
		this.saldo += valor;
		return "Depósito realizado, saldo atual: R$ "+this.saldo;
	}
	
	public String sacar(Double valor) {
		if((this.saldo+this.limite)-valor >= 0) {
			if(this.saldo < valor) {
				Double diferenca = this.saldo - valor;
				this.saldo = 0.0D;
				this.limite += diferenca;
			}else {
				this.saldo -= valor;
			}
			return "Saque realizado, saldo atual: R$ "+this.saldo+" e limite R$ "+this.limite;
		}else {
			return "Saque não possível, saldo atual: R$ "+this.saldo+" e limite R$ "+this.limite;
		}	
	}
	public String Extrato() {
		return "Extrato | Saldo R$ "+this.saldo+" | Limite R$ "+this.limite+" | Limite Disponível R$ "+(this.saldo+this.limite);
	}
	

}
