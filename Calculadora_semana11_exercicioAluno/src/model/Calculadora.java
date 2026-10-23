package model;

public class Calculadora {
	public static void Soma(int a, int b){
		int resultado = a + b;
		System.out.println(a + " + "+ b + "=" + resultado);
	}
	public static void Soma(int a, int b, int c){
		int resultado = a + b + c;
		System.out.println(a + " + "+ b + "+" + c + "=" + resultado);
	}
	public static void Subtrair(int a, int b) {
		int resultado = a - b;
			System.out.println(a + " - "+ b + "=" + resultado);
		}
	public static void Subtrair(int a, int b, int c) {
		int resultado = a - b - c;
			System.out.println(a + " - "+ b + "-"+ c + "=" + resultado);
		}
	public static void Multiplicar(int a, int b) {
		int resultado = a * b;
			System.out.println(a + " x "+ b + "=" + resultado);
		}
	public static void Multiplicar(int a, int b, int c) {
		int resultado = a * b *c;
			System.out.println(a + " x "+ b + "x" + c + "=" + resultado);
		}
	public static void Dividir(int a, int b) {
		int resultado = a / b;
			System.out.println(a + " : "+ b + "=" + resultado);
		}
	public static void Dividir(int a, int b, int c) {
		int resultado = a / b /c;
			System.out.println(a + " : "+ b + " : "+ c + "=" + resultado);
		}
}
