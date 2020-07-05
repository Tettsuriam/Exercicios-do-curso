package vetorDeClasses;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double soma = 0;
	
		System.out.println("digite os numero");
		
		Product [] vet = new Product[sc.nextInt()];
		
		for(int i = 0; i<vet.length;i++) {
			sc.nextLine();
			System.out.println("digite o nome do produto e em seguida digite o preço");
			vet[i] = new Product(sc.nextLine(),sc.nextDouble());
			
			soma +=vet[i].getPrice();
		}
		System.out.println("\nmedia :"+(soma/vet.length));
		
		
		sc.close();
	}

}
