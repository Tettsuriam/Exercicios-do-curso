package projeto_01;

import java.util.Locale;
import java.util.Scanner;
import projeto_01.product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner dp = new Scanner(System.in);
		
		System.out.println("enter product data: ");
		System.out.println("name: ");
		String name = dp.nextLine();
		
		System.out.println("price: ");
		double price = dp.nextDouble();
		
		System.out.println("quantity: ");
		int quantity = dp.nextInt();
		
		product prod = new product(name, price, quantity);
		
		System.out.println("\nProducts data"+prod);
		
		System.out.println("\nEnter the number of products to be added in stock:");
		prod.addProducts(dp.nextInt());
		System.out.println("update data"+prod);
		
		System.out.println("\nEnter the number of products to be added in stock:");
		prod.removeProducts(dp.nextInt());
		System.out.println("update data"+prod);
		dp.close();
	}

}
