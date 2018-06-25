/*******************************************************
* Clase para definir las arcas comunales del monopolio *
* @author :: Javier Stifano <jstifano18@gmail.com>     *
********************************************************/
package MonopolyRedes.cards;

public class ComunalArk {   
    // Atributos de la clase Arca Comunal
    private String serial;
    private String description;
    
    // Constructor vacio
    public ComunalArk(){}
    
    //  Constructor con parámetros
    public ComunalArk( String serial, String description){
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
