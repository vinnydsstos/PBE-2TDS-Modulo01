package Ex02;

public class Quarto{
    private int id;
    private String tipo;
    private float preco_diaria;
    private boolean disponivel;
    
    public int getId(){
        return id; 
    }

    public void setId(int id){
        this.id = id; 
    }

    public String getTipo(){
        return tipo; 
    }

    public void setTipo(String tipo){
        this.tipo = tipo; 
    }

    public float getPreco_diaria(){
        return preco_diaria; 
    }

    public void setPreco_diaria(float preco_diaria){
        this.preco_diaria = preco_diaria; 
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){ 
        this.disponivel = disponivel; 
    }

    public void marcarIndisponivel(){
        this.disponivel = false; 
    }

    public void marcarDisponivel(){
        this.disponivel = true;
    }

    public String exibirDetalhes(){
        String status = disponivel ? "disponível" : "indisponível"; 
        return "Quarto " + id + " - " + tipo + ", R$ " + preco_diaria + "/diária, " + status;
    }

    public boolean isDisponivel(){
        return disponivel;
    } 

    
    
}
