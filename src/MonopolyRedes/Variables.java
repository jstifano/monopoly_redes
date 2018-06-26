/***************************************************
* Variables globales dentro del monopolio          *  
* @author :: Javier Stifano <jstifano18@gmail.com> *
****************************************************/
package MonopolyRedes;
import MonopolyRedes.cards.Card;
import MonopolyRedes.cards.Casuality;
import MonopolyRedes.cards.ComunalArk;
import MonopolyRedes.cards.Dice;
import MonopolyRedes.cards.GameInstruction;
import MonopolyRedes.cards.PlayerInstruction;
import MonopolyRedes.cards.Station;
import java.util.ArrayList;

public class Variables {
    
    // Bit de parada e inicio "7E"
    public String stop_bit = "01111110";
    
    public int money = 2000; // Dinero para comenzar el juego
    
    // Arreglo para definir la posiciones del tablero en general (40 EN TOTAL)
    public int [] game_board = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
    
    // Arreglo para las propiedades del juego
    public ArrayList<Card> game_cards = new ArrayList<>();
    
    // Arreglo para las casualidades del juego
    public ArrayList<Casuality> game_casualities = new ArrayList<>();
    
    // Arreglo para las casualidades del juego
    public ArrayList<ComunalArk> game_comunal_arks = new ArrayList<>();
    
    // Arreglo para la estaciones del juego (PC1, PC2, PC3, PC4)
    public ArrayList<Station> game_stations = new ArrayList<>();
    
    // Arreglo para las instrucciones del juego (Iniciar partida, tirar dados, etc)
    public ArrayList<GameInstruction> game_instructions = new ArrayList<>();
    
    // Arreglo para las instrucciones del jugador (Comprar propiedad, hipotecar, etc)
    public ArrayList<PlayerInstruction> game_player_instructions = new ArrayList<>();
    
    public ArrayList<Dice> game_dices = new ArrayList<>();
    
    // ****** METODOS PUBLICOS PARA OBTENER LOS ARRAYS DEL JUEGO ******** //
    public ArrayList<Card> getCards(){
        return this.game_cards;
    }
    
    public ArrayList<Casuality> getCasualities(){
        return this.game_casualities;
    }
    
    public ArrayList<ComunalArk> getComunalArks(){
        return this.game_comunal_arks;
    }
    
    public ArrayList<Station> getStations(){
        return this.game_stations;
    }
    
    public ArrayList<GameInstruction> getInstructions(){
        return this.game_instructions;
    }
    
    public ArrayList<PlayerInstruction> getPlayerInstructions(){
        return this.game_player_instructions;
    }
    
    public ArrayList<Dice> getDices(){
        return this.game_dices;
    }
    // ****** METODOS PUBLICOS PARA OBTENER LOS ARRAYS DEL JUEGO ********* //  
}
