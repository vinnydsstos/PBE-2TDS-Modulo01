import java.net.StandardSocketOptions;

public class Quarto {

    private int idQuarto;

    public String tipo;

    public float preco_diaria;

    public boolean disponivel;

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco_diaria() {
        return preco_diaria;
    }

    public void setPreco_diaria(float preco_diaria) {
        this.preco_diaria = preco_diaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void marcarIndisponivel(boolean disponivel) {
        this.disponivel = false;

    }

    public void marcarDisponivel(boolean disponivel) {
        this.disponivel = true;

    }
    public void exibirDetalhes() {
        System.out.println("Id do quarto: " + getIdQuarto());
        System.out.println("Tipo do quarto: " + getTipo());
        System.out.println("Preço do quarto: " + preco_diaria);
        System.out.println("Disponibilidade do quarto: " + disponivel);

    }
}
