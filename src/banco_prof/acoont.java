package banco_prof;

public class acoont {

	private int num;
	private String name;
	private double balance;

	public acoont(int num, String name, double balance) {
		this.num = num;
		this.name = name;
		deposito(balance);
	}

	public acoont(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposito(double saldo) {
		this.balance += saldo;
	}

	public void saque(double valor) {
		this.balance -= (valor + 5);
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "\nnumber account:"
				+num
				+", holder: "
				+ name
				+", balance: "
				+String.format("%.2f", this.balance)
				+"\n";
	}

}
