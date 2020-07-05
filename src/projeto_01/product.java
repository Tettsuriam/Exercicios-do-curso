package projeto_01;

public class product {
	
	public String name;
	public double price;
	public int quantity;
	
	public product(String name, double price, int quantity) {
	
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		
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
