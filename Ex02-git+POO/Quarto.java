/* **Atributos**: Raíssa
  - `id` (identificador do quarto)
  - `tipo` (tipo do quarto, ex.: solteiro, casal, família)
  - `preco_diaria` (preço da diária)
  - `disponivel` (indica se o quarto está disponível: `True` ou `False`)
- **Métodos**:
  - `marcar_indisponivel()`: Altera o status de disponibilidade para `False`.
  - `marcar_disponivel()`: Altera o status de disponibilidade para `True`.
  - `exibir_detalhes()`: Mostra os dados do quarto.
  */

public class Quarto {
    private int id;
    private String tipo;
    private double precoDiaria;
    private boolean disponivel;

    //padrão
    public Quarto(){

    }

    //com parametros
    public Quarto(int id, String tipo, double precoDiaria, boolean disponivel) {
        this.id = id;
        this.tipo = tipo;
        this.precoDiaria = precoDiaria;
        this.disponivel = disponivel;
    }

    //metpodos que façam os quartps estarem ou não disponíveis
    public void marcarDisponivel() {
        this.disponivel = true;
    }
    public void marcarIndisponivel() {
        this.disponivel = false;
    }


    //detalhes do quarto
    public void exibirDetalhes() {
        System.out.println("ID: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Preço da diária: R$" + precoDiaria);
        System.out.println((disponivel ? "Sim" : "Não"));
    }
}//class