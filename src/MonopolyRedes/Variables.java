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
import MonopolyRedes.positions.Position;
import java.util.ArrayList;

public final class Variables {
    
    // Bit de parada e inicio "7E"
    public static String stop_bit = "01111110";
    
    public static String info_to_send = ""; // Trama completa para enviar
    
    public static int money = 2000; // Dinero para comenzar el juego
    
    // Arreglo donde se encuentran las rutas de las imagenes de los dados
    public static String [] dices_images = {
        "src/MonopolyRedes/images/Dice1.gif",
        "src/MonopolyRedes/images/Dice2.gif",
        "src/MonopolyRedes/images/Dice3.gif",
        "src/MonopolyRedes/images/Dice4.gif",
        "src/MonopolyRedes/images/Dice5.gif",
        "src/MonopolyRedes/images/Dice6.gif",
    };
    
    public static ArrayList<Integer> current_dices = new ArrayList<>();
    
    // Arreglo para definir la posiciones del tablero en general (40 EN TOTAL)
    public static int [] game_board = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
    
    // Posicion actual del jugador (NOSOTROS)
    public static int current_position = 1;
    
    // Arreglo para las propiedades del juego
    public static ArrayList<Card> game_cards = new ArrayList<>();
    
    // Arreglo para las casualidades del juego
    public static ArrayList<Casuality> game_casualities = new ArrayList<>();
    
    // Arreglo para las casualidades del juego
    public static ArrayList<ComunalArk> game_comunal_arks = new ArrayList<>();
    
    // Arreglo para la estaciones del juego (PC1, PC2, PC3, PC4)
    public static ArrayList<Station> game_stations = new ArrayList<>();
    
    // Arreglo para las instrucciones del juego (Iniciar partida, tirar dados, etc)
    public static ArrayList<GameInstruction> game_instructions = new ArrayList<>();
    
    // Arreglo para las instrucciones del jugador (Comprar propiedad, hipotecar, etc)
    public static ArrayList<PlayerInstruction> game_player_instructions = new ArrayList<>();
    
    public static ArrayList<Dice> game_dices = new ArrayList<>();
    
    public static ArrayList<Position> coordinates = new ArrayList<>();
    
    // ****** METODOS PUBLICOS PARA OBTENER LOS ARRAYS DEL JUEGO ******** //
    public static ArrayList<Card> getCards(){
        return game_cards;
    }
    
    public static ArrayList<Casuality> getCasualities(){
        return game_casualities;
    }
    
    public static ArrayList<ComunalArk> getComunalArks(){
        return game_comunal_arks;
    }
    
    public static ArrayList<Station> getStations(){
        return game_stations;
    }
    
    public static ArrayList<GameInstruction> getInstructions(){
        return game_instructions;
    }
    
    public static ArrayList<PlayerInstruction> getPlayerInstructions(){
        return game_player_instructions;
    }
    
    public static ArrayList<Dice> getDices(){
        return game_dices;
    }
    
    public static ArrayList<Position> getPositions(){
        return coordinates;
    }
    // ****** METODOS PUBLICOS PARA OBTENER LOS ARRAYS DEL JUEGO ********* //  
}
