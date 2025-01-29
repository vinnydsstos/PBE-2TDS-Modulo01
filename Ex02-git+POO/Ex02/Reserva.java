public class Reserva {
    private int id;
    private Hospede hospede;
    private Quarto quarto;
    private int diarias;

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public Hospede getHospede(){
        return Hospede;
    }

    public void setHospede(){
        this.hospede = hospede;
    }

    public Quarto getQuarto(){
        return quarto;
    }

    public void setQuarto(){
        this.Quarto = quarto;
    }

    public int getDiarias(){
        return diarias;
    }

    public void setDiarias(){
        this.diarias = diarias
    }


    public double calcularTotal(){
        return diarias * quarto.getPrecoDiaria();
    }

    public void finalizarReserva(){
        quarto.MarcarIndisponivel(); 
    }

      public String exibirResumo() {
        return "Reserva ID: " + id +
                "\nHóspede: " + hospede.getNome() +
                "\nQuarto: " + quarto.exibirDetalhes() +
                "\nDiárias: " + diarias +
                "\nTotal: R$ " + calcularTotal();
    }
}