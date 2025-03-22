
import java.util.Scanner;
public class Atv3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do Emprestimo: ");
        double EmprestimoValor = sc.nextDouble();

        System.out.println("Valores do Emprestimos: ");
        System.out.println("Emprestimo de 6 meses - +5% do valor total");
        System.out.println("Emprestimo de 12 meses - +10% do valor total");
        System.out.println("Emprestimo de 24 meses - +20% do valor total");
        int opcao = sc.nextInt();
        double Emprestimo = 0;

        switch(opcao){
            case 1: 
            Emprestimo = EmprestimoValor + 0.05;
            System.out.println("O valor do emprestimo é de: " + Emprestimo);
            break;

            case 2:
            Emprestimo = EmprestimoValor + 0.10;
            System.out.println("O valor do emprestimo é de: " + Emprestimo);
            break;

            case 3:
            Emprestimo = EmprestimoValor + 0.20;
            System.out.println("O valor do emprestimo é de: " + Emprestimo);
            break;

            default:
            System.out.println("ERROOO");
        }




    }
}
