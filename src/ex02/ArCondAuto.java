package ex02;

/**
 *
 * @author Jv Loreti
 */

/**
 * a), b) e c)
 */

public class ArCondAuto{
    int numSerie;
    private int capacidade;
    boolean possuiArQuente;
    
    public ArCondAuto(int n, int c, boolean checkArQuente){
        this.numSerie = n;
        this.capacidade = c;
        this.possuiArQuente = checkArQuente;
    }
    
    public int getCapacidade(){
        return capacidade;
    }
}
