/*********************************************************
* Frame en donde se muestra el tablero de juego y lógica *  
* @author :: Javier Stifano <jstifano18@gmail.com>       *
**********************************************************/

// jButton1: Botón para lanzar los dados.
// jButton2: Botón para realizar la animación de mover la ficha

package MonopolyRedes.views;

import MonopolyRedes.Variables;
import MonopolyRedes.utils.ActionDice;
import javax.swing.ImageIcon;
import MonopolyRedes.ConfigPort;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;
import MonopolyRedes.cards.Player;
import MonopolyRedes.cards.Property;
public class Board extends javax.swing.JFrame {
    
    Property property = new Property();
    Player player1 = new Player();
    ConfigPort port = new ConfigPort(); // Instancia para establecer la comunicación
    int repeat_dices = 0;
    
    public Board() throws UnsupportedCommOperationException, PortInUseException, IOException {
        initComponents();
        history_plays.setEditable(false); // Campo de text area sin editar
        port.identifyPorts();
        money_label.setText(String.valueOf(player1.getMoney() + " $"));
        
        // *** METODO UTIL PARA ESCUCHAR DONDE ESTA COLOCADO EL CLICK ***//
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
        throwDicesButtton = new javax.swing.JButton();
        moveRecordButton = new javax.swing.JButton();
        jDice1 = new javax.swing.JLabel();
        jDice2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        chooseStationButton = new javax.swing.JButton();
        endTurnButton = new javax.swing.JButton();
        releaseGameButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        history_plays = new javax.swing.JTextArea();
        label_money_description = new javax.swing.JLabel();
        money_label = new javax.swing.JLabel();
        buyCardButton = new javax.swing.JButton();
        payRentButton = new javax.swing.JButton();
        sellCardButton = new javax.swing.JButton();
        auctionButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego de Monopolio");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        record.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/record_1.png"))); // NOI18N
        getContentPane().add(record, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 735, 80, 60));

        monopoly_board.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/Monopoly_board.jpg"))); // NOI18N
        getContentPane().add(monopoly_board, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 810));

        monopolyPanel.setBackground(new java.awt.Color(0, 204, 0));
        monopolyPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        throwDicesButtton.setBackground(new java.awt.Color(0, 0, 0));
        throwDicesButtton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        throwDicesButtton.setForeground(new java.awt.Color(255, 255, 255));
        throwDicesButtton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/dados_button.jpg"))); // NOI18N
        throwDicesButtton.setText("Lanzar Dados");
        throwDicesButtton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        throwDicesButtton.setFocusPainted(false);
        throwDicesButtton.setFocusable(false);
        throwDicesButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                throwDicesButttonActionPerformed(evt);
            }
        });

        moveRecordButton.setBackground(new java.awt.Color(0, 0, 0));
        moveRecordButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        moveRecordButton.setForeground(new java.awt.Color(255, 255, 255));
        moveRecordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/arrow.jpg"))); // NOI18N
        moveRecordButton.setText("Mover Ficha");
        moveRecordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moveRecordButton.setFocusPainted(false);
        moveRecordButton.setFocusable(false);
        moveRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveRecordButtonActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/start_image.jpg"))); // NOI18N
        jButton3.setText("Iniciar Partida");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        chooseStationButton.setBackground(new java.awt.Color(0, 0, 0));
        chooseStationButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        chooseStationButton.setForeground(new java.awt.Color(255, 255, 255));
        chooseStationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/player_2_image.jpg"))); // NOI18N
        chooseStationButton.setText("Ser el Jugador N° 2");
        chooseStationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseStationButton.setFocusable(false);
        chooseStationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseStationButtonActionPerformed(evt);
            }
        });

        endTurnButton.setBackground(new java.awt.Color(0, 0, 0));
        endTurnButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        endTurnButton.setForeground(new java.awt.Color(255, 255, 255));
        endTurnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/end_turn_image.jpg"))); // NOI18N
        endTurnButton.setText("Finalizar Turno");
        endTurnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        releaseGameButton.setBackground(new java.awt.Color(0, 0, 0));
        releaseGameButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        releaseGameButton.setForeground(new java.awt.Color(255, 255, 255));
        releaseGameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/game-over.jpg"))); // NOI18N
        releaseGameButton.setText("Retirarse del Juego");
        releaseGameButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout monopolyPanelLayout = new javax.swing.GroupLayout(monopolyPanel);
        monopolyPanel.setLayout(monopolyPanelLayout);
        monopolyPanelLayout.setHorizontalGroup(
            monopolyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monopolyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(monopolyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moveRecordButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(throwDicesButtton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(monopolyPanelLayout.createSequentialGroup()
                        .addGroup(monopolyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(releaseGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(monopolyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDice1)
                                .addComponent(jDice2)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chooseStationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                            .addComponent(endTurnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        monopolyPanelLayout.setVerticalGroup(
            monopolyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monopolyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(throwDicesButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(moveRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDice1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDice2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseStationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endTurnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(releaseGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(monopolyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 320, 810));

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Historial de Jugadas");
        jLabel1.setFocusable(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(53, 18, 181, 22);

        history_plays.setColumns(20);
        history_plays.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        history_plays.setRows(5);
        history_plays.setBorder(null);
        history_plays.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(history_plays);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 260, 190);

        label_money_description.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        label_money_description.setForeground(new java.awt.Color(51, 51, 255));
        label_money_description.setText("Dinero:");
        jPanel1.add(label_money_description);
        label_money_description.setBounds(20, 720, 170, 44);

        money_label.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jPanel1.add(money_label);
        money_label.setBounds(180, 730, 90, 30);

        buyCardButton.setBackground(new java.awt.Color(0, 0, 0));
        buyCardButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        buyCardButton.setForeground(new java.awt.Color(255, 255, 255));
        buyCardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/buy_card.jpg"))); // NOI18N
        buyCardButton.setText("Comprar Propiedad");
        buyCardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyCardButton.setFocusable(false);
        buyCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyCardButtonActionPerformed(evt);
            }
        });
        jPanel1.add(buyCardButton);
        buyCardButton.setBounds(20, 280, 270, 70);

        payRentButton.setBackground(new java.awt.Color(0, 0, 0));
        payRentButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        payRentButton.setForeground(new java.awt.Color(255, 255, 255));
        payRentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/pay_rent.jpg"))); // NOI18N
        payRentButton.setText("Pagar Alquiler");
        payRentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payRentButton.setFocusable(false);
        jPanel1.add(payRentButton);
        payRentButton.setBounds(20, 360, 270, 70);

        sellCardButton.setBackground(new java.awt.Color(0, 0, 0));
        sellCardButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        sellCardButton.setForeground(new java.awt.Color(255, 255, 255));
        sellCardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/sell_house_image.jpg"))); // NOI18N
        sellCardButton.setText("Vender Propiedad");
        sellCardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sellCardButton.setFocusable(false);
        jPanel1.add(sellCardButton);
        sellCardButton.setBounds(20, 440, 270, 70);

        auctionButton.setBackground(new java.awt.Color(0, 0, 0));
        auctionButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        auctionButton.setForeground(new java.awt.Color(255, 255, 255));
        auctionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/pay_tax.jpg"))); // NOI18N
        auctionButton.setText("Subastar Propiedad");
        auctionButton.setToolTipText("");
        auctionButton.setActionCommand("Subastar Propiedad");
        auctionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        auctionButton.setFocusable(false);
        jPanel1.add(auctionButton);
        auctionButton.setBounds(20, 520, 270, 69);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/mortgage_image.jpg"))); // NOI18N
        jButton1.setText("Hipotecar Propiedad");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 600, 270, 70);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /********************************************************
    * Metodo que se invoca al darle click a "Lanzar Dados"  *
    *********************************************************/
    private void throwDicesButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_throwDicesButttonActionPerformed
        record.setBounds(Variables.coordinates.get(Variables.current_position).getCoordinateX(),Variables.coordinates.get(Variables.current_position).getCoordinateY(),80,60);
        String dice_1 = "";
        String dice_2 = "";
        Variables.current_dices = ActionDice.throwDices(2, 6); // Valor de dado 1 y dado 2 en arreglo
        
        dice_1 = Variables.current_dices.get(0).toString(); // Guardo el valor del dado 1
        dice_2 = Variables.current_dices.get(1).toString(); // Guardo el valor del dado 2
        setDiceIcon(); // Muestra los dados en pantalla
        
        for (int i = 0; i < Variables.game_dices.size(); i++) {
            // Si el numero de dados es igual a la combinacion del arreglo
            if(Variables.game_dices.get(i).getDiceNumber().equals(dice_1+dice_2)){ 
                if( Variables.who_start == 0){
                    Variables.info_to_send = Variables.stop_bit + 
                        Variables.game_stations.get(0).getSerial() +
                        Variables.game_stations.get(1).getSerial() +
                        Variables.game_instructions.get(1).getSerial() + 
                        Variables.game_dices.get(i).getSerial() + 
                        Variables.stop_bit;
                }
                else{
                    Variables.info_to_send = Variables.stop_bit + 
                        Variables.game_stations.get(1).getSerial() +
                        Variables.game_stations.get(0).getSerial() +
                        Variables.game_instructions.get(1).getSerial() + 
                        Variables.game_dices.get(i).getSerial() + 
                        Variables.stop_bit;
                }
                 
                if(("11".equals(dice_1 + dice_2)) || ("22".equals(dice_1 + dice_2)) || ("33".equals(dice_1 + dice_2)) || ("44".equals(dice_1 + dice_2)) || ("55".equals(dice_1 + dice_2)) || ("66".equals(dice_1 + dice_2))){
                    repeat_dices += 1;
                    history_plays.append("Team Javier saca dobles " + dice_1+dice_2 + " en los dados \n");
                    // Si ha sacado 3 veces dobles en los dados, va a la carcel
                    if(repeat_dices == 3){
                        if(Variables.who_start == 0){
                            Variables.info_to_send = Variables.stop_bit + 
                                Variables.game_stations.get(0).getSerial() +
                                Variables.game_stations.get(1).getSerial() +
                                Variables.game_instructions.get(1).getSerial() + 
                                "000" + // Bits sin usar del 8 al 6
                                Variables.game_casualities.get(9).getSerial() +
                                Variables.stop_bit;
                        }
                        else {
                            Variables.info_to_send = Variables.stop_bit + 
                            Variables.game_stations.get(1).getSerial() +
                            Variables.game_stations.get(0).getSerial() +
                            Variables.game_instructions.get(1).getSerial() + 
                            "000" + // Bits sin usar del 8 al 6
                            Variables.game_casualities.get(9).getSerial() +
                            Variables.stop_bit;
                        }
                            
                        repeat_dices = 0; // Reseteo contador de dados dobles
                        Variables.current_position = 30; // Posición de la carcel
                        history_plays.append("Team Javier saca dobles 3 veces seguidas, VA A LA CARCEL!! \n");
                    }     
                }
                else{
                    int suma = Integer.parseInt(dice_1)+Integer.parseInt(dice_2);
                    history_plays.append("Team Javier saca " + suma + " en los dados \n");
                    repeat_dices = 0; // Reseteo el contador a 0
                }
                if(Variables.current_position != 30){
                    // Si es 40, renicio la posicion para comenzar a contar 1 desde GO
                    if( Integer.parseInt(dice_1) + Integer.parseInt(dice_2) == 40) {
                        Variables.current_position = 0;
                        Variables.current_position = Integer.parseInt(dice_1) + Integer.parseInt(dice_2);
                    }
                    else if( (Integer.parseInt(dice_1) + Integer.parseInt(dice_2)) + Variables.current_position >= 40 ){
                        Variables.current_position = ((Integer.parseInt(dice_1) + Integer.parseInt(dice_2)) + Variables.current_position) - 40;
                        player1.plusMoney(200); // Paso por GO se le da 200$
                        money_label.setText(String.valueOf(player1.getMoney() + " $"));
                        history_plays.append("Pasate por GO, cobras 200$");
                    }
                    else{
                        Variables.current_position += Integer.parseInt(dice_1) + Integer.parseInt(dice_2);
                    }
                    break;
                }
                else { // El jugador está en la carcel
                    Variables.current_position = 9;
                    history_plays.setText("Que mala suerte! Haz caido en la cárcel");
                }
               break; 
            }
        }
        port.sendData(Variables.info_to_send);
        Variables.info_to_send = "";
        this.execLogicGame();
    }//GEN-LAST:event_throwDicesButttonActionPerformed

    private void moveRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveRecordButtonActionPerformed

        history_plays.setText(""); // Limpio el hitorial de jugadas
        record.setBounds(Variables.coordinates.get(Variables.current_position).getCoordinateX(),Variables.coordinates.get(Variables.current_position).getCoordinateY(),80,60);
        port.sendData(Variables.info_to_send);
        Variables.info_to_send = ""; // Reseteo la variable de la trama completa de lanzamiento de dados
    }//GEN-LAST:event_moveRecordButtonActionPerformed
    
    private void execLogicGame(){
        System.out.println("Position ::: " + Variables.current_position );
        // ******* CAYO EN UNA TARJETA DE ARCA COMUNAL ******* //
        if(Variables.current_position == 2 || Variables.current_position == 17 || Variables.current_position == 33){
            int value = ActionDice.randomDices(16)-1; // Un numero random para agarrar la tarjeta de Arca
            
            if(Variables.who_start == 0){
                Variables.info_to_send = Variables.stop_bit + 
                    Variables.game_stations.get(0).getSerial() +
                    Variables.game_stations.get(1).getSerial() +
                    Variables.game_instructions.get(5).getSerial() +
                    "000" + // Bits del 8 al 6 sin tomar en cuenta
                    Variables.game_comunal_arks.get(value).getSerial() + 
                    Variables.stop_bit;
            }
            else {
                Variables.info_to_send = Variables.stop_bit + 
                    Variables.game_stations.get(1).getSerial() +
                    Variables.game_stations.get(0).getSerial() +
                    Variables.game_instructions.get(5).getSerial() +
                    "000" + // Bits del 8 al 6 sin tomar en cuenta
                    Variables.game_comunal_arks.get(value).getSerial() + 
                    Variables.stop_bit;
            }
            
            history_plays.append("Caiste en Arca Comunal! Se toma tarjeta ... \n");
            
            switch(value){
                case 0: // Pagar 50 a cada jugador
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    player1.downMoney(50);
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    history_plays.append("Tuviste que pagar 50$ al Team Azevedo \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 1: // Ir a la carcel
                    // Si tengo salir de la carcel gratis, la uso
                    if(Variables.get_free_jail == true){
                        if(Variables.who_start == 0){
                            Variables.info_to_send = "";
                            Variables.info_to_send = Variables.stop_bit + 
                                Variables.game_stations.get(0).getSerial() +
                                Variables.game_stations.get(1).getSerial() +
                                Variables.game_instructions.get(5).getSerial() +
                                "000" + // Bits del 8 al 6 sin tomar en cuenta
                                Variables.game_comunal_arks.get(2).getSerial() + 
                                Variables.stop_bit;
                                
                                port.sendData(Variables.info_to_send);
                                Variables.info_to_send = "";
                                Variables.get_free_jail = false;
                                history_plays.append("Tomaste la tarjeta de ir a la cárcel pero tienes una salida gratis \n");        
                        }
                        else {
                            Variables.info_to_send = "";
                            Variables.info_to_send = Variables.stop_bit + 
                                Variables.game_stations.get(1).getSerial() +
                                Variables.game_stations.get(0).getSerial() +
                                Variables.game_instructions.get(5).getSerial() +
                                "000" + // Bits del 8 al 6 sin tomar en cuenta
                                Variables.game_comunal_arks.get(2).getSerial() + 
                                Variables.stop_bit;
                                
                                port.sendData(Variables.info_to_send);
                                Variables.info_to_send = "";
                                Variables.get_free_jail = false;
                                history_plays.append("Tomaste la tarjeta de ir a la cárcel pero tienes una salida gratis \n");
                        }
                    }
                    else{
                        port.sendData(Variables.info_to_send);
                        Variables.info_to_send = "";
                        history_plays.append("Que mal!! Te haz ido a la cárcel\n");
                        Variables.current_position = 30;
                    }
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 2: // Salir de la carcel gratis
                    Variables.get_free_jail = true;
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta para salir de la cárcel gratis\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 3: // Avanzo a GO y cobro 200$
                    Variables.current_position = 0;
                    player1.plusMoney(200); // Sumo 200$ al valor total
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de avanzar a GO y cobrar 200$\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 4: // El jugador cobra 50$ del banco
                    player1.plusMoney(50); // Sumo 200$ al valor total
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de cobrar 50$ del banco\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 5: // El jugador cobra 150$ del banco
                    player1.plusMoney(150); // Sumo 200$ al valor total
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de cobrar 150$ del banco\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 6: // El jugador paga 15$ al banco
                    player1.downMoney(15); // Sumo 200$ al valor total
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de pagar 15$ al banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 7: // El jugador retrocede 3 casillas
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    if( (Variables.current_position - 3) < 0 ){
                        Variables.current_position = (40 + Variables.current_position) - 3;
                        history_plays.append("Tomaste la tarjeta de retroceder 3 casillas\n");
                        history_plays.append("Click en 'Mover Ficha' para ver su posición");
                    }
                    else {
                        Variables.current_position -= 3;
                        history_plays.append("Tomaste la tarjeta de retroceder 3 casillas\n");
                        history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    }
                    break;
                case 8: // Avanza hasta la propiedad Paseo Tablado
                    Variables.current_position = 39;
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta de moverte a Paseo Tablado\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 9: // Avanza hasta la propiedad Av. Illinois 
                    // Paso por GO y le sumo 200 a su dinero
                    if(Variables.current_position > 24){
                        player1.plusMoney(200);
                        money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    }
                        
                    Variables.current_position = 24;
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta de moverte a Av. Illinois\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 10: // Avanza hasta la propiedad Plaza San Carlos
                    // Paso por GO y le sumo 200 a su dinero
                    if(Variables.current_position > 16){
                        player1.plusMoney(200);
                        money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    }
                    
                    Variables.current_position = 16;
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta de moverte a la Plaza San Carlos\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 11: // Avanza hasta el Ferrocarril Reading
                    // Paso por GO y le sumo 200 a su dinero
                    if(Variables.current_position > 5){
                        player1.plusMoney(200);
                        money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    }
                    
                    Variables.current_position = 5;
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta de moverte al Ferrocarril Reading\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                    // ******* FALTA EL ARCA COMUNAL 12 DE AVANZAR AL FERRO MAS CERCANO Y PAGAR 2 VECES EL ALQUILER
                    // ******* FALTA EL ARCA COMUNAL 13 DE AVANZAR AL SERVIO MAS CERCANO 10$ * LANCE DE DADOS
                    // ******* FALTA EL ARCA COMUNAL 14 DE PAGAR 25$ POR CADA CASA Y 100$ POR CADA HOTEL
                case 15: // Paga 100$ al banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    player1.downMoney(100);
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de pagar 100$ al banco\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                default:
                    break;
            }
        } // ******* CAYO EN UNA TARJETA DE CASUALIDAD ******* //
        else if (Variables.current_position == 7 || Variables.current_position == 22 || Variables.current_position == 36 ){
            int value = ActionDice.randomDices(16)-1;
            
            if(Variables.who_start == 0){
                Variables.info_to_send = Variables.stop_bit + 
                    Variables.game_stations.get(0).getSerial() +
                    Variables.game_stations.get(1).getSerial() +
                    Variables.game_instructions.get(5).getSerial() +
                    "000" + // Bits del 8 al 6 sin tomar en cuenta
                    Variables.game_casualities.get(value).getSerial() + 
                    Variables.stop_bit;
            }
            else {
                Variables.info_to_send = Variables.stop_bit + 
                    Variables.game_stations.get(1).getSerial() +
                    Variables.game_stations.get(0).getSerial() +
                    Variables.game_instructions.get(5).getSerial() +
                    "000" + // Bits del 8 al 6 sin tomar en cuenta
                    Variables.game_casualities.get(value).getSerial() + 
                    Variables.stop_bit;
            }
            
            history_plays.append("Caiste en Casualidad! Se toma tarjeta ... \n");
            
            switch(value){
                case 0: // Recibir 10$ del banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    player1.plusMoney(10);
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 10$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 1: // Recibir 20$ del banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    player1.plusMoney(20);
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 20$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;    
                case 2: // Recibir 25$ del banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    player1.plusMoney(25);
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 25$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break; 
                case 3: // Recibir 45$ del banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    player1.plusMoney(45);
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 45$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break; 
                case 4: // Recibir 100$ del banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    player1.plusMoney(100);
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 100$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break; 
                case 5: // Recibir 100$ del banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    player1.plusMoney(100);
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 100$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 6: // Recibir 100$ del banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    player1.plusMoney(100);
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 100$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break; 
                case 7: /// El jugador recibe 200$ al banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    player1.plusMoney(200);
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 100$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 8: // Avanza a GO y cobra 200$
                    Variables.current_position = 0;
                    player1.plusMoney(200); // Sumo 200$ al valor total
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de avanzar a GO y cobrar 200$\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 9: // El jugador va a la carcel
                    // Si tengo salir de la carcel gratis, la uso
                    if(Variables.get_free_jail == true){
                        if(Variables.who_start == 0){
                            Variables.info_to_send = "";
                            Variables.info_to_send = Variables.stop_bit + 
                                Variables.game_stations.get(0).getSerial() +
                                Variables.game_stations.get(1).getSerial() +
                                Variables.game_instructions.get(5).getSerial() +
                                "000" + // Bits del 8 al 6 sin tomar en cuenta
                                Variables.game_casualities.get(10).getSerial() + 
                                Variables.stop_bit;
                                
                                port.sendData(Variables.info_to_send);
                                Variables.info_to_send = "";
                                Variables.get_free_jail = false;
                                history_plays.append("Tomaste la tarjeta de ir a la cárcel pero tienes una salida gratis \n");        
                        }
                        else {
                            Variables.info_to_send = "";
                            Variables.info_to_send = Variables.stop_bit + 
                                Variables.game_stations.get(1).getSerial() +
                                Variables.game_stations.get(0).getSerial() +
                                Variables.game_instructions.get(5).getSerial() +
                                "000" + // Bits del 8 al 6 sin tomar en cuenta
                                Variables.game_casualities.get(10).getSerial() + 
                                Variables.stop_bit;
                                
                                port.sendData(Variables.info_to_send);
                                Variables.info_to_send = "";
                                Variables.get_free_jail = false;
                                history_plays.append("Tomaste la tarjeta de ir a la cárcel pero tienes una salida gratis \n");
                        }
                    }
                    else{
                        port.sendData(Variables.info_to_send);
                        Variables.info_to_send = "";
                        history_plays.append("Que mal!! Te haz ido a la cárcel\n");
                        Variables.current_position = 10;
                    }
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 10: // Salir de la carcel gratis 
                    Variables.get_free_jail = true;
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta para salir de la cárcel gratis\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 11: // Cobra 50$ de cada jugador
                    player1.plusMoney(50);
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta de cobrar 50$ de cada jugador\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 12: // Paga 50$ al banco
                    player1.downMoney(50);
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta de pagar 50$ al banco\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 13: // Paga 100$ al banco
                    player1.downMoney(100);
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta de pagar 100$ al banco\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 14: // Paga 150$ al banco
                    player1.downMoney(150);
                    money_label.setText(String.valueOf(player1.getMoney() + " $"));
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta de pagar 150$ al banco\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                default:
                    break;
            }
        } // ****** CAYO EN LA CASILLA DE IMPUESTOS SOBRE INGRESOS
        else if ( Variables.current_position == 4){
            player1.downMoney(75);
            money_label.setText(String.valueOf(player1.getMoney() + " $"));
            port.sendData(Variables.info_to_send);
            Variables.info_to_send = "";
            history_plays.append("Caiste en la casilla de impuesto sobre ingresos, se pago 75$ al banco \n");
            history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
        }
        else if ( Variables.current_position == 38 ){ // ******* CAYO EN LA CASILLA DE IMPUESTOS POR POSESIONES DE LUJO
            player1.downMoney(200);
            money_label.setText(String.valueOf(player1.getMoney() + " $"));
            port.sendData(Variables.info_to_send);
            Variables.info_to_send = "";
            history_plays.append("Caiste en la casilla de impuesto por posesiones de lujo, se pago 200$ al banco \n");
            history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
        }
        else {
            if( Variables.who_start == 0){
                for (int i = 0; i < Variables.game_cards.size(); i++) 
                    if(Variables.game_cards.get(i).getPosition() == Variables.current_position){
                        Property local_property = new Property();
                        
                        // Chequeo si la propiedad esta comprada por nosotros
                        local_property = player1.findProperty(Variables.game_cards.get(i).getDescription());
                        
                        // La propiedad no es de nosotros, podemos comprarla
                        if(local_property.getPropertyName() == ""){
                            property.setOwner("00"); // El dueño somos nosotros y somos el player 1 "00"
                            property.setPropertyName(Variables.game_cards.get(i).getDescription());
                            history_plays.append("La propiedad " + Variables.game_cards.get(i).getDescription() + " no tiene dueño, puedes comprarla \n" );
                            history_plays.append("Dale click en 'Comprar propiedad' si deseas comprarla\n" );
                            history_plays.append("Dale click en 'Subastar Propiedad' si deseas subastarla\n" );
                        }
                        else {
                            
                        }
                    }
            }
            else {
                
            }
        }
    }
    
    /******************************************
    * Metodo para iniciar la partida nosotros *
    *******************************************/
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Construyo la trama de "Iniciar Partida"
        Variables.info_to_send = Variables.stop_bit + 
            Variables.game_stations.get(0).getSerial() +
            Variables.game_stations.get(1).getSerial() +
            Variables.game_instructions.get(0).getSerial() + 
            Variables.stop_bit;
            port.sendData(Variables.info_to_send); // Envio la trama de "Iniciar Partida"
            Variables.info_to_send = "";
            Variables.who_start = 0; // Comienzo yo la partida soy la estacion 00
            history_plays.append("Inicia la partida el team Javier \n"); // Seteo en el historial lo que sucedió
    }//GEN-LAST:event_jButton3ActionPerformed
    
    /***************************************
    * Metodo para ser nosotros el Player 2 *
    ****************************************/
    
    private void chooseStationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseStationButtonActionPerformed
        Variables.info_to_send = Variables.stop_bit + 
            Variables.game_stations.get(1).getSerial() +
            Variables.game_stations.get(0).getSerial() +
            Variables.game_instructions.get(0).getSerial() + 
            Variables.stop_bit;
            port.sendData(Variables.info_to_send);
            Variables.info_to_send = "";
            Variables.who_start = 1; // Comienza el otro equipo la partida, soy la estacion 01
            history_plays.append("Inicia la partida el team Azevedo \n");
    }//GEN-LAST:event_chooseStationButtonActionPerformed

    private void buyCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyCardButtonActionPerformed
        player1.addProperty(property); // Añado la propiedad a compradas por nosotros
        
        // Reinicio la variable de propiedad
        property.setOwner("");
        property.setPropertyName("");
        
        
    }//GEN-LAST:event_buyCardButtonActionPerformed

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
        jDice1.setIcon(icon_dice);
        jDice2.setIcon(icon_dice2); 

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton auctionButton;
    public javax.swing.JButton buyCardButton;
    public javax.swing.JButton chooseStationButton;
    private javax.swing.JButton endTurnButton;
    public javax.swing.JTextArea history_plays;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jDice1;
    private javax.swing.JLabel jDice2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel label_money_description;
    public javax.swing.JLabel money_label;
    private javax.swing.JPanel monopolyPanel;
    public javax.swing.JLabel monopoly_board;
    public javax.swing.JButton moveRecordButton;
    public javax.swing.JButton payRentButton;
    public javax.swing.JLabel record;
    private javax.swing.JButton releaseGameButton;
    public javax.swing.JButton sellCardButton;
    private javax.swing.JButton throwDicesButtton;
    // End of variables declaration//GEN-END:variables
}
