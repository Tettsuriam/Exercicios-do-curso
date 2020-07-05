package Exercicio02;

public class Funcionary {
	public String name = null;
	public double grSalary = 0;
	public double tax = 0;
	public double aux = 0;
	
	public void apresentação() {
		System.out.println("\n\n\n\t--------------------------------");
		System.out.println("\t   ***DADOS DO FUNCIONARIO***\n");
		System.out.println("Funcionary: "+name);
		System.out.println("Gross Salary: "+grSalary);
	}
	
	public double Salary() {
		return grSalary-tax;
	}

}
