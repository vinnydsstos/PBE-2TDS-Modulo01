class Quarto {
    private int id;
    private String tipo;
    private double precoDiaria;
    private boolean disponivel;

    public Quarto(int id, String tipo, double precoDiaria) {
        this.id = id;
        this.tipo = tipo;
        this.precoDiaria = precoDiaria;
        this.disponivel = true;
    }

    public void marcarIndisponivel() {
        this.disponivel = false;
    }

    public void marcarDisponivel() {
        this.disponivel = true;
    }

    public String exibirDetalhes() {
        String status = disponivel ? "Disponível" : "Indisponível";
        return String.format("Quarto ID: %d, Tipo: %s, Preço por diária: R$ %.2f, Status: %s",
                id, tipo, precoDiaria, status);
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }
}