public class Reserva extends Quarto{
    private int idReserva;
    String hospede;
    String quarto;
    int diaria;
    float precoDiaria;
    float valorTotal;

    public Reserva() {
    }

    public Reserva(int idReserva, String hospede, String quarto, int diaria, float precoDiaria) {
        this.idReserva = idReserva;
        this.hospede = hospede;
        this.quarto = quarto;
        this.diaria = diaria;
        this.precoDiaria = super.preco_diaria;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    public int getDiaria() {
        return diaria;
    }

    public void setDiaria(int diaria) {
        this.diaria = diaria;
    }

    public float getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(float precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public void calcularTotal(float precoDiaria, int diaria) {
        valorTotal = precoDiaria * diaria;
    }

    public void finalizarReserva() {
        if (isDisponivel()) {
            marcarIndisponivel(true);
            System.out.println("Reserva finalizada o quarto " + quarto + " agora está indisponível.");
        }



    }
}


