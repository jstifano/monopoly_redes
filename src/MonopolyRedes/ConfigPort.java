/***********************************************************************/
/* @author :: Javier Stifano <jstifano18@gmail.com                     */
/* description :: Clase principal para configurar los puertos seriales */
/***********************************************************************/

package MonopolyRedes;
import gnu.io.*; // Importo la libreria RXTX para su uso
import java.io.IOException;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Scanner;

public class ConfigPort {
    
    // ******* Variables para la configuración de los puertos ***************** //
    Enumeration commports = CommPortIdentifier.getPortIdentifiers(); 
    CommPortIdentifier port_identifier;
    CommPort port;
    SerialPort mySerialPort;
    Scanner myScanner;
    PrintStream myPrintStream;
    // ******* Variables para la configuración de los puertos ***************** //
    
    // Constructor
    public ConfigPort(){
        this.port_identifier = null;
        this.port = null;
        this.myScanner = null;
        this.myPrintStream = null;
    }
    
    /***************************************************** 
    * Método para identificar que puertos estan abiertos *
     * @throws java.io.IOException                       *
     * @throws gnu.io.UnsupportedCommOperationException  *
     * @throws gnu.io.PortInUseException                 *
    ******************************************************/
    
    public void identifyPorts() throws UnsupportedCommOperationException, PortInUseException, IOException{
        
        while(this.commports.hasMoreElements()){
            this.port_identifier = (CommPortIdentifier) this.commports.nextElement();
            
            if(this.port_identifier.getName().equals("COM1"))
                break;
        }
            
        this.port = this.port_identifier.open("Puerto Serial", 2000);
        this.mySerialPort = (SerialPort) this.port; // Instancio el puerto serial

        // Seteo los parametros para utilizar dicho puerto
            // 1) 19200: Velocidad de envio de bits
            // 2) DATABITS: Número de bits de la trama
            // 3) STOPBITS: Número de bits de parada
            // 4) PARITY: Paridad en la trama, en este caso es NONE porque no hay

        this.mySerialPort.setSerialPortParams(2400, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
        this.myScanner = new Scanner (this.mySerialPort.getInputStream());
        this.myPrintStream = new PrintStream (this.mySerialPort.getOutputStream());      
    }
    
    /********************************************************
    * Metodo para recibir los datos que llegan en el buffer *
    * @return                                               *
    * @throws java.io.IOException                           *
    *********************************************************/
    
    public String getBufferData() throws IOException{
         // Leo cada uno de los bytes en el buffer de datos
        while(!this.myScanner.hasNext()){
            this.myScanner.close(); // Debo cerrarlo ya que hay un bug con el Scanner
            this.myScanner = null;
            this.myScanner = new Scanner(this.port.getInputStream());
        }
        String trama = this.myScanner.next();
        System.out.println("Trama :::" + trama);
        return trama;
    }
    
    /********************************************
    * Metodo para enviar los datos serializados *
    * @param data                               *
    *********************************************/
    
    public void sendData(String data){
        this.myPrintStream.println(data);
    }
}
