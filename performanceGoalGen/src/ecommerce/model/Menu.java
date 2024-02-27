package ecommerce.model;

import ecommerce.util.Cores;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String [] args) {
        Scanner leia = new Scanner(System.in);

        int opcao, id, genero, numeroDePaginas;
        float preco;
        String nomeAutor, nomeProduto;

        opcao = 0;

        while (true) {

            System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND
                    + "-----------------------------------------------------");
            System.out.println("                                                     ");
            System.out.println("                LIVRARIA CAJUEIRO                    ");
            System.out.println("                                                     ");
            System.out.println("-----------------------------------------------------");
            System.out.println("                                                     ");
            System.out.println("            1 - Adicionar Livros                     ");
            System.out.println("            2 - Listar Todos os Livros               ");
            System.out.println("            3 - Buscar Livro por ID                  ");
            System.out.println("            4 - Atualizar Dados do Livro             ");
            System.out.println("            5 - Apagar Livro                         ");
            System.out.println("            6 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("-----------------------------------------------------");
            System.out.println("ESCOLHA UMA DAS OPÇÕES:                              ");
            System.out.println("                                                     " + Cores.TEXT_RESET);

            try {
                opcao = leia.nextInt();
            } catch(InputMismatchException e){
                System.out.println("\nDigite valores inteiros!");
                leia.nextLine();
                opcao=0;
            }

            if (opcao == 6) {
                System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND
                        + "\nMuito obrigado pela sua visita, volte sempre! LIVRARIA CAJUEIRO");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n Adicionar Livros");

                    keyPress();
                    break;
                case 2:
                    System.out.println("\n Listar Todos os Livros ");

                    keyPress();
                    break;
                case 3:
                    System.out.println("\n Buscar Livro por ID");

                    keyPress();
                    break;
                case 4:
                    System.out.println("\n Atualizar Dados do Livro");

                    keyPress();
                    break;
                case 5:
                    System.out.println("\n Apagar Livro");

                    keyPress();
                    break;
                default:
                    System.out.println("\nOpção Inválida" + Cores.TEXT_RESET);

                    keyPress();
                    break;
            }
        }
    }

    public static void sobre() {
        System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND
                + "\n-----------------------------------------------------");
        System.out.println("Projeto Desenvolvido por: ");
        System.out.println("Caio Vinícius Cajueiro dos Santos");
        System.out.println("github.com/CajueiroCaio");
        System.out.println("-----------------------------------------------------");
    }

    public static void keyPress() {

        try {

            System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar");
            System.in.read();

        } catch (IOException e) {

            System.out.println("Você pressionou uma tecla diferente de enter!");

        }
    }
}




