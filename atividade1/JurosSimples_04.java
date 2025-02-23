package atividade1;
import java.util.Scanner;

public class JurosSimples_04 {

	public static void main(String[] args) {
		//Calculo_Juros_Simples//
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Insira a capital inicial: ");
        float C = sc.nextFloat();

        System.out.println("Insira a taxa de juros mensal (%): ");
        float I = sc.nextFloat();

        System.out.println("Insira o tempo em meses: ");
        float T = sc.nextFloat();

        I /= 100;


        float J = C * I * T;

        float montante = C + J;

        System.out.println("Acúmulo de Juros: R$ " + J);
        System.out.println("Montante total: R$ " + montante);

        sc.close();
    }

	}

