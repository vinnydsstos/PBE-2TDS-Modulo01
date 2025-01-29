public class Quarto {

    private int id;
    private String tipo;
    private float preco = 80;
    public boolean disponivel;

    Quarto() {

    }

    Quarto(int id, String tipo, float preco, boolean disponivel) {
        this.id = id;
        this.tipo = tipo;
        this.preco = preco;
        this.disponivel = disponivel;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    //marcar_indisponivel(): Altera o status de disponibilidade para False.
    //marcar_disponivel(): Altera o status de disponibilidade para True.
    //exibir_detalhes(): Mostra os dados do quarto.

    public void marcar_indisponivel() {
        this.disponivel = false;
    }

    public void marcar_disponivel() {
        this.disponivel = true;
    }

    public void exibir_detalhes() {
        System.out.println("id: " + id + "tipo" + tipo + "preço" + preco + "disponível" + disponivel);

    }
}
