package MonopolyRedes.cards;

public class Dice {

    // Atributos de la clase
    private String serial;
    private String dice_number;
    
    // Constructor vacio
    public Dice(){}
    
    //  Constructor con parámetros
    public Dice( String serial, String dice_number ){
        this.serial = serial;
        this.dice_number = dice_number;
    }
    
    public String getSerial(){
        return this.serial;
    }
    
    public void setSerial(String serial){
        this.serial = serial;
    }
    
    public String getDiceNumber(){
        return this.dice_number;
    }
    
    public void setDiceNumber(String dice_number){
        this.dice_number = dice_number;
    }
}
