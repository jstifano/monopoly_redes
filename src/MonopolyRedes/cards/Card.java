/***************************************************
* Clase para definir las propiedades del Monopolio *
* @author :: Javier Stifano <jstifano18@gmail.com> *
****************************************************/

package MonopolyRedes.cards;

public class Card {
    
    // Atributos de la clase
    private int position;
    private String serial;
    private String description;
    private String color;
    private int price; // Precio de la propiedad;
    private int mortgage; // Valor de hipoteca
    private int rent; // Precio de alquiler sin tener casas
    private int price_house_1;
    private int price_house_2;
    private int price_house_3;
    private int price_house_4;
    private int price_hotel;
    private int house_hotel;
    
    // Constructor vacio
    public Card(){}
    
    //  Constructor con parámetros
    public Card( int position, String serial, String description, String color, int price, int mortgage, int rent, int h1, int h2, int h3, int h4, int hotel, int house_hotel){
        this.position = position;
        this.serial = serial;
        this.description = description;
        this.color = color;
        this.price = price;
        this.mortgage = mortgage;
        this.rent = rent;
        this.price_house_1 = h1;
        this.price_house_2 = h2;
        this.price_house_3 = h3;
        this.price_house_4 = h4;
        this.price_hotel = hotel;
        this.house_hotel = house_hotel;
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
    
    public int getPrice(){
        return this.price;
    }
    
    public int getMortgage(){
        return this.mortgage;
    }
    
    public int getPriceRent(){
        return this.rent;
    }
    
    public int getPriceHouse(int number_houses){
        switch (number_houses) {
            case 1:
                return this.price_house_1;
            case 2:
                return this.price_house_2;
            case 3:
                return this.price_house_3;
            case 4:
                return this.price_house_4;
            default:
                break;
        }
        return this.price_house_1;
    }
    
    public int getPriceHotel(){
        return this.price_hotel;
    }
    
    // Metodo que devuelve el valor para comprar una casa u hotel
    public int getPrinceHH(){
        return this.house_hotel;
    }
    
    public int getPosition(){
        return this.getPosition();
    }
    
}
