public class Pedido {

    //atributos
    public int Id;
    public Cliente cliente;
    ArrayList<Produtos> produtos = new ArrayList();

    //métodos
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
