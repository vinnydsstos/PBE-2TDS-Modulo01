public class Hospede {
    private int id;
    private String nome;
    private String telefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;


        }
    public void exibir_hospede(){
        System.out.println("O id do Hóspede é: " + getId() + " O nome do cliente é: " + getNome() + " O telefone do Hóspede é: " + getTelefone() );
    }
}
