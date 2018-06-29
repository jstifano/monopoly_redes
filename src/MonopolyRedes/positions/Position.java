/*****************************************************************
* Clase para definir las coordenadas de cada casilla del tablero *
* @author :: Javier Stifano <jstifano18@gmail.com>               *
*****************************************************************/
package MonopolyRedes.positions;

public class Position {
    
    // Atributos de la clase Position
    private int id;
    private int coordinate_x;
    private int coordinate_y;
    
    // Constructor vacio
    public Position(){}
    
    //  Constructor con parámetros
    public Position( int id, int coordinate_x, int coordinate_y){
        this.id = id;
        this.coordinate_x = coordinate_x;
        this.coordinate_y = coordinate_y;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getCoordinateX(){
        return this.coordinate_x;
    }
    
    public void setCoordinateX(int coordinate_x){
        this.coordinate_x = coordinate_x;
    }
    
    public int getCoordinateY(){
        return this.coordinate_y;
    }
    
    public void setCoordinatY(int coordinate_y){
        this.coordinate_y = coordinate_y;
    }
    
}

