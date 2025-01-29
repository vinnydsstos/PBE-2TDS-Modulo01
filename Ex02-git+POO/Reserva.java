class Reserva {
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
        double valorTotal = calcularTotal();
        return String.format("Resumo da Reserva:\n%s\n%s\nDiárias: %d\nValor total: R$ %.2f",
                hospede.exibirHospede(), quarto.exibirDetalhes(), diarias, valorTotal);
    }
}