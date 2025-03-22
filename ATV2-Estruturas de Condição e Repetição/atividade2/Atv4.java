import java.util.Scanner;
public class Atv4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("DIGITE NUMEROS ATE CHEGAR EM ZERO.");
        double soma = 0;
        int quantidade = 0;
        

        while (true) { 
            System.out.println("Digite um Número: ");
            double numero = sc.nextDouble();
                if (numero == 0){

                    soma+= numero;
                    quantidade++;

                    if (quantidade > 0) {
                        
                        double media = soma/quantidade;
                        System.out.println("Sua média é: " + media);
                    } else{
                        System.out.println("Nenhum numero encontrado. ");
                    }
                }

            }
        }
    }

