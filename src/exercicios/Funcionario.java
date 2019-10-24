package exercicios;

public class Funcionario {

	public int id;
	public String nome;
	private double salario;

	public int getId() {
		return id;
		
	}
	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
		
	}
	
	public double correcao(double salario , int taxa) {
		return salario += salario * taxa/100;
	}

}