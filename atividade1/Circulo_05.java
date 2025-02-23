package atividade1;
import java.util.Scanner;

public class Circulo_05 {

	public static void main(String[] args) {
		//Calculo_Area_Perimetro_Circulo//
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o Raio do Círculo: ");
		double r = sc.nextDouble();
		
		
		double a = Math.PI * Math.pow(r, 2);
		double p = 2 * Math.PI * r;
		
		
		System.out.println("Área do Circulo: %.2f\n" + a);
		System.out.println("Perímetro do Circulo: %.2f\n" + p);
		
		sc.close();
		
		
	}

}
