package ecommerce.controller;

import ecommerce.model.Produto;
import java.util.ArrayList;
import java.util.Random;
import ecommerce.repository.Repositorio;

public class ProdutoController implements Repositorio {
    ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    int id = 0;

    @Override
    public void procurarPorID(int id) {
        var livro = buscarNaCollection(id);

        if (livro != null) {
            livro.visualizar();
        } else {
            System.out.println("\nA conta número " + id + " não foi encontrada!");
        }
    }

    @Override
    public void listarTodos() {
        for (var livro : listaProdutos) {
            livro.visualizar();
        }

    }

    @Override
    public void cadastrar(Produto livro) {
        listaProdutos.add(livro);
        System.out.println("\nA conta número " + livro.getId() + " foi criada com sucesso.");
    }

    @Override
    public void atualizar(Produto livro) {
        var buscarLivros = buscarNaCollection(livro.getId());

        if (buscarLivros != null) {
            listaProdutos.set(listaProdutos.indexOf(buscarLivros), livro);
            System.out.println("\nA conta numero " + livro.getId() + " foi atualizada com sucesso!");
        } else {
            System.out.println("\nA conta numero " + livro.getId() + " não foi encontrada!");
        }

    }

    @Override
    public void deletar(int id) {
        var livro = buscarNaCollection(id);

        if (livro != null) {
            if (listaProdutos.remove(livro))
                System.out.println("\nA conta número " + id + " foi deletada com sucesso");
        } else {
            System.out.println("\nA conta número " + id + " não foi encontrada");
        }

    }

    public int gerarID() {
        return ++id;
    }

    public Produto buscarNaCollection (int id) {
        for (var livro : listaProdutos) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }
}
