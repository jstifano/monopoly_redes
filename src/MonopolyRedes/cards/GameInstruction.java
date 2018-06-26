/*****************************************************
* Clase para definir las instrucciones del Monopolio *
* @author :: Javier Stifano <jstifano18@gmail.com>   *
******************************************************/

package MonopolyRedes.cards;

public class GameInstruction {
    // Atributos de la clase
    private String serial;
    private String action;
    
    // Constructor vacio
    public GameInstruction(){}
    
    //  Constructor con parámetros
    public GameInstruction( String serial, String action ){
        this.serial = serial;
        this.action = action;
    }
    
    public String getSerial(){
        return this.serial;
    }
    
    public void setSerial(String serial){
        this.serial = serial;
    }
    
    public String getActionGame(){
        return this.action;
    }
    
    public void setActionGame(String action){
        this.action = action;
    }
   
}
