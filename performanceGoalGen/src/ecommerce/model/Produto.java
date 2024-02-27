package ecommerce.model;

public abstract class Produto {
    private int id;
    private float preco;
    private String nomeProduto;

    public Produto(int id, float preco, String nomeProduto) {
        this.id = id;
        this.preco = preco;
        this.nomeProduto = nomeProduto;
    }

    public Produto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void visualizar() {

        System.out.println("\n\n***********************************************************");
        System.out.println("Dados do Produto:");
        System.out.println("***********************************************************");
        System.out.println("Nome: " + this.nomeProduto);
        System.out.println("ID: " + this.id);
        System.out.println("Preço: " + this.preco);
    }
}
