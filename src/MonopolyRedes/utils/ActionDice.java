/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonopolyRedes.utils;
import java.util.Random;
import java.util.ArrayList;

/**************************************************************
 * @description :: Clase para arrojar los dados en el tablero *
 * @author Javier Stifano                                     *
 **************************************************************/
public final class ActionDice {
    
    /************************************************************************
     * @param range - Rango de resultados (Entre 1 y 6)                     *                                   *
     * @return result (int) - resultado arrojado aleatoriamente por el dado *
     ************************************************************************/

    public static int randomDices(int range) {
        double result;
        result = Math.random()*range+1; // Se le suma 1 si el valor del 0 es 10. 
        return (int) result;
    }
    
    /************************************************************************
     * @param number - Numero de Dados.                                     *
     * @param range                                                           *
     * @return results (ArrayList) - un array con el resultado de n dados   *
     ************************************************************************/
    
    public static ArrayList throwDices(int number, int range) {
        ArrayList results = new ArrayList(number);
        for (int i=0; i<number; i++) {
            results.add(randomDices(range));
        }
        System.out.println("results: " + results.get(0) + ", " + results.get(1));
        return results;
    }
}
