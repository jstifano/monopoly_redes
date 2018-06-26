/*******************************************************************
* Clase para definir las acciones del jugador durante el monopolio *
* @author :: Javier Stifano <jstifano18@gmail.com>                 *
********************************************************************/
package MonopolyRedes.cards;

public class PlayerInstruction {
    // Atributos de la clase
    private String serial;
    private String action;
    
    // Constructor vacio
    public PlayerInstruction(){}
    
    //  Constructor con parámetros
    public PlayerInstruction( String serial, String action ){
        this.serial = serial;
        this.action = action;
    }
    
    public String getSerial(){
        return this.serial;
    }
    
    public void setSerial(String serial){
        this.serial = serial;
    }
    
    public String getActionPlayer(){
        return this.action;
    }
    
    public void setActionPlayer(String action){
        this.action = action;
    }

}
