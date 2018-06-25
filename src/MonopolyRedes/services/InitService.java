package MonopolyRedes.services;
import MonopolyRedes.cards.Card;
import MonopolyRedes.Variables;
import MonopolyRedes.cards.Casuality;
import MonopolyRedes.cards.ComunalArk;

public class InitService {
    
    // Constructor vacio
    public InitService(){
        
    }
    
    // Metodo para inicializar las propiedades
    public void initCards (Variables var) {
        var.game_cards.add(new Card("00000", "Av. Mediterráneo", "morado"));
        var.game_cards.add(new Card("00001", "Av. Báltica", "morado"));
        var.game_cards.add(new Card("00010", "Av. Oriental", "gris claro"));
        var.game_cards.add(new Card("00011", "Av. Vermont", "gris claro"));
        var.game_cards.add(new Card("00100", "Av. Connecticut", "gris claro"));
        var.game_cards.add(new Card("00101", "Plaza San Carlos", "fucsia"));
        var.game_cards.add(new Card("00111", "Av. Virginia", "fucsia"));
        var.game_cards.add(new Card("01000", "Plaza Santiago", "naranja"));
        var.game_cards.add(new Card("01001", "Av. Tennessee", "naranja"));
        var.game_cards.add(new Card("01010", "Av. Nueva York", "naranja"));
        var.game_cards.add(new Card("01011", "Av. Kentucky", "rojo"));
        var.game_cards.add(new Card("00101", "Av. Indiana", "rojo"));
        var.game_cards.add(new Card("01101", "Av. Illinois", "rojo"));
        var.game_cards.add(new Card("01110", "Av. Atlantico", "amarillo"));
        var.game_cards.add(new Card("01111", "Av. Ventnor", "amarillo"));
        var.game_cards.add(new Card("10000", "Jardines Marvin", "amarillo"));
        var.game_cards.add(new Card("10001", "Av. Pacifico", "verde"));
        var.game_cards.add(new Card("10010", "Av. Carolina del Norte", "verde"));
        var.game_cards.add(new Card("10011", "Av. Pensilvania", "verde"));
        var.game_cards.add(new Card("10100", "Plaza del Parque", "azul"));
        var.game_cards.add(new Card("10101", "Paseo Tablado", "azul"));
        var.game_cards.add(new Card("10110", "Compania de Electricidad", "servicio"));
        var.game_cards.add(new Card("10111", "Obras de Agua Potable", "servicio"));
        var.game_cards.add(new Card("11000", "Ferrocarril Reading", "ferrocarril"));
        var.game_cards.add(new Card("11001", "Ferrocarril Pensilvania", "ferrocarril"));
        var.game_cards.add(new Card("11010", "Ferrocarril B & O", "ferrocarril"));
        var.game_cards.add(new Card("11011", "Ferrocarril Short Line", "ferrocarril"));
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
}
