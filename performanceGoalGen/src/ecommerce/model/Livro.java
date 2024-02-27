package ecommerce.model;

public class Livro extends Produto {
    private String nomeAutor, genero;
    public int numeroDePaginas;

    public Livro(int id, String nomeProduto, float preco, String nomeAutor, String genero, int numeroDePaginas) {
        super(id, nomeProduto, preco);
        this.nomeAutor = nomeAutor;
        this.genero = genero;
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }


    public void visualizar() {
        System.out.println("\n\n***********************************************************");
        System.out.println("Dados do Produto:");
        System.out.println("***********************************************************");
        System.out.println("Nome: " + getNomeProduto());
        System.out.println("ID: " + getId());
        System.out.println("Preço: " + getPreco());
        System.out.println("Gênero: " + this.genero);
        System.out.println("Nome do Autor: " + this.nomeAutor);
        System.out.println("Número de Páginas: " + this.numeroDePaginas);
    }
}
