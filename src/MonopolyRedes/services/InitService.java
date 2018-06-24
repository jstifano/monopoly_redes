package MonopolyRedes.services;
import MonopolyRedes.cards.Card;
import MonopolyRedes.Variables;

public class InitService {
    
    // Constructor vacio
    public InitService(){
        
    }
    
    // Metodo para inicializar 
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
}
