package MonopolyRedes.cards;
import java.util.ArrayList;

public class Player {
    
    private int money; // Dinero del player
    private boolean prisoner; // Para saber si está en la carcel o no
    private ArrayList<Property> ownerships; // Propiedades compradas por el player
    
    public Player(){
        this.money = 2000;
        this.prisoner = false;
        this.ownerships = new ArrayList<>();
    }
    
    public Property findProperty(String name){
        Property result = new Property();
        boolean checked = false;
        
        for (int i = 0; i < this.ownerships.size(); i++) {
            if(this.ownerships.get(i).getPropertyName().equals(name)){
                checked = true;
                result = this.ownerships.get(i);
            }
        }
        
        if(checked == true){
            return result;
        }
        else {
            return new Property();
        }
    }
    
    public void addProperty(Property property){
        this.ownerships.add(property);
    }
    
    public void plusMoney(int number){
        this.money += number;
    }
    
    public void downMoney(int number){
        this.money -= number;
    }
    
    public int getMoney(){
        return this.money;
    }
    
    public void goToJail(){
        this.prisoner = true;
    }
    
    public boolean isPrisoner(){
        return this.prisoner;
    }
}
