package atividade1;
import java.util.Scanner;

public class MediaAluno_03 {

	public static void main(String[] args) {
		//Média_De_Aluno//
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira sua 1ª Nota: ");
		float n1 = sc.nextFloat();
		
		System.out.println("Insira sua 2ª Nota: ");
		float n2 = sc.nextFloat();
		
		System.out.println("Insira sua 1ª Nota: ");
		float n3 = sc.nextFloat();
		
		System.out.println("Sua média foi: " + (n1+n2+n3)/3);
		
		sc.close();
		
	}

}
