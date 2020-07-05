package Exercicio01;

import java.util.Scanner;
import Exercicio01.retangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dp = new Scanner(System.in);
		retangulo ret = new retangulo();

		System.out.println("entre com a lateral");
		ret.lat = dp.nextDouble();

		System.out.println("entre com a base");
		ret.bas = dp.nextDouble();

		ret.calculaArea();
		System.out.printf("a area do retangulo é: %.2f\n",ret.are);

		ret.calculaPerimetro();
		System.out.printf("o perimetro do retangulo é: %.2f\n",ret.peri);

		ret.calculaDiagonal();
		System.out.printf("a diagonal do retangulo é: %.2f\n", ret.diag);

		dp.close();
	}

}
