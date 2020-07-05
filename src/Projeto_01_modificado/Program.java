package Projeto_01_modificado;

import java.util.Locale;
import java.util.Scanner;

import Projeto_01_modificado.product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		product prod = new product();
		
		Locale.setDefault(Locale.US);
		Scanner dp = new Scanner(System.in);
		
		System.out.println("enter product data: ");
		
		System.out.println("name: ");
		prod.setName (dp.nextLine());
		System.out.println(prod.getName());
		
		System.out.println("price: ");
		prod.setPrice(dp.nextDouble());
		System.out.println("R$"+prod.getPrice());
		
		System.out.println("quantity: ");
		prod.addProducts(dp.nextInt());
		System.out.println(prod.getQuantity());
		
		
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
