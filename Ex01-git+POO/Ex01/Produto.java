package Ex01;

public class Produto {
    int id;
    String nome;
    float preco;
    int quantidadeEstoque;

    public Produto() {
    }

    public Produto(int id, String nome, float preco, int quantidadeEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
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

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void reduzirEstoque(int quantidadeReduzida) {
        if (quantidadeReduzida > 0) {
            if (quantidadeReduzida <= quantidadeEstoque) {
                quantidadeEstoque -= quantidadeReduzida;
                System.out.println("Estoque reduzido em " + quantidadeReduzida + ". Novo estoque: " + quantidadeEstoque);
            } else {
                System.out.println("Erro: Quantidade a ser reduzida é maior do que o estoque disponível.");
            }
        } else {
            System.out.println("Erro: A quantidade a ser reduzida deve ser maior que zero.");
        }
    }

    public void exibirDetalhes() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quantidadeEstoque;
    }
}
