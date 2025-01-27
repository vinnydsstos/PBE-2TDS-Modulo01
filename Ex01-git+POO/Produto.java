public class Produto {

    private int id;
    private String nome;
    private int preco;
    private int quantidade_estoque;


    public Produto() {

    }
    public Produto(int id, String nome, int preco, int quantidade_estoque) {
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

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public void reduzir_estoque() {
        
    }
    public void exibir_detalhes() {

    }
}
