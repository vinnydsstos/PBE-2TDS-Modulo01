public class Pedido {

    private int id;
    private String cliente;
    private String email;

    public Pedido() {

    }

    public Pedido(int id, String cliente, String email) {
        this.id = id;
        this.cliente = cliente;
        this.email = email;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
