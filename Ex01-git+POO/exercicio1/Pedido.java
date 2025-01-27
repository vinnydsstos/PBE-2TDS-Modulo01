package exercicio1;

import java.util.ArrayList;

public class Pedido {
    private int id;

    private int quantidade;
    private Cliente cliente;
    private ArrayList<Produto> produtos;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    //adicionar produto
    public void adicionar_produto(Produto produto, int quantidade){
        produto.reduzir_estoque(quantidade);
        produtos.add(produto);
    }

    public void calcular_total(){
        float total;
        System.out.println("O total do pedido foi: " + total);
    }
}
