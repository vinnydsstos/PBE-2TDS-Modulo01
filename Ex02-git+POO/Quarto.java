public class Quarto {

    private int id;
    private String tipo;
    private float preco_diaria;

    private boolean disponivel;

    public Quarto(){

    }

    public Quarto(int id, String tipo, float preco, boolean disp){
        this.id = id;
        this.tipo = tipo;
        this.preco_diaria = preco;
        this.disponivel = disp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco_diaria() {
        return preco_diaria;
    }

    public void setPreco_diaria(float preco_diaria) {
        this.preco_diaria = preco_diaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void marcar_indisponivel(){
        this.disponivel = false;
    }

    public void marcar_disponivel(){
        this.disponivel = true;
    }

    public void exibir_detalhes(){
        String status;
        if(this.disponivel){
            status = "disponível";
        } else {
            status = "indisponível";
        }
        System.out.println("O ID do quarto é: " + this.id + "\nO tipo do quarto é: " + this.tipo + "\nO preço da diária do quarto é: " + this.preco_diaria + "\nO quarto está: " + status);
    }
}
