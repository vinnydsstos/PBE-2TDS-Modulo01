public class Main {
    public static void main(String[] args) {
        Quarto q1 = new Quarto(1,"Solteiro",100,true);
        Hospede h1 = new Hospede(1,"Maria Oliveira","11999991234");
        Reserva r1 = new Reserva(1,h1,q1,3);

        r1.calcular_total();
        r1.finalizar_reserva();
        r1.exibir_resumo();
    }

}
