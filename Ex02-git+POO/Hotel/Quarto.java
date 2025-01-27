package Java;
public class Quarto {
    private int id;
    private String tipo;
    private double precoDiaria;
    private boolean disponivel;

    public Quarto(int id, String tipo, double precoDiaria) {
        this.id = id;
        this.tipo = tipo;
        this.precoDiaria = precoDiaria;
        this.disponivel = true; // Por padrão, o quarto está disponível
    }

    public void marcarIndisponivel() {
        this.disponivel = false;
    }

    public void marcarDisponivel() {
        this.disponivel = true;
    }

    public String exibirDetalhes() {
        String status = disponivel ? "Disponível" : "Indisponível";
        return "Quarto " + id + ": " + tipo + ", R$ " + precoDiaria + "/diária, " + status;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public int getId() {
        return id;
    }
}
