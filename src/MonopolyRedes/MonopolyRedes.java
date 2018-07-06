/***********************************************************************/
/* @author :: Javier Stifano <jstifano18@gmail.com                     */
/* description :: Clase principal para probar la libreria rx tx serial */
/***********************************************************************/


package MonopolyRedes;
//import MonopolyRedes.ConfigPort;
import MonopolyRedes.services.InitService;
import MonopolyRedes.views.Board;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;

public class MonopolyRedes {
    
    public static void main(String[] args) throws UnsupportedCommOperationException, IOException, PortInUseException {
        InitService init = new InitService(); // Instancia para iniciar servicios
        boolean init_completed = false;
        
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
        Board board = new Board();
        
        board.setLocationRelativeTo(null);
        board.setResizable(false);
        board.setVisible(true);
    }    
}
