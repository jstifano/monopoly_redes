/***********************************************************************/
/* @author :: Javier Stifano <jstifano18@gmail.com                     */
/* description :: Clase principal para configurar los puertos seriales */
/***********************************************************************/

package MonopolyRedes;
import MonopolyRedes.cards.Player;
import MonopolyRedes.cards.Property;
import MonopolyRedes.views.Board;
import gnu.io.*; // Importo la libreria RXTX para su uso
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConfigPort implements Runnable{
    
    // ******* Variables para la configuración de los puertos ***************** //
    Enumeration commports = CommPortIdentifier.getPortIdentifiers();
    CommPortIdentifier port_identifier;
    CommPort port;
    SerialPort mySerialPort;
    InputStream in; // Variable para recibir las tramas
    PrintStream out; // Variable para enviar las tramas
    private boolean live = true;
    String used_port;
    private String player_id;
    private int current_position;
    Player player;
    // ******* Variables para la configuración de los puertos ***************** //
    
    // Constructor
    public ConfigPort(){
        this.port_identifier = null;
        this.port = null;
        this.player = new Player();
    }
    
    public void setPlayerId(String id){
        this.player_id = id;
    }
    
    public String getPlayerId(){
        return this.player_id;
    }
    
    public void addProperty(Property property){
        this.player.addProperty(property);
    }
    
    public void downMoney(int money){
        this.player.downMoney(money);
    }
    
    public void plusMoney(int money){
        this.player.plusMoney(money);
    }
    
    public int getMoney(){
        return this.player.getMoney();
    }
    
    public Property findProperty(String name){
        return this.player.findProperty(name);
    }
    
    public void setPosition(int position){
        this.current_position = position;
    }
    
    public int getPosition(){
        return this.current_position;
    }
    
    public void plusPosition(int position) {
        this.current_position += position;
    }
    
    public void downPosition(int position) {
        this.current_position -= position;
    }
    
    /***************************************************** 
    * Método para identificar que puertos estan abiertos *
     * @throws java.io.IOException                       *
     * @throws gnu.io.UnsupportedCommOperationException  *
     * @throws gnu.io.PortInUseException                 *
    ******************************************************/
    
    public void identifyPorts() throws UnsupportedCommOperationException, IOException{
        try {
            while(this.commports.hasMoreElements()){
                this.port_identifier = (CommPortIdentifier) this.commports.nextElement();
                if(this.port_identifier.getName().equals("COM1")){
                    break;
                }   
            }
            this.port = this.port_identifier.open("Serial Port", 2000);
            this.port.setInputBufferSize(32);
            this.port.setOutputBufferSize(32);

            this.mySerialPort = (SerialPort) this.port; // Instancio el puerto serial
                // Seteo los parametros para utilizar dicho puerto
                // 1) 19200: Velocidad de envio de bits
                // 2) DATABITS: Número de bits de la trama
                // 3) STOPBITS: Número de bits de parada
                // 4) PARITY: Paridad en la trama, en este caso es NONE porque no hay

            this.mySerialPort.setSerialPortParams(2400, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
            this.in = this.mySerialPort.getInputStream();
            this.out = new PrintStream (this.mySerialPort.getOutputStream());
              
        } catch (PortInUseException ex) {
            try {
                this.port_identifier = (CommPortIdentifier) this.commports.nextElement();
                this.port_identifier = (CommPortIdentifier) this.commports.nextElement();
                this.port = this.port_identifier.open("Serial Port", 2000);
                
                this.port.setInputBufferSize(32);
                this.port.setOutputBufferSize(32);

                this.mySerialPort = (SerialPort) this.port; // Instancio el puerto serial
                    // Seteo los parametros para utilizar dicho puerto
                    // 1) 19200: Velocidad de envio de bits
                    // 2) DATABITS: Número de bits de la trama
                    // 3) STOPBITS: Número de bits de parada
                    // 4) PARITY: Paridad en la trama, en este caso es NONE porque no hay

                this.mySerialPort.setSerialPortParams(2400, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
                this.in = this.mySerialPort.getInputStream();
                this.out = new PrintStream (this.mySerialPort.getOutputStream());
            } catch (PortInUseException ex1) {
                try {
                    this.port_identifier = (CommPortIdentifier) this.commports.nextElement();
                    this.port_identifier = (CommPortIdentifier) this.commports.nextElement();
                    this.port = this.port_identifier.open("Serial Port", 2000);

                    this.port.setInputBufferSize(32);
                    this.port.setOutputBufferSize(32);

                    this.mySerialPort = (SerialPort) this.port; // Instancio el puerto serial
                        // Seteo los parametros para utilizar dicho puerto
                        // 1) 19200: Velocidad de envio de bits
                        // 2) DATABITS: Número de bits de la trama
                        // 3) STOPBITS: Número de bits de parada
                        // 4) PARITY: Paridad en la trama, en este caso es NONE porque no hay

                    this.mySerialPort.setSerialPortParams(2400, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
                    this.in = this.mySerialPort.getInputStream();
                    this.out = new PrintStream (this.mySerialPort.getOutputStream());
                } catch (PortInUseException ex2) {
                    try {
                        this.port_identifier = (CommPortIdentifier) this.commports.nextElement();
                        this.port_identifier = (CommPortIdentifier) this.commports.nextElement();
                        this.port = this.port_identifier.open("Serial Port", 2000);

                        this.port.setInputBufferSize(32);
                        this.port.setOutputBufferSize(32);

                        this.mySerialPort = (SerialPort) this.port; // Instancio el puerto serial
                            // Seteo los parametros para utilizar dicho puerto
                            // 1) 19200: Velocidad de envio de bits
                            // 2) DATABITS: Número de bits de la trama
                            // 3) STOPBITS: Número de bits de parada
                            // 4) PARITY: Paridad en la trama, en este caso es NONE porque no hay

                        this.mySerialPort.setSerialPortParams(2400, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
                        this.in = this.mySerialPort.getInputStream();
                        this.out = new PrintStream (this.mySerialPort.getOutputStream());
                    } catch (PortInUseException ex3) {
                        Logger.getLogger(ConfigPort.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        }
    }
    
    /********************************************
    * Metodo para enviar los datos serializados *
    * @param data                               *
    *********************************************/
    
    public void sendData(String data){
        this.out.println(data);
    }
    
    public void setLive(boolean value){
        this.live = value;
    }
    
    public boolean getLive(){
        return this.live;
    }
    
    public void processTrama(String data){
        
        // Si la trama es "Iniciar Partida"
        if(data.substring(12,16).equals("0000")){
            
            if(data.substring(22, 24).equals("00")){
                this.setPlayerId("01");
                Board.history_plays.append("Soy la Estación 2 \n");
                Variables.info_to_send = Variables.stop_bit + 
                Variables.game_stations.get(0).getSerial() +
                Variables.game_stations.get(0).getSerial() +
                Variables.game_instructions.get(0).getSerial() + 
                "100000" + Variables.game_stations.get(1).getSerial() +
                Variables.stop_bit;
                
                this.sendData(Variables.info_to_send);
                Variables.info_to_send = "";
                Variables.info_received = "";
                
                Board.endTurnButton.setEnabled(false);
                Board.throwDicesButtton.setEnabled(false);
                Board.moveRecordButton.setEnabled(false);
                Board.buyCardButton.setEnabled(false);
                Board.jButton3.setEnabled(false);
            }
            else if (data.substring(22, 24).equals("01")){
                this.setPlayerId("10");
                Board.history_plays.append("Soy la Estación 3 \n");
                Variables.info_to_send = Variables.stop_bit + 
                    Variables.game_stations.get(0).getSerial() +
                    Variables.game_stations.get(0).getSerial() +
                    Variables.game_instructions.get(0).getSerial() + 
                    "100000" + Variables.game_stations.get(2).getSerial() +
                    Variables.stop_bit;
                    
                    this.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    Variables.info_received = "";
                    
                    Board.endTurnButton.setEnabled(false);
                    Board.throwDicesButtton.setEnabled(false);
                    Board.moveRecordButton.setEnabled(false);
                    Board.buyCardButton.setEnabled(false);
                    Board.jButton3.setEnabled(false);
            }
            else if (data.substring(22, 24).equals("10")){
                this.setPlayerId("11");
                Board.history_plays.append("Soy la Estación 4 \n");
                Variables.info_to_send = Variables.stop_bit + 
                    Variables.game_stations.get(0).getSerial() +
                    Variables.game_stations.get(0).getSerial() +
                    Variables.game_instructions.get(0).getSerial() + 
                    "100000" + Variables.game_stations.get(3).getSerial() +
                    Variables.stop_bit;
                    
                    this.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    Variables.info_received = "";
                    
                    Board.endTurnButton.setEnabled(false);
                    Board.throwDicesButtton.setEnabled(false);
                    Board.moveRecordButton.setEnabled(false);
                    Board.buyCardButton.setEnabled(false);
                    Board.jButton3.setEnabled(false);
            }
            else {
                Board.history_plays.append("Se completo el anillo \n");
                
                Variables.info_to_send = "";
                Variables.info_received = "";
                
                Board.endTurnButton.setEnabled(true);
                Board.throwDicesButtton.setEnabled(true);
                Board.moveRecordButton.setEnabled(true);
                Board.buyCardButton.setEnabled(true);
            }
        }
        else if(data.substring(12,16).equals("0001")){ // "Trama de lanzar dados" 01111110000000001000001101111110
            if( !this.getPlayerId().equals(data.substring(8,10)) ){
                String name = Variables.findStationBySerial(data.substring(8,10));
                int suma = 0;
                String dice = Variables.findDiceBySerial("10" + data.substring(18,21) + data.substring(21,24));
                suma = Integer.parseInt(dice.substring(0, 1)) + Integer.parseInt(dice.substring(1, 2));
                
                Variables.info_to_send = Variables.stop_bit + 
                data.substring(8,10) +
                data.substring(8,10) +
                Variables.game_instructions.get(1).getSerial() + 
                data.substring(16,24) +
                Variables.stop_bit;
                
                this.sendData(Variables.info_to_send);
                Variables.info_to_send = "";
                Variables.info_received = "";
                Board.history_plays.setText("");
                Board.history_plays.append("La " + name + " sacó " + suma + " en los dados \n");
            }
            else {
                Board.history_plays.setText("");
                Board.history_plays.append("Se completo el anillo para la trama de dados \n");
                Variables.info_to_send = "";
                Variables.info_received = "";
            }  
        }
        else if(data.substring(12,16).equals("0111")){ // "Trama de finalizar turno" 
            // Es la estacion origen que le toca jugar
            if(this.getPlayerId().equals(data.substring(10, 12))){ 
                Board.endTurnButton.setEnabled(true);
                Board.throwDicesButtton.setEnabled(true);
                Board.moveRecordButton.setEnabled(true);
                Board.buyCardButton.setEnabled(true);
                
                Variables.info_to_send = Variables.stop_bit + 
                    data.substring(8, 10) +
                    this.getPlayerId() +
                    Variables.game_instructions.get(7).getSerial() + 
                    "100000" + this.getPlayerId() +
                    Variables.stop_bit;
                
                this.sendData(Variables.info_to_send);
                Variables.info_to_send = "";
                Variables.info_received = "";
                
                Board.history_plays.setText("");
                Board.history_plays.append("Es mi turno \n");
            }
            else if(this.getPlayerId().equals(data.substring(8,10))){
                Board.endTurnButton.setEnabled(false);
                Board.throwDicesButtton.setEnabled(false);
                Board.moveRecordButton.setEnabled(false);
                Board.buyCardButton.setEnabled(false);
                
                Variables.info_to_send = "";
                Variables.info_received = "";
                
                Board.history_plays.setText("");
                Board.history_plays.append("Se completo el anillo para la trama de finalizar turno \n");
            }
            else {
                Board.endTurnButton.setEnabled(false);
                Board.throwDicesButtton.setEnabled(false);
                Board.moveRecordButton.setEnabled(false);
                Board.buyCardButton.setEnabled(false);
                
                Variables.info_to_send = Variables.stop_bit + 
                    data.substring(8, 10) +
                    this.getPlayerId() +
                    Variables.game_instructions.get(7).getSerial() + 
                    "100000" + this.getPlayerId() +
                    Variables.stop_bit;
                
                this.sendData(Variables.info_to_send);
                Variables.info_to_send = "";
                Variables.info_received = "";
                
                Board.history_plays.setText("");
                Board.history_plays.append("No es mi turno \n");
            }
        }
        else if(data.substring(12,16).equals("0100")){ // Trama de "Propiedadades"
            // 01111110    00     00   0000   10000011  01111110
            // Bit Inicio  8-10 10-12  12-16   16-24    Bit Parada
            if(data.substring(16, 19).equals("100")){
                if(data.substring(8, 10).equals(this.getPlayerId()) ){
                    Board.history_plays.setText("");
                    Board.history_plays.append("Se completo el anillo para la trama de comprar propiedad \n");
                    
                    Variables.info_to_send = "";
                    Variables.info_received = "";
                }
                else{
                    Property property = new Property();
                   
                    for (int i = 0; i < Variables.game_cards.size(); i++) {
                        if(data.substring(19, 24).equals(Variables.game_cards.get(i).getSerial()) ){
                            property.setOwner(data.substring(8, 10));
                            property.setMortgage(Variables.game_cards.get(i).getMortgage());
                            property.setPropertyName(Variables.game_cards.get(i).getDescription());
                            property.setPriceRent(Variables.game_cards.get(i).getPriceRent());
                            property.setSerial(data.substring(19, 24));

                            Variables.addProperty(property);
                            
                            Variables.info_to_send = Variables.stop_bit + 
                            data.substring(8, 10) +
                            data.substring(8, 10) +
                            Variables.game_instructions.get(4).getSerial() + 
                            "100" + 
                            data.substring(19, 24) +
                            Variables.stop_bit;

                            for (int j = 0; j < Variables.game_stations.size(); j++) {
                                if(data.substring(8, 10).equals(Variables.game_stations.get(j).getSerial())){
                                    Board.history_plays.setText("");
                                    Board.history_plays.append("La " + Variables.game_stations.get(j).getName() + " compró " + Variables.game_cards.get(i).getDescription());
                                    break;
                                }
                            }

                            this.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";
                            Variables.info_received = "";
                            break;
                        }
                    }
                }
            }
            else if (data.substring(16, 19).equals("010")){ // Trama para "Pagar Alquiler"
                if(data.substring(8, 10).equals(this.getPlayerId()) ){
                    
                    Board.history_plays.setText("");
                    Board.history_plays.append("Se completo el anillo para la trama de pagar propiedad \n");
                    
                    Variables.info_to_send = "";
                    Variables.info_received = "";
                    
                }
                else if( data.substring(10,12).equals(this.getPlayerId()) ){
                    
                    for (int i = 0; i < Variables.game_cards.size(); i++) {
                        if( data.substring(19,24).equals(Variables.game_cards.get(i).getSerial()) ){

                            Variables.info_to_send = Variables.stop_bit +
                                data.substring(8, 10) + 
                                data.substring(10, 12) +
                                "0100" + 
                                "010" +
                                Variables.game_cards.get(i).getSerial() +
                                Variables.stop_bit;
                            
                            this.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";
                            Variables.info_received = "";
                            
                            Board.history_plays.setText("");
                            Board.history_plays.append("Cobraste " + Variables.game_cards.get(i).getPriceRent() + "$ de alquiler");
                            this.plusMoney(Variables.game_cards.get(i).getPriceRent());
                            Board.money_label.setText(String.valueOf(this.getMoney() + " $"));

                            break;
                        }
                    }
                }
                else {
                    for (int i = 0; i < Variables.game_cards.size(); i++) {
                        if( data.substring(19,24).equals(Variables.game_cards.get(i).getSerial()) ){
                            for (int j = 0; j < Variables.game_stations.size(); j++) {
                                if(data.substring(8, 10).equals(Variables.game_stations.get(j).getSerial())){
                                    
                                    Variables.info_to_send = Variables.stop_bit +
                                        data.substring(8, 10) + 
                                        data.substring(10, 12) +
                                        "0100" + 
                                        "010" +
                                        Variables.game_cards.get(i).getSerial() +
                                        Variables.stop_bit;
                                    
                                        this.sendData(Variables.info_to_send);
                                        Variables.info_to_send = "";
                                        Variables.info_received = "";
                                        
                                        Board.history_plays.setText("");
                                        Board.history_plays.append("La " + Variables.game_stations.get(j).getName() + " pagó " + Variables.game_cards.get(i).getPriceRent() + "$ de alquiler");
                                        
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }
            }
            else if(data.substring(16, 19).equals("111")){ // Trama para "Pagar Impuesto"
                if(this.getPlayerId().equals(data.substring(8, 10))){
                    
                    Board.history_plays.setText("");
                    Board.history_plays.append("Se completo el anillo para la trama de pagar impuesto \n");
                    
                    Variables.info_to_send = "";
                    Variables.info_received = "";
                }
                else {
                    for (int j = 0; j < Variables.game_stations.size(); j++) {
                        if(data.substring(8, 10).equals(Variables.game_stations.get(j).getSerial())){

                            Board.history_plays.setText("");
                            Board.history_plays.append("La " + Variables.game_stations.get(j).getName() + " pagó impuesto");

                            Variables.info_to_send = Variables.stop_bit +
                                data.substring(8, 10) + 
                                data.substring(8, 10) +
                                "0100" + 
                                "111" +
                                data.substring(19, 24) +
                                Variables.stop_bit;
                            this.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";
                            Variables.info_received = "";
                            
                            break;
                        }
                    }
                }
            }
            else if (data.substring(16, 19).equals("000")){ // Trama de "Owner Propiedad"
                if(this.getPlayerId().equals(data.substring(8, 10))){
                    
                    Board.history_plays.setText("");
                    Board.history_plays.append("Se completo el anillo para la trama de dueño de propiedad \n");
                    
                    Variables.info_to_send = "";
                    Variables.info_received = "";
                }
                else {
                    for (int j = 0; j < Variables.game_stations.size(); j++) {
                        if(data.substring(8, 10).equals(Variables.game_stations.get(j).getSerial())){

                            Board.history_plays.setText("");
                            Board.history_plays.append("La " + Variables.game_stations.get(j).getName() + " es dueña de la propiedad");
                            
                            Variables.info_to_send = data.substring(8, 10) + 
                                data.substring(8, 10) +
                                "0100" + 
                                "000" +
                                data.substring(19, 24) +
                                Variables.stop_bit;
                            
                            this.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";
                            Variables.info_received = "";
                            break;
                        }
                    }
                } 
            }       
        }
        else if(data.substring(12, 16).equals("0101")){ // Trama para "Casillas especiales"
            if(data.substring(8,10).equals(this.getPlayerId())){
                Board.history_plays.setText("");
                Board.history_plays.append("Se completo el anillo para las casillas especiales \n");
                
                Variables.info_received = "";
                Variables.info_to_send = "";
            }
            else {
                for (int i = 0; i < Variables.game_stations.size(); i++) {
                    if(data.substring(8, 10).equals(Variables.game_stations.get(i).getSerial())){
                        Board.history_plays.setText("");
                        Board.history_plays.append("La " + Variables.game_stations.get(i).getName() + " cayó en una casilla especial \n");
                    
                        Variables.info_to_send = Variables.stop_bit +
                            data.substring(8, 10) +
                            data.substring(8, 10) +
                            "0101" +
                            "00000000" +
                            Variables.stop_bit;
                        
                        this.sendData(Variables.info_to_send);
                        Variables.info_to_send = "";
                        Variables.info_received = "";
                    }
                }
            }
        }
    } 
    @Override
    public void run() {
        try {
            byte[] buffer = new byte[32];
            int len = -1;
            String message = "";
         
            Thread.sleep(2000);
            while( (len = this.in.read(buffer)) > -1 && this.live){
                message = new String(buffer, 0, len);
                Variables.info_received += message;
                
                if(Variables.info_received.length() == 34){
                    this.processTrama(Variables.info_received);
                }
            }
        }
        catch(InterruptedException e){
            
        } catch (IOException ex) {
            Logger.getLogger(ConfigPort.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
