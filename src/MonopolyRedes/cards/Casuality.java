/**************************************************************
* Clase para definir las tarjetas de casualidad del monopolio *
* @author :: Javier Stifano <jstifano18@gmail.com>            *
***************************************************************/
package MonopolyRedes.cards;

public class Casuality {
    
    // Atributos de la clase Casualidad
    private String serial;
    private String description;
    
    // Constructor vacio
    public Casuality(){}
    
    //  Constructor con parámetros
    public Casuality( String serial, String description){
        this.serial = serial;
        this.description = description;
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
    
}
