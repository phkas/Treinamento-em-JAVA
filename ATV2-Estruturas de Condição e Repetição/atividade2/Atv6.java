import java.util.Scanner;
public class Atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero que deseja fatoriar: ");
        int numero = sc.nextInt();

        if (numero < 0) {
        System.out.println("Insira um numero positivo. ");
        } else{
            long fatorial = 0;

            for (int i = 1; 1 <= numero; i++){
                fatorial *=i;
            }

            System.out.println("O fatorial de " +numero+ "é de: " +fatorial);
        }
    }
    
}
