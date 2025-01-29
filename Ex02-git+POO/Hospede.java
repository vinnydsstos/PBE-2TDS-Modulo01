 Branch-Kaua
class Hospede {
    private int id;
    private String nome;
    private String telefone;

    public Hospede(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String exibirHospede() {
        return String.format("Hóspede ID: %d, Nome: %s, Telefone: %s", id, nome, telefone);
    }
}

public class Hospede {
    //ATRIBUTOS
    private int id;
    private String nome;
    private int telefone;
    //METODO CONSTRUTOR
    public Hospede(){};

    public Hospede(int id, String nome, int telefone  ){
     this.id=id ;
     this.nome=nome;
     this.telefone=telefone;
    }

    public int getId() {
        return id;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void exibirHospede(){
        System.out.println("id: " + getId());
        System.out.println("telefone: " + getTelefone());
        System.out.println("nome: " + getNome());

    };


}


 main
