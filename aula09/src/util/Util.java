package util;

public class Util {
	
	public void maior(int num1, int num2){
		if(num1 > num2) {
			System.out.println(num1); 
		}
		else {
			System.out.println(num2);
		}
	}
	public void maior(int num1, int num2, int num3){
			if(num1 > num2 & num1 > num3) {
				System.out.println(num1); 
			}
			else if (num2 > num3 & num2 > num1 ) {
				System.out.println(num2);
			}
			else {
				System.out.println(num3);
			}
	}
	public void somar(int num1, int num2){
		System.out.println(num1 + num2);
	}
	public void subtrair(int num1, int num2){
		System.out.println(num1 - num2);
	}
	public void dividir(int num1, int num2){
		System.out.println(num1 / num2);
	}
	public void multiplicar(int num1, int num2){
		System.out.println(num1 * num2);
	}
	
	public void somar(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);	
	}
	public void subtrair(int num1, int num2, int num3) {
		System.out.println(num1 - num2 - num3);	
	}
	public void dividir(int num1, int num2, int num3) {
		System.out.println(num1 / num2 / num3);	
	}
	public void multiplicar(int num1, int num2, int num3) {
		System.out.println(num1 * num2 * num3);	
	}
	
	public String concatenar(String s1, String s2) {
		return s1 + s2;
	}
	public String frase(String frase) {
		return frase;
	}
}

