package banco_prof;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		acoont acon;
		
		System.out.println("enter whit accont number:");
		int number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("enter whit your name:");
		String name = sc.nextLine();
		
		System.out.println("is there na initial deposit (y/n)?");
		char resp = sc.next().charAt(0);
		
		if (resp == 'y') {
			System.out.println("enter intial value deposit:");
			double deposit = sc.nextDouble();
			acon = new acoont(number, name, deposit);
		}else {
			acon = new acoont(number, name);
		}
		
		System.out.println("\nAccount data: "+acon.toString());
		
		System.out.println("enter whit depoist value: ");
		acon.deposito(sc.nextDouble());
		
		System.out.println("\nUpdated account data: "+acon.toString());
		
		System.out.println("Enter a withdraw value: ");
		acon.saque(sc.nextDouble());
		
		System.out.println("\nUpdated account data: "+acon.toString());
		
		sc.close();
	}

}
