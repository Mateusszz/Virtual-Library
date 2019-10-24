package exercicios;

public class ContaBancaria {

	private int nConta;
	public String nomeTitular;
	private double saldo;
	
	public ContaBancaria() {
		
	}

	public ContaBancaria(String nome, double valor, int conta) {
		this.nomeTitular = nome;
		this.saldo = valor;
		this.nConta = conta;
	}

	public ContaBancaria(String nome, int conta) {

		this.nomeTitular = nome;
		this.nConta = conta;
	}

	public double getSaldo() {
		return saldo;

	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void  setDepositar(double newSaldo) {
		 this.saldo = this.saldo + newSaldo;
	}

	public void setSacar(double newSaldo) {
       
		 this.saldo = this.saldo - newSaldo - 5;
	}

	public int getNconta() {
		return nConta;

	}

}
