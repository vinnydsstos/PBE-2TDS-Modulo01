package exercicio1;

import java.util.ArrayList;

public class Pedido {
    private int id;

    private int quantidade;
    private Cliente cliente;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private ArrayList<Integer> quantidades = new ArrayList<Integer>();

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

    public ArrayList<Integer> getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(ArrayList<Integer> quantidades) {
        this.quantidades = quantidades;
    }

    //adicionar produto
    public void adicionar_produto(Produto produto, int quantidade){
        produto.reduzir_estoque(quantidade);
        produtos.add(produto);
        quantidades.add(quantidade);
    }

    public void calcular_total(){
        float total=0;
        int cont = 0;
        for(Produto prod : produtos){
            total = total + (prod.getPreco()*quantidades.get(cont));
            cont++;
        }
        System.out.println("O total do pedido foi: " + total);
    }

    public void finalizar_pedido(){
        System.out.println("Os itens do seu carrinho são: ");
        int contar = 0;
        for(Produto prod : produtos){
            System.out.println("Nome do produto: " + prod.getNome() + "\nQuantidade: " + quantidades.get(contar) + "\nPreço unitário: " + prod.getPreco() + "\n");
            contar++;
        }
    }
}