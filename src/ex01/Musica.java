package ex01;

/**
 *
 * @author Jv Loreti
 */

/**
 * a)
 */

public class Musica{
    private String nome;
    private String compositor;
    private String interprete;
    private int duracao;
    
    public Musica(String n, String c, String i, int min){
        this.nome = n;
        this.compositor = c;
        this.interprete = i;
        this.duracao = min;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCompositor(){
        return compositor;
    }
    public void setCompositor(String compositor){
        this.compositor = compositor;
    }
    public String getInterprete(){
        return interprete;
    }
    public void setInterprete(String interprete){
        this.interprete = interprete;
    }
    public int getDuracao(){
        return duracao;
    }
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
}
