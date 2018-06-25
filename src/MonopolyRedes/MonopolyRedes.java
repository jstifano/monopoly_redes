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


public class MonopolyRedes {
    
    public static void main(String[] args) throws UnsupportedCommOperationException, IOException, PortInUseException {
        
        //try {
            /*Variables var = new Variables();
            InitService init = new InitService();
            init.initCards(var);
            System.out.println(var.getCards());*/
            ConfigPort ports = new ConfigPort();
            ports.identifyPorts(); // Imprime todos los puertos disponibles en la PC.
            String bufferData = ports.getBufferData();
            System.out.println("La data recibida es ::: " + bufferData);
            ports.sendData("Hola Giselle");
        //}catch (PortInUseException e){
            //System.out.println("exception " + e);
        //}
            
    }
    
}
