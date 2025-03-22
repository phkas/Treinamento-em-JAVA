import java.util.Random;
import java.util.Scanner;
public class Atv1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10)+1;

        int tentativa = sc.nextInt();

        if (tentativa == numeroAleatorio){
            System.out.println("Parabéns! Numero está correto!");
        } else{
            System.out.println("NÚMERO ERRADO");
        }

    }
}
