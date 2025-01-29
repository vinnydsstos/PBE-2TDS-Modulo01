public class Reserva {

    private int id;
    private Hospede hospede;
    private Quarto quarto;
    private int diaria;

    public Reserva() {

    }
    public Reserva(int id, Hospede hospede, Quarto quarto, int diaria) {
        this.id = id;
        this.hospede = hospede;
        this.quarto = quarto;
        this.diaria = diaria;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;

    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public int getDiaria() {
        return diaria;
    }

    public void setDiaria(int diaria) {
        this.diaria = diaria;
    }
    public float calcular_total(){
        float valor = 0;
        valor = this.diaria * this.quarto.getPreco_diaria();
        return valor;
    }
    public void  finalizar_reserva(){
        this.quarto.marcar_indisponivel();
    }
    public void  exibir_resumo(){
        System.out.println("Hóspede: " + this.hospede.getNome());
        System.out.println("Quarto: " + this.quarto.getTipo());
        System.out.println("O valor total é: R$" + calcular_total());
    }


}
