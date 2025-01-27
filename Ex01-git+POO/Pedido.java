public class Pedido {
    int id;
    String cliente;
    String[] produto;
    String[] quantidade;

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

    public String[] getProduto() {
        return produto;
    }

    public void setProduto(String[] produto) {
        this.produto = produto;
    }

    public String[] getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String[] quantidade) {
        this.quantidade = quantidade;
    }
}
