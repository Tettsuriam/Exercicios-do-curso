package Banco;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner dp = new Scanner(System.in);
		
		accont conta = new accont();
		
		System.out.println("enter whit accont number:");
		conta.setNum(dp.nextInt());
		
		dp.nextLine();
		
		System.out.println("enter whit your name:");
		conta.setNome(dp.nextLine());
		
		System.out.println("is there na initial deposit (y/n)?");
		String res = dp.next();
		res = res.substring(0,1);
		
		if(res.equals ("y")) {
			System.out.println("enter intial value deposit:");
			conta.deposito(dp.nextDouble());
		}
		
		System.out.println("Account data: " + conta.data());
		
		System.out.println("enter whit depoist value: ");
		conta.deposito(dp.nextDouble());
		
		System.out.println("Updated account data: " + conta.data());
		
		System.out.println("Enter a withdraw value:");
		conta.saque(dp.nextDouble());
		
		System.out.println("Updated account data: " + conta.data());
		
		
		
		dp.close();
	}

}
