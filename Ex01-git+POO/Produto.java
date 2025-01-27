public class Produto {
        public int id;
        String nome;
        float preco;
        int quantidade_estoque;

        Public Produto(){

        }
        Public Produto(int id, String nome, float preco, int quantidade_estoque){
            this.id = id;
            this.nome = nome;
            this.preco = preco;
            this.quantidade_estoque = quantidade_estoque;
        }

        public void reduzir_estoque(int reduz){

        }

        pubic void exibir_informacoes(){
            System.out.println("ID: " + "\n"+"Nome: " + nome + "\n" + "Preço: " + preco + "\n" "Quantidade em estoque: " + quantidade_estoque);
        }
}
