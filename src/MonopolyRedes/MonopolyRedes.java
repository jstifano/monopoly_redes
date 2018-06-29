/***********************************************************************/
/* @author :: Javier Stifano <jstifano18@gmail.com                     */
/* description :: Clase principal para probar la libreria rx tx serial */
/***********************************************************************/


package MonopolyRedes;
//import MonopolyRedes.ConfigPort;
import MonopolyRedes.services.InitService;
import MonopolyRedes.Variables;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;
import MonopolyRedes.views.Board;
import java.awt.Point;

public class MonopolyRedes {
    
    public static void main(String[] args) throws UnsupportedCommOperationException, IOException, PortInUseException {
     
        //try {
            Variables var = new Variables(); // Variables a utilizar durante el juego
            Board board = new Board();
            int x = 70;
            int y = 700;
            InitService init = new InitService();
            init.initCards(var);
            init.initPositions(var);
            /*ConfigPort ports = new ConfigPort();
            ports.identifyPorts(); // Imprime todos los puertos disponibles en la PC.
            String bufferData = ports.getBufferData();
            ports.sendData("01001010111001010001010");*/
            
            board.setVisible(true);
            board.setLocationRelativeTo(null); // Coloca la pantalla en el centro
             
        //}catch (PortInUseException e){
            //System.out.println("exception " + e);
        //}
            
    }
    
}
