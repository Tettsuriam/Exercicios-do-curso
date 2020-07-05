package hostel;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Quartos[] quart = new Quartos[10];
		int num =0;
		
		
		System.out.print("Quantos quartos serão alugados? ");
		num = sc.nextInt();
		
		for(int i = 0; i<num; i++) {
			sc.nextLine();
			System.out.print("\nName: ");
			String name = sc.nextLine();
			System.out.print("\nemail: ");
			String email = sc.nextLine();
			System.out.print("\nroom: ");
			int room = sc.nextInt();
			
			quart[room] = new Quartos(name, room,email);
		}
		
		System.out.println("\nQuartos ocupados: ");
	
		for(int i = 0; i<quart.length;i++) {
			
			if(quart[i]!=null) {
				int om = 0;
				om++;
				System.out.println("#"+(om)+"\n"+quart[i].up());
			}
			
		}
		
		sc.close();
	} 
}
