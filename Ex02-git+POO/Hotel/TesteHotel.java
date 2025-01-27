package Java;

public class TesteHotel {
    public static void main(String[] args) {
        // Criando um quarto
        Quarto quarto1 = new Quarto(1, "Solteiro", 100.0);

        // Criando um hóspede
        Hospede hospede1 = new Hospede(1, "Maria Oliveira", "11 99999-1234");

        // Criando uma reserva
        Reserva reserva1 = new Reserva(1, hospede1, quarto1, 3);

        // Exibindo detalhes do quarto e do hóspede
        System.out.println(quarto1.exibirDetalhes());
        System.out.println(hospede1.exibirHospede());

        // Exibindo o resumo da reserva
        System.out.println("\n--- Resumo da Reserva ---");
        System.out.println(reserva1.exibirResumo());

        // Finalizando a reserva e atualizando a disponibilidade do quarto
        reserva1.finalizarReserva();
        System.out.println("\n--- Após Finalizar Reserva ---");
        System.out.println(quarto1.exibirDetalhes());
    }
}

