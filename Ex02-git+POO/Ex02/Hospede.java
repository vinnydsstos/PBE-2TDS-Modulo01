public class Hospede { 
    int id;
    String nome;
    int telefone;

    public int getId (){
        return id;
    }

    public void setId (int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public int getTelefone(){
        return telefone;
    }

    public void setTelefone(){
        this.telefone = telefone;
    }

    public String exibirHospede(){
        return "Hospede Id: " + id + "Nome: " + nome + "Telefone: " + telefone
    }
}