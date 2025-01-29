public class Hospede {

    private int id;
    private String nome;
    private String telefone;

    public Hospede(){

    }

    public Hospede(int id, String nome, String telefone){
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void exibir_hospede(){
        System.out.println("O id do hospede é:" + id);
        System.out.println("O nome do hospede é:" + nome);
        System.out.println("O telefone do hospede é:" + telefone);
    }
}
