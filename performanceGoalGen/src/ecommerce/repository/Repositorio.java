package ecommerce.repository;

import ecommerce.model.Produto;

public interface Repositorio {
    public void procurarPorID(int id);
    public void listarTodos();
    public void cadastrar(Produto livro);
    public void atualizar(Produto livro);
    public void deletar(int id);
}
