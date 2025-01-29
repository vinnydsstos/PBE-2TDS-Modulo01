import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Quarto quarto1 = new Quarto();
        Hospede hospede1 = new Hospede();
        Reserva reserva1 = new Reserva();

        System.out.println("Qual o nome do hóspede?");
        hospede1.setNome(entrada.nextLine());
        System.out.println("Digite o número de telefone do hóspede:");
        hospede1.setTelefone(entrada.nextLine());
        System.out.println("Tipo do quarto(Solteiro ou Casal):");
        quarto1.setTipo(entrada.nextLine());
        System.out.println("Qual o preço da diaria?");
        quarto1.setPreco_diaria(entrada.nextFloat());
        System.out.println("Quantas diárias:");
        reserva1.setDiaria(entrada.nextInt());


        reserva1.setHospede(hospede1.getNome());
        reserva1.setQuarto(quarto1.getTipo());
        reserva1.calcularTotal(quarto1.getPreco_diaria(), reserva1.getDiaria());

        System.out.println("Informações da reserva:\nHóspede: " + hospede1.getNome() + "\nQuarto: " + quarto1.getTipo() + "\nValor total: " + reserva1.valorTotal);

    }

}
