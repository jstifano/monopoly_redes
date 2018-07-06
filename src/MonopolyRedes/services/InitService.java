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
    public void initCards () {
        Variables.game_cards.add(new Card(1, "00000", "Av. Mediterráneo", "morado", 60, 30, 2, 10, 30, 90, 160, 250, 50));
        Variables.game_cards.add(new Card(3, "00001", "Av. Báltica", "morado", 60, 30, 4, 20, 60, 180, 320, 450, 50));
        Variables.game_cards.add(new Card(6, "00010", "Av. Oriental", "gris claro", 100, 50, 6, 30, 90, 270, 400, 550, 50));
        Variables.game_cards.add(new Card(8, "00011", "Av. Vermont", "gris claro", 100, 50, 6, 30, 90, 270, 400, 550, 50));
        Variables.game_cards.add(new Card(9, "00100", "Av. Connecticut", "gris claro", 120, 60, 8, 40, 100, 300, 450, 600, 50));
        Variables.game_cards.add(new Card(11, "00101", "Plaza San Carlos", "fucsia", 140, 70, 10, 50, 150, 450, 625, 750, 100));
        Variables.game_cards.add(new Card(13, "00110", "Av. de los Estados", "fucsia", 140, 70, 10, 50, 150, 450, 625, 750, 100));
        Variables.game_cards.add(new Card(14, "00111", "Av. Virginia", "fucsia", 160, 80, 12, 60, 180, 500, 700, 900, 100));
        Variables.game_cards.add(new Card(16, "01000", "Plaza Santiago", "naranja", 180, 90, 14, 70, 200, 550, 750, 950, 100));
        Variables.game_cards.add(new Card(18, "01001", "Av. Tennessee", "naranja", 180, 90, 14, 70, 200, 550, 750, 950, 100));
        Variables.game_cards.add(new Card(19, "01010", "Av. Nueva York", "naranja", 200, 100, 16, 80, 220, 600, 800, 1000, 100));
        Variables.game_cards.add(new Card(21, "01011", "Av. Kentucky", "rojo", 220, 110, 18, 90, 250, 700, 875, 1050, 150));
        Variables.game_cards.add(new Card(23, "00101", "Av. Indiana", "rojo", 220, 110, 18, 90, 250, 700, 875, 1050, 150));
        Variables.game_cards.add(new Card(24, "01101", "Av. Illinois", "rojo", 240, 120, 20, 100, 300, 750, 925, 1100, 150));
        Variables.game_cards.add(new Card(26, "01110", "Av. Atlantico", "amarillo", 260, 130, 22, 110, 330, 800, 975, 1150, 150));
        Variables.game_cards.add(new Card(27, "01111", "Av. Ventnor", "amarillo", 260, 130, 22, 110, 330, 800, 975, 1150, 150));
        Variables.game_cards.add(new Card(29, "10000", "Jardines Marvin", "amarillo", 280, 140, 24, 120, 360, 850, 1025, 1200, 140));
        Variables.game_cards.add(new Card(31, "10001", "Av. Pacifico", "verde", 300, 150, 26, 130, 390, 900, 1100, 1275, 200));
        Variables.game_cards.add(new Card(32, "10010", "Av. Carolina del Norte", "verde", 300, 150, 26, 130, 390, 900, 1100, 1275, 200));
        Variables.game_cards.add(new Card(34, "10011", "Av. Pensilvania", "verde", 320, 160, 28, 150, 450, 1000, 1200, 1400, 200));
        Variables.game_cards.add(new Card(37, "10100", "Plaza del Parque", "azul", 350, 175, 35, 175, 500, 1100, 1300, 1500, 200));
        Variables.game_cards.add(new Card(39, "10101", "Paseo Tablado", "azul", 400, 200, 50, 200, 600, 1400, 1700, 2000, 200));
        Variables.game_cards.add(new Card(12, "10110", "Compania de Electricidad", "servicio", 150, 75, 0, 0, 0, 0, 0, 0, 0));
        Variables.game_cards.add(new Card(28, "10111", "Obras de Agua Potable", "servicio", 150, 75, 0, 0, 0, 0, 0, 0, 0));
        Variables.game_cards.add(new Card(5, "11000", "Ferrocarril Reading", "ferrocarril", 200, 100, 15, 25, 50, 100, 200, 250, 100));
        Variables.game_cards.add(new Card(15, "11001", "Ferrocarril Pensilvania", "ferrocarril", 200, 100, 15, 25, 50, 100, 200, 250, 100));
        Variables.game_cards.add(new Card(25, "11010", "Ferrocarril B & O", "ferrocarril", 200, 100, 15, 25, 50, 100, 200, 250, 100));
        Variables.game_cards.add(new Card(35, "11011", "Ferrocarril Short Line", "ferrocarril", 200, 100, 15, 25, 50, 100, 200, 250, 100));
    }
    
    // Metodo para inicializar las casualidades
    public void initCasualities () {
        Variables.game_casualities.add(new Casuality("00000", "get_10_bank"));
        Variables.game_casualities.add(new Casuality("00001", "get_20_bank"));
        Variables.game_casualities.add(new Casuality("00010", "get_25_bank"));
        Variables.game_casualities.add(new Casuality("00011", "get_45_bank"));
        Variables.game_casualities.add(new Casuality("00100", "get_100_bank"));
        Variables.game_casualities.add(new Casuality("00101", "get_100_bank"));
        Variables.game_casualities.add(new Casuality("00110", "get_100_bank"));
        Variables.game_casualities.add(new Casuality("00111", "get_200_bank"));
        Variables.game_casualities.add(new Casuality("01000", "get_200_GO"));
        Variables.game_casualities.add(new Casuality("01001", "go_jail"));
        Variables.game_casualities.add(new Casuality("01010", "out_jail_free"));
        Variables.game_casualities.add(new Casuality("01011", "get_cash_50_each_player"));
        Variables.game_casualities.add(new Casuality("01100", "pay_50_bank"));
        Variables.game_casualities.add(new Casuality("01101", "pay_100_bank"));
        Variables.game_casualities.add(new Casuality("01110", "pay_150_bank"));
        Variables.game_casualities.add(new Casuality("01111", "40_house_115_hotel"));    
    }
    
    // Metodo para inicializar las Arcas Comunales
    public void initComunalArks () {
        Variables.game_comunal_arks.add(new ComunalArk("10000", "pay_50_each_player"));
        Variables.game_comunal_arks.add(new ComunalArk("10001", "go_jail"));
        Variables.game_comunal_arks.add(new ComunalArk("10010", "out_jail_free"));
        Variables.game_comunal_arks.add(new ComunalArk("10011", "get_200_GO"));
        Variables.game_comunal_arks.add(new ComunalArk("10100", "get_50_bank"));
        Variables.game_comunal_arks.add(new ComunalArk("10101", "get_150_bank"));
        Variables.game_comunal_arks.add(new ComunalArk("10110", "pay_15_bank"));
        Variables.game_comunal_arks.add(new ComunalArk("10111", "back_3_squares"));
        Variables.game_comunal_arks.add(new ComunalArk("11000", "go_paseo_tablado"));
        Variables.game_comunal_arks.add(new ComunalArk("11001", "go_av_illinois"));
        Variables.game_comunal_arks.add(new ComunalArk("11010", "go_plaza_san_carlos_GO_200"));
        Variables.game_comunal_arks.add(new ComunalArk("11010", "go_ferro_reading_GO_200"));
        Variables.game_comunal_arks.add(new ComunalArk("11100", "ferro_near_pay_double"));
        Variables.game_comunal_arks.add(new ComunalArk("11101", "public_service_pay_dices"));
        Variables.game_comunal_arks.add(new ComunalArk("11110", "25_house_100_hotel"));
        Variables.game_comunal_arks.add(new ComunalArk("11111", "get_100_bank"));   
    }
    
    // Metodo para inicializar las Estaciones del juego
    public void initStations(){
        Variables.game_stations.add(new Station("00", "Estacion 1"));
        Variables.game_stations.add(new Station("01", "Estacion 2"));
        Variables.game_stations.add(new Station("10", "Estacion 3"));
        Variables.game_stations.add(new Station("11", "Estacion 4"));
    }
    
    // Metodo para inicializar las Estaciones del juego
    public void initInstructions(){
        Variables.game_instructions.add(new GameInstruction("0000", "Iniciar Partida"));
        Variables.game_instructions.add(new GameInstruction("0001", "Tirar los Dados"));
        Variables.game_instructions.add(new GameInstruction("0010", "Subasta"));
        Variables.game_instructions.add(new GameInstruction("0011", "Respuesta Subasta"));
        Variables.game_instructions.add(new GameInstruction("0100", "Propiedades"));
        Variables.game_instructions.add(new GameInstruction("0101", "Tomar Tarjeta"));
        Variables.game_instructions.add(new GameInstruction("0110", "Retirarse del Juego"));
        Variables.game_instructions.add(new GameInstruction("0111", "Finalizar turno"));
    }
    
    // Metodo para inicializar las acciones del jugador
    public void initPlayerInstructions(){
        Variables.game_player_instructions.add(new PlayerInstruction("100", "Comprar Propiedad"));
        Variables.game_player_instructions.add(new PlayerInstruction("101", "Vender Propiedad"));
        Variables.game_player_instructions.add(new PlayerInstruction("110", "Hipotecar"));
        Variables.game_player_instructions.add(new PlayerInstruction("111", "Pagar Impuesto"));
        Variables.game_player_instructions.add(new PlayerInstruction("010", "Pagar Propiedad"));
        Variables.game_player_instructions.add(new PlayerInstruction("000", "Owner Propiedad"));
    }
    
    // Metodo para inicializar las todas las combinaciones de lanz. de dados
    public void initDices(){
        Variables.game_dices.add(new Dice("10001001", "11"));
        Variables.game_dices.add(new Dice("10010010", "22"));
        Variables.game_dices.add(new Dice("10011011", "33"));
        Variables.game_dices.add(new Dice("10100100", "44"));
        Variables.game_dices.add(new Dice("10101101", "55"));
        Variables.game_dices.add(new Dice("10110110", "66"));
        Variables.game_dices.add(new Dice("10001010", "12"));
        Variables.game_dices.add(new Dice("10001011", "13"));
        Variables.game_dices.add(new Dice("10001100", "14"));
        Variables.game_dices.add(new Dice("10001101", "15"));
        Variables.game_dices.add(new Dice("10001110", "16"));
        Variables.game_dices.add(new Dice("10010001", "21"));
        Variables.game_dices.add(new Dice("10010011", "23"));
        Variables.game_dices.add(new Dice("10010100", "24"));
        Variables.game_dices.add(new Dice("10010101", "25"));
        Variables.game_dices.add(new Dice("10010110", "26"));
        Variables.game_dices.add(new Dice("10011001", "31"));
        Variables.game_dices.add(new Dice("10011010", "32"));
        Variables.game_dices.add(new Dice("10011100", "34"));
        Variables.game_dices.add(new Dice("10011101", "35"));
        Variables.game_dices.add(new Dice("10011110", "36"));
        Variables.game_dices.add(new Dice("10100001", "41"));
        Variables.game_dices.add(new Dice("10100010", "42"));
        Variables.game_dices.add(new Dice("10100011", "43"));
        Variables.game_dices.add(new Dice("10100101", "45"));
        Variables.game_dices.add(new Dice("10100110", "46"));
        Variables.game_dices.add(new Dice("10101001", "51"));
        Variables.game_dices.add(new Dice("10101010", "52"));
        Variables.game_dices.add(new Dice("10101011", "53"));
        Variables.game_dices.add(new Dice("10101100", "54"));
        Variables.game_dices.add(new Dice("10101110", "56"));
        Variables.game_dices.add(new Dice("10110001", "61"));
        Variables.game_dices.add(new Dice("10110010", "62"));
        Variables.game_dices.add(new Dice("10110011", "63"));
        Variables.game_dices.add(new Dice("10110100", "64"));
        Variables.game_dices.add(new Dice("10110101", "65"));
    }
    
    public void initPositions(){
        Variables.coordinates.add(new Position(1,1020,735));
        Variables.coordinates.add(new Position(2,940,720));
        Variables.coordinates.add(new Position(3,870,720));
        Variables.coordinates.add(new Position(4,805,740));
        Variables.coordinates.add(new Position(5,740,720));
        Variables.coordinates.add(new Position(6,680,720));
        Variables.coordinates.add(new Position(7,610,740));
        Variables.coordinates.add(new Position(8,545,720));
        Variables.coordinates.add(new Position(9,480,720));
        Variables.coordinates.add(new Position(10,410,720));
        Variables.coordinates.add(new Position(11,330,720));
        Variables.coordinates.add(new Position(12,310,630));
        Variables.coordinates.add(new Position(13,310,570));
        Variables.coordinates.add(new Position(14,310,510));
        Variables.coordinates.add(new Position(15,310,440));
        Variables.coordinates.add(new Position(16,310,370));
        Variables.coordinates.add(new Position(17,310,300));
        Variables.coordinates.add(new Position(18,310,240));
        Variables.coordinates.add(new Position(19,310,170));
        Variables.coordinates.add(new Position(20,310,110));
        Variables.coordinates.add(new Position(21,310,20));
        Variables.coordinates.add(new Position(22,420,20));
        Variables.coordinates.add(new Position(23,480,20));
        Variables.coordinates.add(new Position(24,550,20));
        Variables.coordinates.add(new Position(25,610,20));
        Variables.coordinates.add(new Position(26,680,20));
        Variables.coordinates.add(new Position(27,740,20));
        Variables.coordinates.add(new Position(28,800,20));
        Variables.coordinates.add(new Position(29,880,20));
        Variables.coordinates.add(new Position(30,940,20));
        Variables.coordinates.add(new Position(31,1035,20));
        Variables.coordinates.add(new Position(32,1035,110));
        Variables.coordinates.add(new Position(33,1035,180));
        Variables.coordinates.add(new Position(34,1035,240));
        Variables.coordinates.add(new Position(35,1035,300));
        Variables.coordinates.add(new Position(36,1035,370));
        Variables.coordinates.add(new Position(37,1025,430));
        Variables.coordinates.add(new Position(38,1025,500));
        Variables.coordinates.add(new Position(39,1025,565));
        Variables.coordinates.add(new Position(40,1025,630));
    }
    
}
