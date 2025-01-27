import java.util.Scanner;

public class Produto {
Scanner teclado = new Scanner(System.in);
    //variaveis
    int id;
    String nome;
    float preco;
    int quantidade_estoque;

    //construtor com parametro
    public Produto(int id, String nome, float preco, int quantidade_estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade_estoque = quantidade_estoque;
    }
  //get e set
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

    //metodos
    public void reduzir_estoque(int quantidade) {




    }
    public void exibir_detalhes() {
        System.out.println("Detalhes dos produtos: " + id + nome + preco + quantidade_estoque);
    }








}//main
