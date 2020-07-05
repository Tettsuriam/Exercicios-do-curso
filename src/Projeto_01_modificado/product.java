package Projeto_01_modificado;

public class product {
	private String name;
	private double price;
	private int quantity;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public double totalVelueInStock() {
		double a=0;
		a = price*quantity;
		return a; 
	}
	
	public void addProducts(int quantity) {
		this.quantity+=quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity-=quantity;
	}
	
	public String toString() {
		return  " :"
				+name
				+", $"
				+String.format("%.2f", price)
				+", "
				+quantity
				+" unitys, total: $"
				+String.format("%.2f", totalVelueInStock());
		
	}

}
