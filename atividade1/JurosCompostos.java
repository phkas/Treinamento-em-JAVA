package atividade1;
import java.util.Scanner;

public class JurosCompostos {

	public static void main(String[] args) {
		//CalculandoJurosCompostos//
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o sua Capital Inicial: ");
		double C = sc.nextDouble();
		
		System.out.println("Insira sua Taxa de juros: ");
		double I = sc.nextDouble();
		
		System.out.println("Insira o Tempo:");
		double T = sc.nextDouble();
		
		System.out.println("Seu MMC foi: " + C*(T+I));
		
		sc.close();

	}

}
