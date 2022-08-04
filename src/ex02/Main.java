package ex02;

/**
 *
 * @author Jv Loreti
 */

/**
 * d)
 */

public class Main{
    public static void main(String[] args){
        ArCondAuto arCond1 = new ArCondAuto(1, 7500, false);
        ArCondAuto arCond2 = new ArCondAuto(2, 15000, true);
        ArCondPlus arCond3 = new ArCondPlus(3, 5000, false, "Branca", 110, false);
        ArCondPlus arCond4 = new ArCondPlus(4, 10000, false, "Preta", 220, false);

        ArCondRegistros registros = new ArCondRegistros();
        registros.registrarAuto(arCond1);
        registros.registrarAuto(arCond2);
        registros.registrarParedeOuSplit(arCond3);
        registros.registrarParedeOuSplit(arCond4);
        
        System.out.println(registros);
    }
}
