/*********************************************************
* Frame en donde se muestra el tablero de juego y lógica *  
* @author :: Javier Stifano <jstifano18@gmail.com>       *
**********************************************************/

// jButton1: Botón para lanzar los dados.
// jButton2: Botón para realizar la animación de mover la ficha

package MonopolyRedes.views;

import MonopolyRedes.Variables;
import static MonopolyRedes.Variables.current_dices;
import MonopolyRedes.utils.ActionDice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import javax.swing.ImageIcon;


public class Board extends javax.swing.JFrame {
    
    public Board() {
        initComponents();
        
        // *** METODO UTIL PARA ESUCHAR DONDE ESTA COLOCADO EL CLIC ***//
        
        /*MouseMotionListener mml = new MouseMotionListener() {
   
            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("El evento es" + e.getX() + '/' + e.getY() );
            }

            @Override
            public void mouseDragged(MouseEvent e) {
            }
        };*/
        // ********************************************************* //
        //monopoly_board.addMouseMotionListener(mml);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        record = new javax.swing.JLabel();
        monopoly_board = new javax.swing.JLabel();
        monopolyPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDice1 = new javax.swing.JLabel();
        jDice2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego de Monopolio");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        record.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/record_1.png"))); // NOI18N
        getContentPane().add(record, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 720, 80, 60));

        monopoly_board.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/Monopoly_board.jpg"))); // NOI18N
        getContentPane().add(monopoly_board, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        monopolyPanel.setBackground(new java.awt.Color(0, 204, 0));
        monopolyPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/dados_button.jpg"))); // NOI18N
        jButton1.setText("Lanzar Dados");
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/arrow.jpg"))); // NOI18N
        jButton2.setText("Mover Ficha");
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout monopolyPanelLayout = new javax.swing.GroupLayout(monopolyPanel);
        monopolyPanel.setLayout(monopolyPanelLayout);
        monopolyPanelLayout.setHorizontalGroup(
            monopolyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monopolyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(monopolyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addGroup(monopolyPanelLayout.createSequentialGroup()
                        .addGroup(monopolyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDice1)
                            .addComponent(jDice2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        monopolyPanelLayout.setVerticalGroup(
            monopolyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monopolyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDice1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDice2)
                .addContainerGap(611, Short.MAX_VALUE))
        );

        getContentPane().add(monopolyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /********************************************************
    * Metodo que se invoca al darle click a "Lanzar Dados"  *
    *********************************************************/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String dice_1 = "";
        String dice_2 = "";
        Variables.current_dices = ActionDice.throwDices(2, 6); // Valor de dado 1 y dado 2 en arreglo
        dice_1 = Variables.current_dices.get(0).toString(); // Guardo el valor del dado 1
        dice_2 = current_dices.get(1).toString(); // Guardo el valor del dado 2
        setDiceIcon();
        for (int i = 0; i < Variables.game_dices.size(); i++) {
            // Si el numero de dados es igual a la combinacion del arreglo
            if(Variables.game_dices.get(i).getDiceNumber().equals(dice_1+dice_2)){ 
                Variables.info_to_send = Variables.stop_bit + 
                        Variables.game_stations.get(0).getSerial() +
                        Variables.game_stations.get(1).getSerial() +
                        Variables.game_instructions.get(1).getSerial() + 
                        Variables.game_dices.get(i).getSerial() + 
                        Variables.stop_bit;
                
                // Si es 40, renicio la posicion para comenzar a contar 1 desde GO
                if( Integer.parseInt(dice_1) + Integer.parseInt(dice_2) == 40) {
                    Variables.current_position = 0;
                    Variables.current_position = Integer.parseInt(dice_1) + Integer.parseInt(dice_2);    
                }
                else{
                    Variables.current_position += Integer.parseInt(dice_1) + Integer.parseInt(dice_2);
                }
            }
        }
        
        //System.out.println("Trama de dados :::" + Variables.info_to_send);
        //record.setBounds(Variables.coordinates.get(6).getCoordinateX(),Variables.coordinates.get(6).getCoordinateY(),80,60);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        record.setBounds(Variables.coordinates.get(Variables.current_position).getCoordinateX(),Variables.coordinates.get(Variables.current_position).getCoordinateY(),80,60);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void setDiceIcon(){
        ImageIcon icon_dice = null, icon_dice2 = null;
        jDice1.setIcon(null);
        jDice2.setIcon(null); 
        int dice_1 = Variables.current_dices.get(0);
        int dice_2 = Variables.current_dices.get(1);
        switch (dice_1) {
            case 1:
                icon_dice = new ImageIcon(Variables.dices_images[0]);
                break;
            case 2:
                icon_dice = new ImageIcon(Variables.dices_images[1]);
                break;
            case 3:
                icon_dice = new ImageIcon(Variables.dices_images[2]);
                break;
            case 4:
                icon_dice = new ImageIcon(Variables.dices_images[3]);
                break;
            case 5:
                icon_dice = new ImageIcon(Variables.dices_images[4]);
                break;
            case 6:
                icon_dice = new ImageIcon(Variables.dices_images[5]);
                break;
            default:
                break;
        }

        switch (dice_2) {
            case 1:
                icon_dice2 = new ImageIcon(Variables.dices_images[0]);
                break;
            case 2:
                icon_dice2 = new ImageIcon(Variables.dices_images[1]);
                break;
            case 3:
                icon_dice2 = new ImageIcon(Variables.dices_images[2]);
                break;
            case 4:
                icon_dice2 = new ImageIcon(Variables.dices_images[3]);
                break;
            case 5:
                icon_dice2 = new ImageIcon(Variables.dices_images[4]);
                break;
            case 6:
                icon_dice2 = new ImageIcon(Variables.dices_images[5]);
                break;
            default:
                break;
        }
        System.out.println("dice1: " + dice_1+ ", dice_2" + dice_2);
        jDice1.setIcon(icon_dice);
        jDice2.setIcon(icon_dice2); 

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jDice1;
    private javax.swing.JLabel jDice2;
    private javax.swing.JPanel monopolyPanel;
    public javax.swing.JLabel monopoly_board;
    public javax.swing.JLabel record;
    // End of variables declaration//GEN-END:variables
}
