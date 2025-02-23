package atividade1;
import java.util.Scanner;

public class ConversãoTemp {

	public static void main(String[] args) {
		//ConversãoTemperatura//
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em celsius: ");
		double celsius = sc.nextDouble();
		
		System.out.println("A temperatura em F é: " + (celsius*9/5+32));
		System.out.println("A temperatura em K é: " + (celsius+273.15));
		sc.close();

	}

}
