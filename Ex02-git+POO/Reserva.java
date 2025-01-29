

public class Reserva {

    private int id;
    private Hospede hospede;
    private Quarto quarto;
    private int diarias;
    int valorTotal = diarias * 80;
    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }



    Reserva(){

    }
    public int getId(){
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

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }

    public void calcular_total() {

        System.out.println("o preço da diaria ficara: " + valorTotal);
    }
    public void finalizar_reserva(){
        quarto.marcar_indisponivel();



    }
    public void exibir_resumo(){
        System.out.println("Detalhes da reserva: " + id + "valor que ficou: " + valorTotal  );
        quarto.exibir_detalhes();
        hospede.exibir_hospede();
    }
}
