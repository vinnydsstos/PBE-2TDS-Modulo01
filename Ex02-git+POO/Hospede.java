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
    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getTelefone() {
        return telefone;
    }

    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void exibir_hospede(){
        System.out.println("O id do hospede é:" + id);
        System.out.println("O nome do hospede é:" + nome);
        System.out.println("O telefone do hospede é:" + telefone);
    }
}
