/***************************************************
* Variables globales dentro del monopolio          *  
* @author :: Javier Stifano <jstifano18@gmail.com> *
****************************************************/
package MonopolyRedes;
import MonopolyRedes.cards.Card;
import java.util.ArrayList;

public class Variables {
    
// Bit de parada e inicio "7E"
    public String stop_bit = "01111110";
    
    // Arreglo para elegir lanzamiento de dados
    public int [] game_dices = {1,2,3,4,5,6}; 
    
    // Arreglo para definir la posiciones del tablero en general
    public int [] game_board = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
    
    // Arreglo para las propiedades del juego
    public ArrayList<Card> game_cards = new ArrayList<Card>();
    
    public ArrayList<Card> getCards(){
        return this.game_cards;
    }
       
}
