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