package ex02;

/**
 *
 * @author Jv Loreti
 */

/**
 * a) e b)
 */

public class ArCondPlus extends ArCondAuto{
    String cor;
    int voltagem;
    boolean possuiControleRemoto;
    
    public ArCondPlus(int n, int c, boolean checkArQuente, String cor, int v, boolean checkControleRemoto){
        super(n, c, checkArQuente);
        this.cor = cor;
        this.voltagem = v;
        this.possuiControleRemoto = checkControleRemoto;
    }
}
