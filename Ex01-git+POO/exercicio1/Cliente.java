package exercicio1;

public class Cliente {
    private int id;
    private String nome;
    private String email;

    public Cliente(){

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //outro metodo
    public void exibir_cliente(){
        System.out.println("O id do cliente é:\n" + this.id + "\nO nome do cliente é:\n" + this.nome + "\nO email do cliente é:\n" + this.email);
    }
}
