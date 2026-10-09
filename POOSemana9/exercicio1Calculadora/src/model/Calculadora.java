package model;

public class Calculadora {
	public double valor1;
	public double valor2;
	public double valor3;
	
	public Calculadora(double valor1, double valor2, double valor3) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
	}
	public Calculadora() {
		this.valor1 = 0;
		this.valor2 = 0;
		this.valor3 = 0;
	}
	public Calculadora(double valor1) {
		this.valor1 = valor1;
		this.valor2 = 0;
		this.valor3 = 0;
	}
	public Calculadora(double valor1, double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = 0;
	}
	
	public double soma() {
		return this.valor1 + this.valor2 + this.valor3;
	}
	public double subtracao() {
		return this.valor1 - this.valor2 - this.valor3;
	}
	public double multiplicacao() {
		return this.valor1 * this.valor2 * this.valor3;
	}
	public double divisao() {
		if(this.valor2 == 0 || this.valor3 == 0) {
			System.out.println("Erro escolha outro número maior que 0.");
			return Double.NaN;
		}
		return (this.valor1 / this.valor2) / this.valor3;
	}
	@Override
	public String toString() {
		return "Calculadora [valor1=" + valor1 + ", valor2=" + valor2 + ", valor3=" + valor3 + "]" + " | Soma: "
	+ soma()+ "| Subtração: " + subtracao() + "| Multiplicação: "+ multiplicacao()+
	"| Divisão: "+ (valor2 == 0 || valor3 == 0 ? "Erro (Divisão por zero)" : divisao());
	}
	
	
}











