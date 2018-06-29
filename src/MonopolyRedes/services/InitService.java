package MonopolyRedes.services;
import MonopolyRedes.cards.Card;
import MonopolyRedes.Variables;
import MonopolyRedes.cards.Casuality;
import MonopolyRedes.cards.ComunalArk;
import MonopolyRedes.cards.Dice;
import MonopolyRedes.cards.GameInstruction;
import MonopolyRedes.cards.PlayerInstruction;
import MonopolyRedes.cards.Station;
import MonopolyRedes.positions.Position;

public class InitService {
    
    // Constructor vacio
    public InitService(){
        
    }
    
    // Metodo para inicializar las propiedades
    public void initCards (Variables var) {
        var.game_cards.add(new Card("00000", "Av. Mediterráneo", "morado", 60, 30, 2, 10, 30, 90, 160, 250, 50));
        var.game_cards.add(new Card("00001", "Av. Báltica", "morado", 60, 30, 4, 20, 60, 180, 320, 450, 50));
        var.game_cards.add(new Card("00010", "Av. Oriental", "gris claro", 100, 50, 6, 30, 90, 270, 400, 550, 50));
        var.game_cards.add(new Card("00011", "Av. Vermont", "gris claro", 100, 50, 6, 30, 90, 270, 400, 550, 50));
        var.game_cards.add(new Card("00100", "Av. Connecticut", "gris claro", 120, 60, 8, 40, 100, 300, 450, 600, 50));
        var.game_cards.add(new Card("00101", "Plaza San Carlos", "fucsia", 140, 70, 10, 50, 150, 450, 625, 750, 100));
        var.game_cards.add(new Card("00110", "Av. de los Estados", "fucsia", 140, 70, 10, 50, 150, 450, 625, 750, 100));
        var.game_cards.add(new Card("00111", "Av. Virginia", "fucsia", 160, 80, 12, 60, 180, 500, 700, 900, 100));
        var.game_cards.add(new Card("01000", "Plaza Santiago", "naranja", 180, 90, 14, 70, 200, 550, 750, 950, 100));
        var.game_cards.add(new Card("01001", "Av. Tennessee", "naranja", 180, 90, 14, 70, 200, 550, 750, 950, 100));
        var.game_cards.add(new Card("01010", "Av. Nueva York", "naranja", 200, 100, 16, 80, 220, 600, 800, 1000, 100));
        var.game_cards.add(new Card("01011", "Av. Kentucky", "rojo", 220, 110, 18, 90, 250, 700, 875, 1050, 150));
        var.game_cards.add(new Card("00101", "Av. Indiana", "rojo", 220, 110, 18, 90, 250, 700, 875, 1050, 150));
        var.game_cards.add(new Card("01101", "Av. Illinois", "rojo", 240, 120, 20, 100, 300, 750, 925, 1100, 150));
        var.game_cards.add(new Card("01110", "Av. Atlantico", "amarillo", 260, 130, 22, 110, 330, 800, 975, 1150, 150));
        var.game_cards.add(new Card("01111", "Av. Ventnor", "amarillo", 260, 130, 22, 110, 330, 800, 975, 1150, 150));
        var.game_cards.add(new Card("10000", "Jardines Marvin", "amarillo", 280, 140, 24, 120, 360, 850, 1025, 1200, 140));
        var.game_cards.add(new Card("10001", "Av. Pacifico", "verde", 300, 150, 26, 130, 390, 900, 1100, 1275, 200));
        var.game_cards.add(new Card("10010", "Av. Carolina del Norte", "verde", 300, 150, 26, 130, 390, 900, 1100, 1275, 200));
        var.game_cards.add(new Card("10011", "Av. Pensilvania", "verde", 320, 160, 28, 150, 450, 1000, 1200, 1400, 200));
        var.game_cards.add(new Card("10100", "Plaza del Parque", "azul", 350, 175, 35, 175, 500, 1100, 1300, 1500, 200));
        var.game_cards.add(new Card("10101", "Paseo Tablado", "azul", 400, 200, 50, 200, 600, 1400, 1700, 2000, 200));
        var.game_cards.add(new Card("10110", "Compania de Electricidad", "servicio", 150, 75, 0, 0, 0, 0, 0, 0, 0));
        var.game_cards.add(new Card("10111", "Obras de Agua Potable", "servicio", 150, 75, 0, 0, 0, 0, 0, 0, 0));
        var.game_cards.add(new Card("11000", "Ferrocarril Reading", "ferrocarril", 200, 100, 15, 25, 50, 100, 200, 250, 100));
        var.game_cards.add(new Card("11001", "Ferrocarril Pensilvania", "ferrocarril", 200, 100, 15, 25, 50, 100, 200, 250, 100));
        var.game_cards.add(new Card("11010", "Ferrocarril B & O", "ferrocarril", 200, 100, 15, 25, 50, 100, 200, 250, 100));
        var.game_cards.add(new Card("11011", "Ferrocarril Short Line", "ferrocarril", 200, 100, 15, 25, 50, 100, 200, 250, 100));
    }
    
    // Metodo para inicializar las casualidades
    public void initCasualities (Variables var) {
        var.game_casualities.add(new Casuality("00000", "get_10_bank"));
        var.game_casualities.add(new Casuality("00001", "get_20_bank"));
        var.game_casualities.add(new Casuality("00010", "get_25_bank"));
        var.game_casualities.add(new Casuality("00011", "get_45_bank"));
        var.game_casualities.add(new Casuality("00100", "get_100_bank"));
        var.game_casualities.add(new Casuality("00101", "get_100_bank"));
        var.game_casualities.add(new Casuality("00110", "get_100_bank"));
        var.game_casualities.add(new Casuality("00111", "get_200_bank"));
        var.game_casualities.add(new Casuality("01000", "get_200_GO"));
        var.game_casualities.add(new Casuality("01001", "go_jail"));
        var.game_casualities.add(new Casuality("01010", "out_jail_free"));
        var.game_casualities.add(new Casuality("01011", "get_cash_50_each_player"));
        var.game_casualities.add(new Casuality("01100", "pay_50_bank"));
        var.game_casualities.add(new Casuality("01101", "pay_100_bank"));
        var.game_casualities.add(new Casuality("01110", "pay_150_bank"));
        var.game_casualities.add(new Casuality("01111", "40_house_115_hotel"));    
    }
    
    // Metodo para inicializar las Arcas Comunales
    public void initComunalArks (Variables var) {
        var.game_comunal_arks.add(new ComunalArk("10000", "pay_50_each_player"));
        var.game_comunal_arks.add(new ComunalArk("10001", "go_jail"));
        var.game_comunal_arks.add(new ComunalArk("10010", "out_jail_free"));
        var.game_comunal_arks.add(new ComunalArk("10011", "get_200_GO"));
        var.game_comunal_arks.add(new ComunalArk("10100", "get_50_bank"));
        var.game_comunal_arks.add(new ComunalArk("10101", "get_150_bank"));
        var.game_comunal_arks.add(new ComunalArk("10110", "pay_15_bank"));
        var.game_comunal_arks.add(new ComunalArk("10111", "back_3_squares"));
        var.game_comunal_arks.add(new ComunalArk("11000", "go_paseo_tablado"));
        var.game_comunal_arks.add(new ComunalArk("11001", "go_av_illinois"));
        var.game_comunal_arks.add(new ComunalArk("11010", "go_plaza_san_carlos_GO_200"));
        var.game_comunal_arks.add(new ComunalArk("11010", "go_ferro_reading_GO_200"));
        var.game_comunal_arks.add(new ComunalArk("11100", "ferro_near_pay_double"));
        var.game_comunal_arks.add(new ComunalArk("11101", "public_service_pay_dices"));
        var.game_comunal_arks.add(new ComunalArk("11110", "25_house_100_hotel"));
        var.game_comunal_arks.add(new ComunalArk("11111", "get_100_bank"));   
    }
    
    // Metodo para inicializar las Estaciones del juego
    public void initStations(Variables var){
        var.game_stations.add(new Station("00", "Estacion 1"));
        var.game_stations.add(new Station("01", "Estacion 2"));
        var.game_stations.add(new Station("10", "Estacion 3"));
        var.game_stations.add(new Station("11", "Estacion 4"));
    }
    
    // Metodo para inicializar las Estaciones del juego
    public void initInstructions(Variables var){
        var.game_instructions.add(new GameInstruction("0000", "Iniciar Partida"));
        var.game_instructions.add(new GameInstruction("0001", "Tirar los Dados"));
        var.game_instructions.add(new GameInstruction("0010", "Subasta"));
        var.game_instructions.add(new GameInstruction("0011", "Respuesta Subasta"));
        var.game_instructions.add(new GameInstruction("0100", "Propiedades"));
        var.game_instructions.add(new GameInstruction("0101", "Tomar Tarjeta"));
        var.game_instructions.add(new GameInstruction("0110", "Retirarse del Juego"));
        var.game_instructions.add(new GameInstruction("0111", "Victoria"));
    }
    
    // Metodo para inicializar las acciones del jugador
    public void initPlayerInstructions(Variables var){
        var.game_player_instructions.add(new PlayerInstruction("100", "Comprar Propiedad"));
        var.game_player_instructions.add(new PlayerInstruction("101", "Vender Propiedad"));
        var.game_player_instructions.add(new PlayerInstruction("110", "Hipotecar"));
    }
    
    // Metodo para inicializar las todas las combinaciones de lanz. de dados
    public void initDices(Variables var){
        var.game_dices.add(new Dice("10001001", "11"));
        var.game_dices.add(new Dice("10010010", "22"));
        var.game_dices.add(new Dice("10011011", "33"));
        var.game_dices.add(new Dice("10100100", "44"));
        var.game_dices.add(new Dice("10101101", "55"));
        var.game_dices.add(new Dice("10110110", "66"));
        var.game_dices.add(new Dice("10001010", "12"));
        var.game_dices.add(new Dice("10001011", "13"));
        var.game_dices.add(new Dice("10001100", "14"));
        var.game_dices.add(new Dice("10001101", "15"));
        var.game_dices.add(new Dice("10001110", "16"));
        var.game_dices.add(new Dice("10010001", "21"));
        var.game_dices.add(new Dice("10010011", "23"));
        var.game_dices.add(new Dice("10010100", "24"));
        var.game_dices.add(new Dice("10010101", "25"));
        var.game_dices.add(new Dice("10010110", "26"));
        var.game_dices.add(new Dice("10011001", "31"));
        var.game_dices.add(new Dice("10011010", "32"));
        var.game_dices.add(new Dice("10011100", "34"));
        var.game_dices.add(new Dice("10011101", "35"));
        var.game_dices.add(new Dice("10011110", "36"));
        var.game_dices.add(new Dice("10100001", "41"));
        var.game_dices.add(new Dice("10100010", "42"));
        var.game_dices.add(new Dice("10100011", "43"));
        var.game_dices.add(new Dice("10100101", "45"));
        var.game_dices.add(new Dice("10100110", "46"));
        var.game_dices.add(new Dice("10101001", "51"));
        var.game_dices.add(new Dice("10101010", "52"));
        var.game_dices.add(new Dice("10101011", "53"));
        var.game_dices.add(new Dice("10101100", "54"));
        var.game_dices.add(new Dice("10101110", "56"));
        var.game_dices.add(new Dice("10110001", "61"));
        var.game_dices.add(new Dice("10110010", "62"));
        var.game_dices.add(new Dice("10110011", "63"));
        var.game_dices.add(new Dice("10110100", "64"));
        var.game_dices.add(new Dice("10110101", "65"));
    }
    
    public void initPositions(Variables var){
        var.coordinates.add(new Position(1,745,742));
        var.coordinates.add(new Position(2,640,720));
        var.coordinates.add(new Position(3,570,730));
        var.coordinates.add(new Position(4,510,722));
        var.coordinates.add(new Position(5,440,722));
        var.coordinates.add(new Position(6,370,722));
        var.coordinates.add(new Position(7,310,722));
        var.coordinates.add(new Position(8,245,722));
        var.coordinates.add(new Position(9,180,722));
        var.coordinates.add(new Position(10,115,722));
        var.coordinates.add(new Position(11,25,722));
        var.coordinates.add(new Position(12,25,630));
        var.coordinates.add(new Position(13,25,565));
        var.coordinates.add(new Position(14,25,500));
        var.coordinates.add(new Position(15,25,430));
        var.coordinates.add(new Position(16,25,365));
        var.coordinates.add(new Position(17,25,300));
        var.coordinates.add(new Position(18,25,240));
        var.coordinates.add(new Position(19,25,175));
        var.coordinates.add(new Position(20,25,100));
        var.coordinates.add(new Position(21,25,15));
        var.coordinates.add(new Position(22,115,15));
        var.coordinates.add(new Position(23,175,15));
        var.coordinates.add(new Position(24,250,15));
        var.coordinates.add(new Position(25,310,15));
        var.coordinates.add(new Position(26,380,15));
        var.coordinates.add(new Position(27,440,15));
        var.coordinates.add(new Position(28,505,15));
        var.coordinates.add(new Position(29,570,15));
        var.coordinates.add(new Position(30,640,15));
        var.coordinates.add(new Position(31,720,15));
        var.coordinates.add(new Position(32,720,110));
        var.coordinates.add(new Position(33,740,170));
        var.coordinates.add(new Position(34,720,240));
        var.coordinates.add(new Position(35,735,300));
        var.coordinates.add(new Position(36,720,370));
        var.coordinates.add(new Position(37,720,430));
        var.coordinates.add(new Position(38,735,500));
        var.coordinates.add(new Position(39,720,565));
        var.coordinates.add(new Position(40,735,630));
    }
    
}
