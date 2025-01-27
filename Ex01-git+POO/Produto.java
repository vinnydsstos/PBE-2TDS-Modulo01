public class Produto {
    private int id;
    private String nome;
    private float preco;
    private int quantidade_estoque;
    private int quantidade;

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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //met
    public void reduzir_estoque(int quantidade){
        if (quantidade <= quantidade_estoque) {
            quantidade_estoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    public void exibir_detalhes() {
        System.out.println("O id do produto é: " + id + "\nO nome do produto é: " + nome + "\nO preço do produto é: " + preco);
    }

}