/***********************************************************************/
/* @author :: Javier Stifano <jstifano18@gmail.com                     */
/* description :: Clase principal para probar la libreria rx tx serial */
/***********************************************************************/


package MonopolyRedes;
//import MonopolyRedes.ConfigPort;

import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;


public class MonopolyRedes {
    
    public static void main(String[] args) throws UnsupportedCommOperationException, IOException, PortInUseException {
        try {
            ConfigPort ports = new ConfigPort();
            ports.identifyPorts(); // Logs all the ports availables.
            int bufferData = ports.getBufferData();
            System.out.println("La data recibida es ::: " + bufferData);
            ports.sendData("Pasaremos redes relajados");
        }catch (PortInUseException e){
            System.out.println("exception " + e);
        }
            
    }
    
}
