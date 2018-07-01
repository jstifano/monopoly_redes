/***********************************************************************/
/* @author :: Javier Stifano <jstifano18@gmail.com                     */
/* description :: Clase principal para probar la libreria rx tx serial */
/***********************************************************************/


package MonopolyRedes;
//import MonopolyRedes.ConfigPort;
import MonopolyRedes.services.InitService;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;
import MonopolyRedes.views.Board;
import java.util.Timer;
import java.util.TimerTask;

public class MonopolyRedes {
    
    public static void main(String[] args) throws UnsupportedCommOperationException, IOException, PortInUseException {
            Board board = new Board(); // Tablero de juego
            InitService init = new InitService(); // Instancia para iniciar servicios
            
            // Inicialización de todos los servicios
            init.initCards();
            init.initCasualities();
            init.initComunalArks();
            init.initStations();
            init.initInstructions();
            init.initPositions();
            init.initPlayerInstructions();
            init.initDices();
            // ************************************** //
                
            // Abre el board del juego
            board.setVisible(true);
            board.setLocationRelativeTo(null); // Coloca la pantalla en el centro
                     
    }
    
}
