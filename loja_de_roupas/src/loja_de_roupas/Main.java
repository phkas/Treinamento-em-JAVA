package loja_de_roupas;

import loja_de_roupas.Roupa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Roupa roupa = new Roupa();

        // Coletando informações da roupa
        System.out.print("Digite o tipo da roupa (ex: Camisa, Calça): ");
        roupa.tipo = sc.nextLine();

        System.out.print("Digite a marca da roupa: ");
        roupa.marca = sc.nextLine();

        System.out.print("Digite o tamanho da roupa (P, M, G, GG): ");
        roupa.tamanho = sc.nextLine();

        System.out.print("Digite a quantidade inicial em estoque: ");
        roupa.quantidade = sc.nextInt();

        System.out.print("Digite o valor unitário da roupa: ");
        roupa.valor = sc.nextDouble();

        int opcao = -1;

        // Menu 
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Ver dados da roupa");
            System.out.println("2 - Adicionar estoque");
            System.out.println("3 - Remover estoque");
            System.out.println("4 - Ver valor total em estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n=== Dados da roupa ===");
                    System.out.println("Tipo: " + roupa.tipo);
                    System.out.println("Marca: " + roupa.marca);
                    System.out.println("Tamanho: " + roupa.tamanho);
                    System.out.println("Quantidade: " + roupa.quantidade);
                    System.out.println("Valor unitário: R$" + roupa.valor);
                    break;

                case 2:
                    System.out.print("Digite a quantidade a adicionar: ");
                    int add = sc.nextInt();
                    roupa.addEstoque(add);
                    break;

                case 3:
                    System.out.print("Digite a quantidade a remover: ");
                    int rem = sc.nextInt();
                    roupa.removEstoque(rem);
                    break;

                case 4:
                    System.out.println("Valor total em estoque: R$" + roupa.valorTotal());
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
