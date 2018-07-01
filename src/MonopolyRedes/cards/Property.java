

package MonopolyRedes.cards;

public class Property {
    
    private String owner; // Dueño de la propiedad
    private String property_name; // Nombre de la propiedad
    private int number_houses; // Numero de casas compradas
    private int number_hotels;
    
    public Property(){
        this.owner = "";
        this.property_name = "";
        this.number_houses = 0;
        this.number_hotels = 0;
    }
    
    public Property(String owner, String property_name, int number_houses, int number_hotels){
        this.owner = owner;
        this.property_name = property_name;
        this.number_houses = number_houses;
        this.number_hotels = number_hotels;
    }
    
    public String getPropertyName(){
        return this.property_name;
    }
    
    public void setPropertyName(String name){
        this.property_name = name;
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public void setOwner(String owner){
        this.owner = owner;
    }
    
    public int getNumberHouses(){
        return this.number_houses;
    }
    
    public void plusNumberHouses(){
        this.number_houses += 1;
    }
    
     public int getNumberHotels(){
        return this.number_hotels;
    }
    
    public void plusNumberHotels(){
        this.number_hotels += 1;
    }
    
    public void removeHouse(){
        this.number_houses -= 1;
    }
    
    public void removeHotel(){
        this.number_houses -= 1;
    }
}
