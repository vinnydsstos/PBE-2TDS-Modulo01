public class Hospede {

    private int id;
    private String nome;
    private int telefone;

    public Hospede(){

    }

    public Hospede(int id, String nome, int telefone){
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

    private int getTelefone() {
        return telefone;
    }

    private void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void exibir_hospede(){
        System.out.println("O id do hospede é:" + id);
        System.out.println("O nome do hospede é:" + nome);
        System.out.println("O telefone do hospede é:" + telefone);
    }
}
