import java.util.Scanner;
public class Atv2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("insira o valor em Real: ");
        double ValorReal = sc.nextDouble();

        System.out.println("Digite: 1 - para Converter em Dollar;");
        System.out.println("Digite: 2 - para Converter em Euro;");
        System.out.println("Digite: 3 - para Converter em Libra;");
        int opcao = sc.nextInt();

        double Valor = 0;
        System.out.println("Insira o Valor desejado: ");

        switch(opcao){
            case 1 -> {
                Valor = ValorReal*0.20;
                System.out.println("Seu valor em Dollar é de: " + Valor);
            }
            case 2 -> {
                Valor = ValorReal*0.18;
                System.out.println("Seu valor em Euro é de: " + Valor);
            }
            case 3 -> {
                Valor = ValorReal*0.15;
                System.out.println("Seu valor em Libra é de: " + Valor);
            }
            default -> System.out.println("INDEFINIDO.");
        }

    }
}