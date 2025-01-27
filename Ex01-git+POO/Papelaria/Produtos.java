public class Produtos {

    //atributos
    public int ID;
    public String nome;
    public double Preco;
    public int Quantidade;

    //métodos

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public void reduzir_estoque(int quantidade) {
        Quantidade = quantidade - ;
    }
}