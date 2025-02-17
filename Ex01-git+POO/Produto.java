package exercicio1;

public class Produto {
    private int id;
    private String nome;
    private float preco;
    private int quantidade_estoque;

    //get e set


    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco(){
        return preco;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public int getQuantidade_estoque(){
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int qe){
        this.quantidade_estoque = qe;
    }

    //outros metodos
    public void reduzir_estoque(int quantidade){
        this.quantidade_estoque = quantidade_estoque - quantidade;
    }

    public void exibir_detalhes(){
        System.out.println("Exibindo detalhes do produto...");
        System.out.println("O id do produto é: " + this.id + "\nO nome do produto é: " + this.nome + "\nO preço unitário do produto é: " + this.preco + "\nA quantidade disponível do produto é: " + this.quantidade_estoque + "\n");
    }
}
