package Exercicio02;

import java.util.Scanner;
import Exercicio02.Funcionary;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionary funcionario = new Funcionary();
		
		System.out.println("Name:");
		funcionario.name = sc.nextLine();
		
		System.out.println("Gross salary:");
		funcionario.grSalary = sc.nextDouble();
		
		System.out.println("tax:");
		funcionario.tax = sc.nextDouble();
		
		funcionario.apresentação();
		System.out.printf("Net salary: %.2f\n",funcionario.Salary());
		
		System.out.println("\nWhich percentage to increase salary?");
		funcionario.aux = sc.nextDouble();
		
		funcionario.apresentação();
		funcionario.aux /=100;
		System.out.printf("Net salary: %.2f\n",(funcionario.Salary()+(funcionario.Salary()*funcionario.aux)));
		
		sc.close();
	}

}
