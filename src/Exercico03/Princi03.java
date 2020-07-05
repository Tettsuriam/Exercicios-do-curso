package Exercico03;

import java.util.Scanner;
import Exercico03.Aluno;

public class Princi03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Aluno idi = new Aluno();
		int i = 0;

		System.out.println("Digite o nome do aluno:");
		idi.name = sc.nextLine();
		
		System.out.println("digite as 3 notas do aluno");
		for(i= 0;i<idi.vet.length;i++) {
			System.out.println("nota(0"+(i+1)+")");
			idi.vet[i] = sc.nextDouble();
		}
		
		idi.apresentação();
		
		sc.close();
	}

}
