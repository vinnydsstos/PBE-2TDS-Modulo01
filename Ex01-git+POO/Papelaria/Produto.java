package Papelaria;

public class Produto {

    // Método Construtor
    public Produto(int id, String nome, double preco, int quantidade_estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade_estoque = quantidade_estoque;
    }

    // Atributos
    int id; // Números Inteiros
    String nome; // Texto
    double preco; // Números reais (decimais extensos)
    int quantidade_estoque;

    // Métodos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

}
