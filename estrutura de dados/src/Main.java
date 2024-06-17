import mercado.Supermarket;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private final static int Size=3;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Supermarket supermarket=new Supermarket(Size);
        int opcao;
        do{
            System.out.println("\nLista de comprar");
            System.out.println("1-inserir");
            System.out.println("2-Listar");
            System.out.println("3-Remover");
            System.out.println("4-Sair");
            System.out.println("escolha uma opção");
            opcao=scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o item a ser inserido");
                    String item=scanner.next();
                    supermarket.add(item);
                    break;
                case 2:
                    supermarket.print();
                    break;

                case 3:
                    System.out.println("digite o item a ser removido");
                    int index=scanner.nextInt();
                    supermarket.delete(index);
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção invalida,escolha novamente");
            }

        }while (opcao!=4);
        scanner.close();
    }
}