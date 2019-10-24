package exercicios;

public class Retangulo {

	double altura;
	double largura;

	public Retangulo(double altura, double largura) {

		this.altura = altura;
		this.largura = largura;

	}

	public Retangulo() {

	}

	public double area() {
		return altura * largura;
	}

	public double perimetro() {
		double total = (altura + largura) * 2;
		return total;
	}

	public double diagonal() {
		double total = (2 * Math.sqrt((altura * altura) + (largura * largura)) / 2);
		return total;
	}

}
