 main
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
 main
    }

    public int getId() {
        return id;
    }

 main
    public int getTelefone() {
        return telefone;

    public void setId(int id) {
        this.id = id;
 main
    }

    public String getNome() {
        return nome;
    }

 main
    public void setId(int id) {
        this.id = id;
    }


 main
    public void setNome(String nome) {
        this.nome = nome;
    }

 main
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
 main
