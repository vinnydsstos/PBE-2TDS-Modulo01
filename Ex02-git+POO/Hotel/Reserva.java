package Java;

public class Reserva {
    private int id;
    private Hospede hospede;
    private Quarto quarto;
    private int diarias;

    public Reserva(int id, Hospede hospede, Quarto quarto, int diarias) {
        this.id = id;
        this.hospede = hospede;
        this.quarto = quarto;
        this.diarias = diarias;
    }

    public double calcularTotal() {
        return diarias * quarto.getPrecoDiaria();
    }

    public void finalizarReserva() {
        quarto.marcarIndisponivel();
    }

    public String exibirResumo() {
        return "Reserva ID: " + id +
                "\nHóspede: " + hospede.getNome() +
                "\nQuarto: " + quarto.exibirDetalhes() +
                "\nDiárias: " + diarias +
                "\nTotal: R$ " + calcularTotal();
    }
}
