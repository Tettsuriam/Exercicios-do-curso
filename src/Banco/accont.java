package Banco;

public class accont {
	
	private int num;
	private String nome;
	private double saldo;
	
	public void setNum(int num) {
		this.num = num;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void deposito (double saldo) {
		this.saldo += saldo;
	}
	public String data() {
		// TODO Auto-generated method stub
		return "\nnumber account:"
				+num
				+", holder: "
				+ nome
				+", balance: "
				+String.format("%.2f", this.saldo)
				+"\n";
	}
	public void saque(double valor) {
		this.saldo -= (valor+5);
	}
	
	
	
	
}
