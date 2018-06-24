/***************************************************
* Clase para definir las propiedades del Monopolio *
* @author :: Javier Stifano <jstifano18@gmail.com> *
****************************************************/

package MonopolyRedes.cards;

public class Card {
    
    // Atributos de la clase
    private String serial;
    private String description;
    private String color;
    
    // Constructor vacio
    public Card(){}
    
    //  Constructor con parámetros
    public Card( String serial, String description, String color ){
        this.serial = serial;
        this.description = description;
        this.color = color;
    }
    
    public String getSerial(){
        return this.serial;
    }
    
    public void setSerial(String serial){
        this.serial = serial;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
}
