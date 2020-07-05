package Exercico03;

public class Aluno {
	
	public double []vet = new double [3];
	public double nota = 0;
	public String name = null;
	public	double soma = 0;
	
	public boolean verificaNota(){
		boolean res = false;

	if(vet[0] <= 30 && vet[1]<=35 && vet[2]<=35) {	
			res = true;
			for(int i = 0; i<vet.length; i++) {
				soma += vet[i];
			}
		}
	else {
		System.out.println("Verifiqueas nota");
	}
		
		return res;
	}
	
	public boolean passouDeAno() {
		if(soma>=60) {
			return true;
		}else
			return false;
	}
	public void apresentação() {
		verificaNota();
		System.out.println("\n\n\n\t--------------------------------");
		System.out.println("\t   ***DADOS DO ALUNO***\n");
		System.out.println("Aluno: "+name);
		for (int i = 0; i<vet.length; i++){
			System.out.println((i+1)+"° nota: "+vet[i]);
		}
		System.out.println("Nota final: "+soma);
		System.out.println("Situação:");
		
		if (passouDeAno()==true) {
			System.out.println("aprovado");
		}else {
			double aux = 0;
			aux = 60 - soma;
			System.out.println("reprovado");
			System.out.println(" faltaram "+aux+" para o aluno ser aprovado");
		}
			
	}

}
