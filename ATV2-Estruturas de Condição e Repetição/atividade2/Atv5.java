import java.util.Scanner;
public class Atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int SomaPares = 0;
        int SomaImpares = 0;

    
        while (true) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                break;

            }
            if (SomaPares %2 == 0) {
                SomaImpares += numero;
                System.out.print(numero + "Ë impar.");
            } else{
                System.out.print(numero + "Ë par.");
            }

    }
}
}
