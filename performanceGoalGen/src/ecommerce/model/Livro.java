package ecommerce.model;

public class Livro extends Produto {
    private String nomeAutor, genero;
    private int numeroDePaginas;

    public Livro (int id, int numeroDePaginas, float preco, String nomeProduto, String nomeAutor, String genero) {
        super(id, preco, nomeProduto);
        this.numeroDePaginas = numeroDePaginas;
        this.nomeAutor = nomeAutor;
        this.genero = genero;
    }

    public Livro () {

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

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Gênero: " + this.genero);
        System.out.println("Nome do Autor: " + this.nomeAutor);
        System.out.println("Número de Páginas: " + this.numeroDePaginas);
    }
}
