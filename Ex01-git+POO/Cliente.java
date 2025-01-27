public class Cliente{
    int id;
    String nome;
    String email;

    Cliente(){

        Cliente(int id, String nome, String email){
            this.id = id;
            this.nome = nome;
            this.email = email;
        }

        public void exibir_cliente(){
            System.out.println("ID: " + id + "\n"+"Nome: " + nome + "\n"+"Email: " + email);
        }


}
