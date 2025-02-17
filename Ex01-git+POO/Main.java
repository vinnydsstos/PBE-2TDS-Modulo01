package exercicio1;

public class Main {
    public static void main(String[] args) {
//        Criar as classes com base no modelo acima.
//        Simular a criação de 3 produtos, 2 clientes e 1 pedido.
//                Exemplo de produtos:
//        Produto 1: Caderno, preço R$ 20, estoque 50 unidades.
//                Produto 2: Caneta Azul, preço R$ 3, estoque 100 unidades.
//                Produto 3: Lápis, preço R$ 1.50, estoque 200 unidades.
//                Exemplo de clientes:
//        Cliente 1: João Silva, email joao@email.com.
//                Cliente 2: Maria Santos, email maria@email.com.
//        Simular o pedido:
//        Cliente João Silva compra:
//        2 cadernos.
//        5 canetas azuis.
//        O sistema deve calcular o total do pedido, exibir um resumo para o cliente e atualizar o estoque dos produtos.

        Produto p1 = new Produto();
        p1.setId(1);
        p1.setNome("Caderno");
        p1.setPreco(20);
        p1.setQuantidade_estoque(50);

        Produto p2 = new Produto();
        p2.setId(2);
        p2.setNome("Caneta Azul");
        p2.setPreco(3);
        p2.setQuantidade_estoque(100);

        Produto p3 = new Produto();
        p3.setId(3);
        p3.setNome("Lápis");
        p3.setPreco(1.50f);
        p3.setQuantidade_estoque(200);

        Cliente c1 = new Cliente();
        c1.setId(1);
        c1.setNome("João Silva");
        c1.setEmail("joao@email.com");

        Cliente c2 = new Cliente();
        c2.setId(2);
        c2.setNome("Maria Santos");
        c2.setEmail("maria@email.com");

        Pedido pedido1 = new Pedido();
        pedido1.adicionar_produto(p1,2);
        pedido1.adicionar_produto(p2, 5);
        pedido1.calcular_total();
        pedido1.finalizar_pedido();

        p1.exibir_detalhes();
        p2.exibir_detalhes();
    }
}
