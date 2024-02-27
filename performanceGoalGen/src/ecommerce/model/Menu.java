package ecommerce.model;

import ecommerce.controller.ProdutoController;
import ecommerce.util.Cores;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String [] args) {
        Scanner leia = new Scanner(System.in);

        int opcao, id, numeroDePaginas = 0;
        float preco = 0.0f;
        String nomeAutor, nomeProduto, genero;

        ProdutoController livros = new ProdutoController();

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

                    System.out.println("Digite o Nome do Produto: ");
                    nomeProduto = leia.nextLine();
                    leia.nextLine();
                    System.out.println("Digite o Nome do Autor: ");
                    nomeAutor = leia.nextLine();
                    leia.nextLine();
                    System.out.println("Digite o Gênero: ");
                    genero = leia.nextLine();
                    leia.nextLine();

                    System.out.println("Digite a Quantidade de Páginas: ");
                    numeroDePaginas = leia.nextInt();
                    leia.nextLine();
                    System.out.println("Digite o Preço do Produto: ");
                    preco = leia.nextFloat();
                    leia.nextLine();

                    livros.cadastrar(new Livro(livros.gerarID(), nomeProduto, preco, nomeAutor, genero, numeroDePaginas));

                    keyPress();
                    break;
                case 2:
                    System.out.println("\n Listar Todos os Livros ");

                    livros.listarTodos();

                    keyPress();
                    break;
                case 3:
                    System.out.println("\n Buscar Livro por ID");
                    id = leia.nextInt();
                    leia.nextLine();

                    livros.procurarPorID(id);

                    keyPress();
                    break;
                case 4:
                    System.out.println("\n Atualizar Dados do Livro");

                    System.out.println("Digite o ID do livro: ");
                    id = leia.nextInt();
                    leia.nextLine();

                    var buscaPorID = livros.buscarNaCollection(id);

                    if (buscaPorID != null) {
                        System.out.println("Digite o Nome do Produto: ");
                        nomeProduto = leia.nextLine();
                        leia.nextLine();
                        System.out.println("Digite o Nome do Autor: ");
                        nomeAutor = leia.nextLine();
                        leia.nextLine();
                        System.out.println("Digite o Gênero: ");
                        genero = leia.nextLine();
                        leia.nextLine();
                        System.out.println("Digite a Quantidade de Páginas: ");
                        numeroDePaginas = leia.nextInt();
                        leia.nextLine();
                        System.out.println("Digite o Preço do Produto: ");
                        preco = leia.nextFloat();
                        leia.nextLine();

                        livros.cadastrar(new Livro(livros.gerarID(), nomeProduto, preco, nomeAutor, genero, numeroDePaginas));
                    }

                    keyPress();
                    break;
                case 5:
                    System.out.println("\n Apagar Livro");

                    System.out.println("Qual o ID do livro que deseja apagar? ");
                    id = leia.nextInt();
                    leia.nextLine();

                    livros.deletar(id);

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




