package Ex01;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Caderno", 20.0f, 50);
        Produto produto2 = new Produto(2, "Caneta", 2.5f, 100);

        System.out.println("Detalhes do Produto 1:");
        produto1.exibirDetalhes();
        System.out.println("\nDetalhes do Produto 2:");
        produto2.exibirDetalhes();

        System.out.println("\nReduzindo estoque do Produto 1 em 10 unidades.");
        produto1.reduzirEstoque(10);
        produto1.exibirDetalhes();

        System.out.println("\nTentando reduzir estoque do Produto 1 em 100 unidades.");
        produto1.reduzirEstoque(100);
        produto1.exibirDetalhes();

        System.out.println("\nReduzindo estoque do Produto 2 em 50 unidades.");
        produto2.reduzirEstoque(50);
        produto2.exibirDetalhes();
    }
}
