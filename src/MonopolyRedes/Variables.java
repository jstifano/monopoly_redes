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
import MonopolyRedes.cards.Property;
import MonopolyRedes.cards.Station;
import MonopolyRedes.positions.Position;
import java.util.ArrayList;

public final class Variables {
    
    // Bit de parada e inicio "7E"
    public static String stop_bit = "01111110";
    
    public static String info_to_send = ""; // Trama completa para enviar
    
    public static String info_received = ""; // Trama recibida por el otro equipo
    
    public static boolean get_free_jail = false;
    
    public static ArrayList<Property> all_properties = new ArrayList<>();
    
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
    
    // Arreglo para las propiedades del juego
    public static ArrayList<Card> game_cards = new ArrayList<>();
    
    // Arreglo para las casualidades del juego
    public static ArrayList<Casuality> game_casualities = new ArrayList<>();
    
    // Arreglo para las arcas comunales del juego
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
    
    public static ArrayList<Property> getAllProperties(){
        return all_properties;
    }
    
    public static String findStationBySerial(String num_serial){
        String result = null;
        for (int i = 0; i < Variables.game_stations.size(); i++) {
            if(num_serial.equals(Variables.game_stations.get(i).getSerial())){
                result = Variables.game_stations.get(i).getName();
            }
        }
        return result;
    }
    
    public static String findDiceBySerial(String num_serial){
        String result = null;
        for (int i = 0; i < Variables.game_dices.size(); i++) {
            if(num_serial.equals(Variables.game_dices.get(i).getSerial())){
                result = Variables.game_dices.get(i).getDiceNumber();
            }
        }
        return result;
    }
    
    public static Property findProperty(String name){
        Property result = null;
        for (int i = 0; i < Variables.all_properties.size(); i++) {
            if( name.equals(Variables.all_properties.get(i).getPropertyName()) ){
                result = Variables.all_properties.get(i);
            }
        }
        return result;
    }
    
    public static String findPropertyBySerial(String serial){
        String result = null;
        for (int i = 0; i < Variables.all_properties.size(); i++) {
            if( serial.equals(Variables.all_properties.get(i).getSerial()) ){
                result = Variables.all_properties.get(i).getSerial();
            }
        }
        return result;
    }
    
    public static String findPropertyName(String serial){
        String result = null;
        for (int i = 0; i < Variables.all_properties.size(); i++) {
            if( serial.equals(Variables.all_properties.get(i).getSerial()) ){
                result = Variables.all_properties.get(i).getPropertyName();
            }
        }
        return result;
    }
    
    public static void addProperty(Property property){
        Variables.all_properties.add(property);
    }
    // ****** METODOS PUBLICOS PARA OBTENER LOS ARRAYS DEL JUEGO ********* //  
}
