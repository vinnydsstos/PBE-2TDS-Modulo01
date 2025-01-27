public class produto {
    private int id;
    private String nome;
    private Double preco;
    private int qtd_estoque;

    public produto(){};

    public produto(int id,String nome, Double preco, int qtd_estoque){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtd_estoque = qtd_estoque;
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public void reduzir_estoque(int qtd_vendida){
        setQtd_estoque(getQtd_estoque() - qtd_vendida);
        System.out.println("Quantidade Atual: " + getQtd_estoque());
    }

    public void exibir_detalhes(){
        System.out.println("ID: " + getId() + "\nNOME: " + getNome() + "\nPREÇO: " + "\nQUANTIDADE ESTOQUE: " + getQtd_estoque());
    }
}
