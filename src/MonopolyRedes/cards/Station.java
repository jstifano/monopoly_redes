/*********************************************************************
* Clase para definir las estaciones del Monopolio (Origen y Destino) *
* @author :: Javier Stifano <jstifano18@gmail.com>                   *
**********************************************************************/
package MonopolyRedes.cards;

public class Station {
    
    // Atributos de la clase
    private String serial;
    private String name;
    
    // Constructor vacio
    public Station(){}
    
    //  Constructor con parámetros
    public Station( String serial, String name ){
        this.serial = serial;
        this.name = name;
    }
    
    public String getSerial(){
        return this.serial;
    }
    
    public void setSerial(String serial){
        this.serial = serial;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setDescription(String name){
        this.name = name;
    }

}
