package classe.modelo;

import java.math.BigInteger;

public class Correntista {
	
	private String nome;
	private int idade;
	private long cpf,idt, telefone;
		
	
	public Correntista() {
		
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getIdt() {
		return idt;
	}

	public void setIdt(long idt) {
		this.idt = idt;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	
	

}
