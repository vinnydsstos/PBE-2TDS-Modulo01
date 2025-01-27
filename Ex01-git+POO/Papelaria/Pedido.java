package Papelaria;

public class Pedido {

    int id;
    String cliente;
    String produtos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    //adicionar_produto(produto, quantidade): Adiciona um produto ao pedido.
    //calcular_total(): Retorna o valor total do pedido.
    //finalizar_pedido(): Atualiza os estoques dos produtos no pedido e retorna um resumo.

    public void adicionar_produto(String produtos, int quantidade){

    }

}
