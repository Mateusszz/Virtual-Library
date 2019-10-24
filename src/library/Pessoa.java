package library;

public class Pessoa {
	public String nome;
	private int matricula;
	private int cpf;
	public int dataNascimento;
	public String nomeInstituicao;

	public Pessoa() {

	}

	public String formataNome() {
		nome = nome.trim();
		nome = nome.toUpperCase();
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	/*
	 * public int dataNascimento(int dia, int mes, int ano) {
	 * 
	 * return
	 * 
	 * }
	 */

}
