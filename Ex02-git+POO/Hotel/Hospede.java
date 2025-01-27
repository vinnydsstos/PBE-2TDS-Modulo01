package Java;

public class Hospede {
    private int id;
    private String nome;
    private String telefone;

    public Hospede(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String exibirHospede() {
        return "Hóspede ID: " + id + ", Nome: " + nome + ", Telefone: " + telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}

