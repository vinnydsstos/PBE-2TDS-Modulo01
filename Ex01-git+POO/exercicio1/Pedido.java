package exercicio1;

import java.util.ArrayList;

public class Pedido {
    private int id;

    private int quantidade;
    private Cliente cliente;
    private ArrayList<Produto> produtos;

    public Pedido(){

    }

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    //adicionar produto
    public void adicionar_produto(Produto produto, int quantidade){
        produto.reduzir_estoque(quantidade);
        produtos.add(produto);
        this.quantidade = quantidade;
    }

    public void calcular_total(){
        float total = 0;
        for(prod : getProdutos()){
            total = total + ()
        }
        System.out.println("O total do pedido foi: " + total);
    }
}
