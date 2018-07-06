package MonopolyRedes.cards;

public class Property {
    
    private int position_array; // Numero de la propiedad para buscar en Cards
    private String serial; // Codigo serial de la propiedad
    private String owner; // Dueño de la propiedad
    private String property_name; // Nombre de la propiedad
    private int price;
    private int price_rent; 
    private int mortgage; // Precio de hipoteca de la propiedad
    private int number_houses; // Numero de casas compradas
    private int number_hotels;
    
    public Property(){
        this.position_array = 0;
        this.price = 0;
        this.price_rent = 0;
        this.owner = "";
        this.property_name = "";
        this.number_houses = 0;
        this.number_hotels = 0;
        this.mortgage = 0;
        this.serial = "";
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
    
    public void setPriceRent(int rent){
        this.price_rent = rent;
    }
    
    public int getPriceRent(){
        return this.price_rent;
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
    
    public void setPosition(int position){
        this.position_array = position;
    }
    
    public int getPositionArray(){
        return this.position_array;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public void setMortgage(int mortgage){
        this.mortgage = mortgage;
    }
    
    public int getMortgage(){
        return this.mortgage;
    }
    
    public void setSerial(String serial){
        this.serial = serial;
    }
    
    public String getSerial(){
        return this.serial;
    }
    
}
