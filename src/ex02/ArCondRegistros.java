package ex02;

/**
 *
 * @author Jv Loreti
 */

/**
 * a), b) e c)
 */

public class ArCondRegistros{
    private ArCondAuto[] registros1; //Registro de ar condicionados automotivos
    private ArCondPlus registros2[]; //Registro de ar condicionados de parede e split
    private int MAX = 200; //Define o limite de ar condicionados registrados
    private int totalBTUs = 0;
    
    //Incorpora o limite aos vetores
    public ArCondRegistros(){
        this.registros1 = new ArCondAuto[MAX];
        this.registros2 = new ArCondPlus[MAX];
    }
    
    //Registra ar condicionados automotivos
    public boolean registrarAuto(ArCondAuto n){
        for(int i = 0; i < MAX; i++){
            if(this.registros1[i] == null){
                this.registros1[i] = n;
                totalBTUs += this.registros1[i].getCapacidade();
                return true;
            }
        }
        return false;
    }
    
    //Registra ar condicionados de parede e split
    public boolean registrarParedeOuSplit(ArCondPlus n){
        for(int i = 0; i < MAX; i++){
            if(this.registros2[i] == null){
                this.registros2[i] = n;
                totalBTUs += this.registros2[i].getCapacidade();
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString(){
        String ret = "Total de BTU's: " + totalBTUs;
        return ret;
    }
}
