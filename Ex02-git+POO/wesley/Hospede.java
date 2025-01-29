package wesley;

public class Hospede {

    private int id;
    private String nome;
    private  int telefone;

    public Hospede() {

    }

    public Hospede(int id, String nome, int telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    

    public void exibirHospede() {
        System.out.println("O id do hospede é: " + this.id + "\nO nome do hospede é: " + this.nome + "\nO telefone do hospede é: " + this.telefone );

    }
}
