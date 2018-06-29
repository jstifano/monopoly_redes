/***********************************************************************/
/* @author :: Javier Stifano <jstifano18@gmail.com                     */
/* description :: Clase principal para probar la libreria rx tx serial */
/***********************************************************************/


package MonopolyRedes;
//import MonopolyRedes.ConfigPort;
import MonopolyRedes.services.InitService;
import MonopolyRedes.utils.ActionDice;
import MonopolyRedes.Variables;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;

public class MonopolyRedes {
    
    public static void main(String[] args) throws UnsupportedCommOperationException, IOException, PortInUseException {
        
        //try {
            Variables var = new Variables(); // Variables a utilizar durante el juego
            InitService init = new InitService();
            init.initCards(var);
            
            System.out.println(var.getCards());
            System.out.println("dices :::" + ActionDice.throwDices(2, 6));
            ConfigPort ports = new ConfigPort();
            ports.identifyPorts(); // Imprime todos los puertos disponibles en la PC.
            String bufferData = ports.getBufferData();
            ports.sendData("01001010111001010001010");
            
            
        //}catch (PortInUseException e){
            //System.out.println("exception " + e);
        //}
            
    }
    
}
