package Papelaria;

public class Produto {


        int id;
        String nome;
        float preco;
        int quantidade_estoque;

    public Produto(int id, String nome, float preco, int quantidade_estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade_estoque = quantidade_estoque;
    }

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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public void reduzir_estoque(int quantidade){



    }
    public void exibir_detalhes(){
        System.out.println("O ID do produto é: " + getId());
        System.out.println("O nome do produto é: " + getNome());
        System.out.println("O preço do produto é: " + getPreco());
        System.out.println("A quantidade de produtos são: " + getQuantidade_estoque());
    }

}


