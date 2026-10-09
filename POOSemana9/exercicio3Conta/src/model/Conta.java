package model;

public class Conta {
	 public int numero;
	 public double saldo;
	 public double limite;
	 public String nome;
	 
	 public Conta() {
		 this.numero = 0;
		 this.saldo = 0;
		 this.limite = 0;
		 this.nome = "sem nome";
	 }
	 public Conta(int numero, double saldo, double limite, String nome) {
		 this.numero = numero;
		 this.saldo = saldo;
		 this.limite = limite;
		 this.nome = nome;
	 }
	 
	 public boolean sacar(double valor) {
		 if( valor > this.limite) {
			 System.out.println("Erro: O valor que quer sacar ultrapassa o limite de crédito disponível para saque diário.");
			 return false;
		 }
		 if( valor > this.saldo) {
			 System.out.println("Erro: saldo insuficiente para sacar o valor digitado");
			 return false;			 
		 }
		 this.saldo -= valor;
		 System.out.println("Saque de R$: "+ valor+ " realizado com sucesso.");
		 return true;
	 }
	 public void depositar(double valor) {
		 if (valor > 0) {
	          this.saldo += valor;
	         System.out.println("Depósito de R$ " + valor + " realizado com sucesso na conta de " + this.nome);
	 } else {
         System.out.println("Erro: O valor do depósito deve ser maior que zero.");
	 }
	 }
	 public void transferir(double valor, Conta contaDestino) {
		 System.out.println("Iniciando transferência de "+ this.nome+ " para "+ contaDestino.nome+ "...");
	 
		 if(this.sacar(valor)) {
			 contaDestino.depositar(valor);
			 System.out.println("Transferência de R$ "+ valor+ " concluída com sucesso.");
		 }
		 else {
			 System.out.println("Erro: A transferência não pôde ser realizada.");
		 }
	 }
	 @Override
	 public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + ", nome=" + nome + "]";
	 } 	 
}
