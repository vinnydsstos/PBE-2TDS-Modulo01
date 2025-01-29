public class Main {
    public static void main(String[] args) {
        Quarto quarto1 = new Quarto(1, "Solteiro", 100.0);
        Hospede hospede1 = new Hospede(1, "Maria Oliveira", "11 99999-1234");


        Reserva reserva1 = new Reserva(1, hospede1, quarto1, 3);


        reserva1.finalizarReserva();
        System.out.println(reserva1.exibirResumo());
    }
}