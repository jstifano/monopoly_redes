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
import MonopolyRedes.cards.Player;
import MonopolyRedes.cards.Property;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;
public class Board extends javax.swing.JFrame {
    
    Property property = new Property();
    ConfigPort port = new ConfigPort(); // Instancia para establecer la comunicación
    int repeat_dices = 0;
    String use_port;
    
    public Board() throws UnsupportedCommOperationException, IOException{
        initComponents();
        this.setVisible(true);
        history_plays.setEditable(false); // Campo de text area sin editar
        money_label.setText(String.valueOf(port.getMoney() + " $"));
        this.setLocationRelativeTo(null);
        port.identifyPorts();
        port.run(); // Ejecuto el hilo para recibir data
        //01111110000000001000001101111110
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
        endTurnButton = new javax.swing.JButton();
        releaseGameButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        history_plays = new javax.swing.JTextArea();
        label_money_description = new javax.swing.JLabel();
        money_label = new javax.swing.JLabel();
        buyCardButton = new javax.swing.JButton();
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
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        endTurnButton.setBackground(new java.awt.Color(0, 0, 0));
        endTurnButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        endTurnButton.setForeground(new java.awt.Color(255, 255, 255));
        endTurnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/end_turn_image.jpg"))); // NOI18N
        endTurnButton.setText("Finalizar Turno");
        endTurnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        endTurnButton.setFocusPainted(false);
        endTurnButton.setFocusable(false);
        endTurnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endTurnButtonActionPerformed(evt);
            }
        });

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
                            .addComponent(jDice1)
                            .addComponent(jDice2)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
        label_money_description.setBounds(20, 730, 170, 44);

        money_label.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jPanel1.add(money_label);
        money_label.setBounds(180, 740, 90, 30);

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

        sellCardButton.setBackground(new java.awt.Color(0, 0, 0));
        sellCardButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        sellCardButton.setForeground(new java.awt.Color(255, 255, 255));
        sellCardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/sell_house_image.jpg"))); // NOI18N
        sellCardButton.setText("Vender Propiedad");
        sellCardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sellCardButton.setFocusable(false);
        sellCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellCardButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sellCardButton);
        sellCardButton.setBounds(20, 360, 270, 70);

        auctionButton.setBackground(new java.awt.Color(0, 0, 0));
        auctionButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        auctionButton.setForeground(new java.awt.Color(255, 255, 255));
        auctionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/pay_tax.jpg"))); // NOI18N
        auctionButton.setText("Subastar Propiedad");
        auctionButton.setToolTipText("");
        auctionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        auctionButton.setFocusable(false);
        jPanel1.add(auctionButton);
        auctionButton.setBounds(20, 440, 270, 69);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/mortgage_image.jpg"))); // NOI18N
        jButton1.setText("Hipotecar Propiedad");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 520, 270, 70);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /********************************************************
    * Metodo que se invoca al darle click a "Lanzar Dados"  *
    *********************************************************/
    private void throwDicesButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_throwDicesButttonActionPerformed
        record.setBounds(Variables.coordinates.get(port.getPosition()).getCoordinateX(),Variables.coordinates.get(port.getPosition()).getCoordinateY(),80,60);
        history_plays.setText("");
        String dice_1 = "";
        String dice_2 = "";
        Variables.current_dices = ActionDice.throwDices(2, 6); // Valor de dado 1 y dado 2 en arreglo
        
        dice_1 = Variables.current_dices.get(0).toString(); // Guardo el valor del dado 1
        dice_2 = Variables.current_dices.get(1).toString(); // Guardo el valor del dado 2
        setDiceIcon(); // Muestra los dados en pantalla
        
        for (int i = 0; i < Variables.game_dices.size(); i++) {
            // Si el numero de dados es igual a la combinacion del arreglo
            if(Variables.game_dices.get(i).getDiceNumber().equals(dice_1+dice_2)){ 
                if( port.getPlayerId() == "00"){
                    Variables.info_to_send = Variables.stop_bit + 
                        Variables.game_stations.get(0).getSerial() +
                        Variables.game_stations.get(0).getSerial() +
                        Variables.game_instructions.get(1).getSerial() + 
                        Variables.game_dices.get(i).getSerial() + 
                        Variables.stop_bit;
                }
                else if (port.getPlayerId() == "01"){
                    Variables.info_to_send = Variables.stop_bit + 
                        Variables.game_stations.get(1).getSerial() +
                        Variables.game_stations.get(1).getSerial() +
                        Variables.game_instructions.get(1).getSerial() + 
                        Variables.game_dices.get(i).getSerial() + 
                        Variables.stop_bit;
                }
                else if (port.getPlayerId() == "10"){
                    Variables.info_to_send = Variables.stop_bit + 
                        Variables.game_stations.get(2).getSerial() +
                        Variables.game_stations.get(2).getSerial() +
                        Variables.game_instructions.get(1).getSerial() + 
                        Variables.game_dices.get(i).getSerial() + 
                        Variables.stop_bit;
                }
                else {
                    Variables.info_to_send = Variables.stop_bit + 
                        Variables.game_stations.get(3).getSerial() +
                        Variables.game_stations.get(3).getSerial() +
                        Variables.game_instructions.get(1).getSerial() + 
                        Variables.game_dices.get(i).getSerial() + 
                        Variables.stop_bit;
                }
                
                if(("11".equals(dice_1 + dice_2)) || ("22".equals(dice_1 + dice_2)) || ("33".equals(dice_1 + dice_2)) || ("44".equals(dice_1 + dice_2)) || ("55".equals(dice_1 + dice_2)) || ("66".equals(dice_1 + dice_2))){
                    repeat_dices += 1;
                    history_plays.append("Sacas dobles " + dice_1+dice_2 + " en los dados \n");
                    
                    // Si ha sacado 3 veces dobles en los dados, va a la carcel
                    if(repeat_dices == 3){
                        if(port.getPlayerId() == "00"){
                            Variables.info_to_send = Variables.stop_bit + 
                                Variables.game_stations.get(0).getSerial() +
                                Variables.game_stations.get(0).getSerial() +
                                Variables.game_instructions.get(1).getSerial() + 
                                "000" + // Bits sin usar del 8 al 6
                                Variables.game_casualities.get(9).getSerial() +
                                Variables.stop_bit;
                                history_plays.append(Variables.game_stations.get(0).getName() + " saca dobles " + dice_1+dice_2 + " en los dados \n");
                                history_plays.append(Variables.game_stations.get(0).getName() + " saca dobles 3 veces seguidas, VA A LA CARCEL!! \n");
                        }
                        else if (port.getPlayerId() == "01"){
                            Variables.info_to_send = Variables.stop_bit + 
                            Variables.game_stations.get(1).getSerial() +
                            Variables.game_stations.get(1).getSerial() +
                            Variables.game_instructions.get(1).getSerial() + 
                            "000" + // Bits sin usar del 8 al 6
                            Variables.game_casualities.get(9).getSerial() +
                            Variables.stop_bit;
                            history_plays.append(Variables.game_stations.get(1).getName() + " saca dobles " + dice_1+dice_2 + " en los dados \n");
                            history_plays.append(Variables.game_stations.get(1).getName() + " saca dobles 3 veces seguidas, VA A LA CARCEL!! \n");
                        }
                        else if (port.getPlayerId() == "10"){
                            Variables.info_to_send = Variables.stop_bit + 
                            Variables.game_stations.get(2).getSerial() +
                            Variables.game_stations.get(2).getSerial() +
                            Variables.game_instructions.get(1).getSerial() + 
                            "000" + // Bits sin usar del 8 al 6
                            Variables.game_casualities.get(9).getSerial() +
                            Variables.stop_bit;
                            history_plays.append(Variables.game_stations.get(2).getName() + " saca dobles " + dice_1+dice_2 + " en los dados \n");
                            history_plays.append(Variables.game_stations.get(2).getName() + " saca dobles 3 veces seguidas, VA A LA CARCEL!! \n");
                        }
                        else {
                            Variables.info_to_send = Variables.stop_bit + 
                            Variables.game_stations.get(3).getSerial() +
                            Variables.game_stations.get(3).getSerial() +
                            Variables.game_instructions.get(1).getSerial() + 
                            "000" + // Bits sin usar del 8 al 6
                            Variables.game_casualities.get(9).getSerial() +
                            Variables.stop_bit;
                            history_plays.append(Variables.game_stations.get(3).getName() + " saca dobles " + dice_1+dice_2 + " en los dados \n");
                            history_plays.append(Variables.game_stations.get(3).getName() + " saca dobles 3 veces seguidas, VA A LA CARCEL!! \n");
                        }
                        
                        repeat_dices = 0; // Reseteo contador de dados dobles
                        port.setPosition(30); // Posición de la carcel
                    }     
                }
                else{
                    int suma = Integer.parseInt(dice_1)+Integer.parseInt(dice_2);
                    for (int j = 0; j < Variables.game_stations.size(); j++) {
                        if(Variables.game_stations.get(j).getSerial() == port.getPlayerId()){
                            history_plays.append(Variables.game_stations.get(j).getName() + " saca " + suma + " en los dados \n");
                            break;
                        }
                    }
                    repeat_dices = 0; // Reseteo el contador a 0
                }
                if(port.getPosition() != 30){
                    // Si es 40, renicio la posicion para comenzar a contar 1 desde GO
                    if( Integer.parseInt(dice_1) + Integer.parseInt(dice_2) == 40) {
                        port.setPosition(0);
                        port.setPosition(Integer.parseInt(dice_1) + Integer.parseInt(dice_2));
                    }
                    else if( (Integer.parseInt(dice_1) + Integer.parseInt(dice_2)) + port.getPosition() >= 40 ){
                        port.setPosition(( (Integer.parseInt(dice_1) + Integer.parseInt(dice_2)) + port.getPosition()) - 40) ;
                        port.plusMoney(200); // Paso por GO se le da 200$
                        money_label.setText(String.valueOf(port.getMoney() + " $"));
                        history_plays.append("Pasaste por GO, cobras 200$ \n");
                    }
                    else{
                        port.plusPosition(Integer.parseInt(dice_1) + Integer.parseInt(dice_2));
                    }
                    break;
                }
                else { // El jugador está en la carcel
                    port.setPosition(10);
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
        record.setBounds(Variables.coordinates.get(port.getPosition()).getCoordinateX(),Variables.coordinates.get(port.getPosition()).getCoordinateY(),80,60);
        
        history_plays.setText(""); // Limpio el hitorial de jugadas
        if(port.getPosition() == 2 || port.getPosition() == 7 || port.getPosition() == 10 ||
          port.getPosition() == 17 || port.getPosition() == 20 || port.getPosition() == 22 || port.getPosition() == 30 ||
          port.getPosition() == 33 || port.getPosition() == 36)
        {
            Board.history_plays.setText("");
            Board.history_plays.append("Caiste en una casilla especial \n");
            buyCardButton.setEnabled(false);
            
            record.setBounds(Variables.coordinates.get(port.getPosition()).getCoordinateX(),Variables.coordinates.get(port.getPosition()).getCoordinateY(),80,60);
            Variables.info_to_send = ""; // Reseteo la variable de la trama completa de lanzamiento de dados
            
            Variables.info_to_send = Variables.stop_bit +
                    port.getPlayerId() +
                    port.getPlayerId() +
                    "0101" +
                    "00000000"+
                    Variables.stop_bit;
            
            port.sendData(Variables.info_to_send);
            Variables.info_to_send = "";
            Variables.info_received = "";
        }
        else if(port.getPosition() == 4 || port.getPosition() == 38){
            port.downMoney(75);
            money_label.setText(String.valueOf(port.getMoney() + " $"));
            Variables.info_to_send = Variables.stop_bit +
                    port.getPlayerId() +
                    port.getPlayerId() +
                    "0100" +
                    "111" +
                    "00000" + 
                    Variables.stop_bit;
                    
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    Variables.info_received = "";
            
        }
        else {
            Property property;
            
            for (int i = 0; i < Variables.game_cards.size(); i++) {
                if(port.getPosition() == Variables.game_cards.get(i).getPosition()){
                    property = Variables.findProperty(Variables.game_cards.get(i).getDescription());
                    
                    // La propiedad no tiene dueño
                    if(property == null){
                        history_plays.append("Click en 'Comprar Propiedad' para adquirirla \n");
                    }
                    else if(property.getOwner().equals(port.getPlayerId())){
                        buyCardButton.setEnabled(false);
                        Board.history_plays.setText("");
                        Board.history_plays.append("Tu eres dueño de la propiedad \n");
                        
                        Variables.info_to_send = Variables.stop_bit +
                            port.getPlayerId() +
                            port.getPlayerId() +
                            Variables.game_instructions.get(4) +
                            "000" +
                            Variables.game_cards.get(i).getSerial() + 
                            Variables.stop_bit;
                        
                            port.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";
                            Variables.info_received = "";
                            
                    }
                    else {
                        System.out.println("Property ");
                        buyCardButton.setEnabled(false);
                        history_plays.setText("");
                        history_plays.append("Tuviste que pagar " + property.getPriceRent() + "$ de renta"); 
                        
                        port.downMoney(property.getPriceRent());
                        money_label.setText(String.valueOf(port.getMoney() + " $"));
                        
                        Variables.info_to_send = Variables.stop_bit +
                            port.getPlayerId() +
                            property.getOwner() +
                            Variables.game_instructions.get(4).getSerial() +
                            "010" +
                            property.getSerial() + 
                            Variables.stop_bit;
                            System.out.println("Trama :::: " + Variables.info_to_send);
                            
                            port.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";
                            Variables.info_received = "";
                              
                    }
                }
            }
        }
    }//GEN-LAST:event_moveRecordButtonActionPerformed
    
    private void execLogicGame(){

        // ******* CAYO EN UNA TARJETA DE ARCA COMUNAL ******* //
        if(port.getPosition() == 2 || port.getPosition() == 17 || port.getPosition() == 33){
            int value = ActionDice.randomDices(16)-1; // Un numero random para agarrar la tarjeta de Arca
            
            if(port.getPlayerId().equals("00")){
                Variables.info_to_send = Variables.stop_bit + 
                    Variables.game_stations.get(0).getSerial() +
                    Variables.game_stations.get(0).getSerial() +
                    Variables.game_instructions.get(5).getSerial() +
                    "000" + // Bits del 8 al 6 sin tomar en cuenta
                    Variables.game_comunal_arks.get(value).getSerial() + 
                    Variables.stop_bit;
            }
            else if (port.getPlayerId().equals("01")){
                Variables.info_to_send = Variables.stop_bit + 
                    Variables.game_stations.get(1).getSerial() +
                    Variables.game_stations.get(1).getSerial() +
                    Variables.game_instructions.get(5).getSerial() +
                    "000" + // Bits del 8 al 6 sin tomar en cuenta
                    Variables.game_comunal_arks.get(value).getSerial() + 
                    Variables.stop_bit;
            }
            else if (port.getPlayerId().equals("10")){
                Variables.info_to_send = Variables.stop_bit + 
                    Variables.game_stations.get(2).getSerial() +
                    Variables.game_stations.get(2).getSerial() +
                    Variables.game_instructions.get(5).getSerial() +
                    "000" + // Bits del 8 al 6 sin tomar en cuenta
                    Variables.game_comunal_arks.get(value).getSerial() + 
                    Variables.stop_bit;
            }
            else {
                Variables.info_to_send = Variables.stop_bit + 
                    Variables.game_stations.get(3).getSerial() +
                    Variables.game_stations.get(3).getSerial() +
                    Variables.game_instructions.get(5).getSerial() +
                    "000" + // Bits del 8 al 6 sin tomar en cuenta
                    Variables.game_comunal_arks.get(value).getSerial() + 
                    Variables.stop_bit;
            }
            
            history_plays.append("Caiste en Arca Comunal! Se toma tarjeta ... \n");
            
            switch(value){
                case 0: // Pagar 50 a cada jugador
                    
                    if(port.getPlayerId().equals("00")){
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

                            Variables.info_to_send = Variables.stop_bit + 
                            Variables.game_stations.get(0).getSerial() +
                            Variables.game_stations.get(2).getSerial() +
                            Variables.game_instructions.get(5).getSerial() +
                            "000" + // Bits del 8 al 6 sin tomar en cuenta
                            Variables.game_comunal_arks.get(2).getSerial() + 
                            Variables.stop_bit;

                            port.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";

                            Variables.info_to_send = Variables.stop_bit + 
                            Variables.game_stations.get(0).getSerial() +
                            Variables.game_stations.get(3).getSerial() +
                            Variables.game_instructions.get(5).getSerial() +
                            "000" + // Bits del 8 al 6 sin tomar en cuenta
                            Variables.game_comunal_arks.get(2).getSerial() + 
                            Variables.stop_bit;

                            port.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";
                    }
                    else if(port.getPlayerId().equals("01")){ 
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

                            Variables.info_to_send = Variables.stop_bit + 
                            Variables.game_stations.get(1).getSerial() +
                            Variables.game_stations.get(2).getSerial() +
                            Variables.game_instructions.get(5).getSerial() +
                            "000" + // Bits del 8 al 6 sin tomar en cuenta
                            Variables.game_comunal_arks.get(2).getSerial() + 
                            Variables.stop_bit;

                            port.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";

                            Variables.info_to_send = Variables.stop_bit + 
                            Variables.game_stations.get(1).getSerial() +
                            Variables.game_stations.get(3).getSerial() +
                            Variables.game_instructions.get(5).getSerial() +
                            "000" + // Bits del 8 al 6 sin tomar en cuenta
                            Variables.game_comunal_arks.get(2).getSerial() + 
                            Variables.stop_bit;

                            port.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";
                    }
                    else if(port.getPlayerId().equals("10")){
                        Variables.info_to_send = "";
                        Variables.info_to_send = Variables.stop_bit + 
                            Variables.game_stations.get(2).getSerial() +
                            Variables.game_stations.get(0).getSerial() +
                            Variables.game_instructions.get(5).getSerial() +
                            "000" + // Bits del 8 al 6 sin tomar en cuenta
                            Variables.game_comunal_arks.get(2).getSerial() + 
                            Variables.stop_bit;

                            port.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";

                            Variables.info_to_send = Variables.stop_bit + 
                            Variables.game_stations.get(2).getSerial() +
                            Variables.game_stations.get(1).getSerial() +
                            Variables.game_instructions.get(5).getSerial() +
                            "000" + // Bits del 8 al 6 sin tomar en cuenta
                            Variables.game_comunal_arks.get(2).getSerial() + 
                            Variables.stop_bit;

                            port.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";

                            Variables.info_to_send = Variables.stop_bit + 
                            Variables.game_stations.get(2).getSerial() +
                            Variables.game_stations.get(3).getSerial() +
                            Variables.game_instructions.get(5).getSerial() +
                            "000" + // Bits del 8 al 6 sin tomar en cuenta
                            Variables.game_comunal_arks.get(2).getSerial() + 
                            Variables.stop_bit;

                            port.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";
                    }
                    else {
                        Variables.info_to_send = "";
                        Variables.info_to_send = Variables.stop_bit + 
                            Variables.game_stations.get(3).getSerial() +
                            Variables.game_stations.get(0).getSerial() +
                            Variables.game_instructions.get(5).getSerial() +
                            "000" + // Bits del 8 al 6 sin tomar en cuenta
                            Variables.game_comunal_arks.get(2).getSerial() + 
                            Variables.stop_bit;

                            port.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";

                            Variables.info_to_send = Variables.stop_bit + 
                            Variables.game_stations.get(3).getSerial() +
                            Variables.game_stations.get(1).getSerial() +
                            Variables.game_instructions.get(5).getSerial() +
                            "000" + // Bits del 8 al 6 sin tomar en cuenta
                            Variables.game_comunal_arks.get(2).getSerial() + 
                            Variables.stop_bit;

                            port.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";

                            Variables.info_to_send = Variables.stop_bit + 
                            Variables.game_stations.get(3).getSerial() +
                            Variables.game_stations.get(2).getSerial() +
                            Variables.game_instructions.get(5).getSerial() +
                            "000" + // Bits del 8 al 6 sin tomar en cuenta
                            Variables.game_comunal_arks.get(2).getSerial() + 
                            Variables.stop_bit;

                            port.sendData(Variables.info_to_send);
                            Variables.info_to_send = "";
                    }
                    
                    port.downMoney(150);
                    
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    history_plays.append("Tuviste que pagar 50$ a cada jugador \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 1: // Ir a la carcel
                    // Si tengo salir de la carcel gratis, la uso
                    if(Variables.get_free_jail == true){
                        if(port.getPlayerId().equals("00")){
                            Variables.info_to_send = "";
                            Variables.info_to_send = Variables.stop_bit + 
                                Variables.game_stations.get(0).getSerial() +
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
                        else if(port.getPlayerId().equals("01")){ 
                            Variables.info_to_send = "";
                            Variables.info_to_send = Variables.stop_bit + 
                                Variables.game_stations.get(1).getSerial() +
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
                        else if(port.getPlayerId().equals("10")){
                            Variables.info_to_send = "";
                            Variables.info_to_send = Variables.stop_bit + 
                                Variables.game_stations.get(2).getSerial() +
                                Variables.game_stations.get(2).getSerial() +
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
                                Variables.game_stations.get(3).getSerial() +
                                Variables.game_stations.get(3).getSerial() +
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
                        port.setPosition(10);
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
                    port.setPosition(0);
                    port.plusMoney(200); // Sumo 200$ al valor total
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de avanzar a GO y cobrar 200$\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 4: // El jugador cobra 50$ del banco
                    port.plusMoney(50); // Sumo 200$ al valor total
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de cobrar 50$ del banco\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 5: // El jugador cobra 150$ del banco
                    port.plusMoney(150); // Sumo 200$ al valor total
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de cobrar 150$ del banco\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 6: // El jugador paga 15$ al banco
                    port.downMoney(15); // Sumo 200$ al valor total
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de pagar 15$ al banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 7: // El jugador retrocede 3 casillas
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    if( (port.getPosition() - 3) < 0 ){
                        port.setPosition((40 + port.getPosition()) - 3);
                        history_plays.append("Tomaste la tarjeta de retroceder 3 casillas\n");
                        history_plays.append("Click en 'Mover Ficha' para ver su posición");
                    }
                    else {
                        port.downPosition(3);
                        history_plays.append("Tomaste la tarjeta de retroceder 3 casillas\n");
                        history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    }
                    break;
                case 8: // Avanza hasta la propiedad Paseo Tablado
                    port.setPosition(39);
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta de moverte a Paseo Tablado\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 9: // Avanza hasta la propiedad Av. Illinois 
                    // Paso por GO y le sumo 200 a su dinero
                    if(port.getPosition() > 24){
                        port.plusMoney(200);
                        money_label.setText(String.valueOf(port.getMoney() + " $"));
                    }
                        
                    port.setPosition(24);
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta de moverte a Av. Illinois\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 10: // Avanza hasta la propiedad Plaza San Carlos
                    // Paso por GO y le sumo 200 a su dinero
                    if(port.getPosition() > 16){
                        port.plusMoney(200);
                        money_label.setText(String.valueOf(port.getMoney() + " $"));
                    }
                    
                    port.setPosition(16);
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta de moverte a la Plaza San Carlos\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 11: // Avanza hasta el Ferrocarril Reading
                    // Paso por GO y le sumo 200 a su dinero
                    if(port.getPosition() > 5){
                        port.plusMoney(200);
                        money_label.setText(String.valueOf(port.getMoney() + " $"));
                    }
                    
                    port.setPosition(5);
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
                    port.downMoney(100);
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de pagar 100$ al banco\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                default:
                    break;
            }
        } // ******* CAYO EN UNA TARJETA DE CASUALIDAD ******* //
        else if (port.getPosition() == 7 || port.getPosition() == 22 || port.getPosition() == 36 ){
            int value = ActionDice.randomDices(16)-1;
            
            if(port.getPlayerId().equals("00")){
                Variables.info_to_send = "";
                Variables.info_to_send = Variables.stop_bit + 
                    Variables.game_stations.get(0).getSerial() +
                    Variables.game_stations.get(0).getSerial() +
                    Variables.game_instructions.get(5).getSerial() +
                    "000" + // Bits del 8 al 6 sin tomar en cuenta
                    Variables.game_casualities.get(value).getSerial() + 
                    Variables.stop_bit;       
            }
            else if(port.getPlayerId().equals("01")){ 
                Variables.info_to_send = "";
                Variables.info_to_send = Variables.stop_bit + 
                    Variables.game_stations.get(1).getSerial() +
                    Variables.game_stations.get(1).getSerial() +
                    Variables.game_instructions.get(5).getSerial() +
                    "000" + // Bits del 8 al 6 sin tomar en cuenta
                    Variables.game_casualities.get(value).getSerial() + 
                    Variables.stop_bit;
            }
            else if(port.getPlayerId().equals("10")){
                Variables.info_to_send = "";
                Variables.info_to_send = Variables.stop_bit + 
                    Variables.game_stations.get(2).getSerial() +
                    Variables.game_stations.get(2).getSerial() +
                    Variables.game_instructions.get(5).getSerial() +
                    "000" + // Bits del 8 al 6 sin tomar en cuenta
                    Variables.game_casualities.get(value).getSerial() + 
                    Variables.stop_bit;

                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    Variables.get_free_jail = false;
                    history_plays.append("Tomaste una tarjeta de ir a la cárcel pero tiene una salida gratis \n");
            }
            else {
                Variables.info_to_send = "";
                Variables.info_to_send = Variables.stop_bit + 
                    Variables.game_stations.get(3).getSerial() +
                    Variables.game_stations.get(3).getSerial() +
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
                    port.plusMoney(10);
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 10$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 1: // Recibir 20$ del banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    port.plusMoney(20);
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 20$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;    
                case 2: // Recibir 25$ del banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    port.plusMoney(25);
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 25$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break; 
                case 3: // Recibir 45$ del banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    port.plusMoney(45);
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 45$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break; 
                case 4: // Recibir 100$ del banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    port.plusMoney(100);
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 100$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break; 
                case 5: // Recibir 100$ del banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    port.plusMoney(100);
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 100$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 6: // Recibir 100$ del banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    port.plusMoney(100);
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 100$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break; 
                case 7: /// El jugador recibe 200$ al banco
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    port.plusMoney(200);
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de recibir 100$ del banco \n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 8: // Avanza a GO y cobra 200$
                    port.setPosition(0);
                    port.plusMoney(200); // Sumo 200$ al valor total
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    history_plays.append("Tomaste la tarjeta de avanzar a GO y cobrar 200$\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 9: // El jugador va a la carcel
                    // Si tengo salir de la carcel gratis, la uso
                    if(Variables.get_free_jail == true){
                        if(port.getPlayerId().equals("00")){
                            Variables.info_to_send = "";
                            Variables.info_to_send = Variables.stop_bit + 
                                Variables.game_stations.get(0).getSerial() +
                                Variables.game_stations.get(0).getSerial() +
                                Variables.game_instructions.get(5).getSerial() +
                                "000" + // Bits del 8 al 6 sin tomar en cuenta
                                Variables.game_comunal_arks.get(2).getSerial() + 
                                Variables.stop_bit;
                                
                                port.sendData(Variables.info_to_send);
                                Variables.info_to_send = "";
                                Variables.get_free_jail = false;
                                history_plays.append("Tomaste una tarjeta de ir a la cárcel pero tiene una salida gratis \n");        
                        }
                        else if(port.getPlayerId().equals("01")){ 
                            Variables.info_to_send = "";
                            Variables.info_to_send = Variables.stop_bit + 
                                Variables.game_stations.get(1).getSerial() +
                                Variables.game_stations.get(1).getSerial() +
                                Variables.game_instructions.get(5).getSerial() +
                                "000" + // Bits del 8 al 6 sin tomar en cuenta
                                Variables.game_comunal_arks.get(2).getSerial() + 
                                Variables.stop_bit;
                                
                                port.sendData(Variables.info_to_send);
                                Variables.info_to_send = "";
                                Variables.get_free_jail = false;
                                history_plays.append("Tomaste una tarjeta de ir a la cárcel pero tiene una salida gratis \n");
                        }
                        else if(port.getPlayerId().equals("10")){
                            Variables.info_to_send = "";
                            Variables.info_to_send = Variables.stop_bit + 
                                Variables.game_stations.get(2).getSerial() +
                                Variables.game_stations.get(2).getSerial() +
                                Variables.game_instructions.get(5).getSerial() +
                                "000" + // Bits del 8 al 6 sin tomar en cuenta
                                Variables.game_comunal_arks.get(2).getSerial() + 
                                Variables.stop_bit;
                                
                                port.sendData(Variables.info_to_send);
                                Variables.info_to_send = "";
                                Variables.get_free_jail = false;
                                history_plays.append("Tomaste una tarjeta de ir a la cárcel pero tiene una salida gratis \n");
                        }
                        else {
                            Variables.info_to_send = "";
                            Variables.info_to_send = Variables.stop_bit + 
                                Variables.game_stations.get(3).getSerial() +
                                Variables.game_stations.get(3).getSerial() +
                                Variables.game_instructions.get(5).getSerial() +
                                "000" + // Bits del 8 al 6 sin tomar en cuenta
                                Variables.game_comunal_arks.get(2).getSerial() + 
                                Variables.stop_bit;
                                
                                port.sendData(Variables.info_to_send);
                                Variables.info_to_send = "";
                                Variables.get_free_jail = false;
                                history_plays.append("Tomaste una tarjeta de ir a la cárcel pero tiene una salida gratis \n");
                        }
                    }
                    else{
                        port.sendData(Variables.info_to_send);
                        Variables.info_to_send = "";
                        history_plays.append("Que mal!! Te haz ido a la cárcel\n");
                        port.setPosition(10);
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
                    port.plusMoney(50);
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta de cobrar 50$ de cada jugador\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 12: // Paga 50$ al banco
                    port.downMoney(50);
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta de pagar 50$ al banco\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 13: // Paga 100$ al banco
                    port.downMoney(100);
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta de pagar 100$ al banco\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                case 14: // Paga 150$ al banco
                    port.downMoney(150);
                    money_label.setText(String.valueOf(port.getMoney() + " $"));
                    port.sendData(Variables.info_to_send);
                    Variables.info_to_send = "";
                    history_plays.append("Tomaste la tarjeta de pagar 150$ al banco\n");
                    history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
                    break;
                default:
                    break;
            }
        } // ****** CAYO EN LA CASILLA DE IMPUESTOS SOBRE INGRESOS
        else if ( port.getPosition() == 4){
            history_plays.append("Caiste en la casilla de impuesto sobre ingresos, se pago 75$ al banco \n");
            history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
            money_label.setText(String.valueOf(port.getMoney() + " $"));
            Variables.info_to_send = "";
        }
        else if ( port.getPosition() == 38 ){ // ******* CAYO EN LA CASILLA DE IMPUESTOS POR POSESIONES DE LUJO
            port.downMoney(200);
            money_label.setText(String.valueOf(port.getMoney() + " $"));
            port.sendData(Variables.info_to_send);
            Variables.info_to_send = "";
            history_plays.append("Caiste en la casilla de impuesto por posesiones de lujo, se pago 200$ al banco \n");
            history_plays.append("Click en 'Mover Ficha' para ver su posición\n");
        }
    }
    
    /******************************************
    * Metodo para iniciar la partida nosotros *
    *******************************************/
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Construyo la trama de "Iniciar Partida"
        jButton3.setEnabled(false);
        endTurnButton.setEnabled(true);
        Variables.info_to_send = Variables.stop_bit + 
            Variables.game_stations.get(0).getSerial() +
            Variables.game_stations.get(0).getSerial() +
            Variables.game_instructions.get(0).getSerial() + 
            "100000" + Variables.game_stations.get(0).getSerial() +
            Variables.stop_bit;
            
            port.sendData(Variables.info_to_send); // Envio la trama de "Iniciar Partida"
            Variables.info_to_send = "";
            Variables.info_received = "";
            
            port.setPlayerId("00");
        
        history_plays.append("Se inicio la partida \n"); // Seteo en el historial lo que sucedió
        history_plays.append("Soy la Estación 1 \n");
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void buyCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyCardButtonActionPerformed
        Property new_property = new Property();
        
        for (int i = 0; i < Variables.game_cards.size(); i++) {
            if(Variables.game_cards.get(i).getPosition() == port.getPosition()){
                new_property.setSerial(Variables.game_cards.get(i).getSerial());
                new_property.setOwner(port.getPlayerId());
                new_property.setPropertyName(Variables.game_cards.get(i).getDescription());
                new_property.setPrice(Variables.game_cards.get(i).getPrice());
                new_property.setMortgage(Variables.game_cards.get(i).getMortgage());
                new_property.setPriceRent(Variables.game_cards.get(i).getPriceRent());
                break;
            }
        }
        
        record.setBounds(Variables.coordinates.get(port.getPosition()).getCoordinateX(),Variables.coordinates.get(port.getPosition()).getCoordinateY(),80,60);
        history_plays.setText("");
        Variables.addProperty(new_property); // Añado la propiedad a compradas por nosotros
        
        if(port.getPlayerId().equals("00")){
            Variables.info_to_send = Variables.stop_bit + 
                Variables.game_stations.get(0).getSerial() +
                Variables.game_stations.get(0).getSerial() +
                Variables.game_instructions.get(4).getSerial() +
                "100" + // Bits del 8 al 6 sin tomar en cuenta
                new_property.getSerial() + 
                Variables.stop_bit;    
        }
        else if(port.getPlayerId().equals("01")){ 
            Variables.info_to_send = Variables.stop_bit + 
                Variables.game_stations.get(1).getSerial() +
                Variables.game_stations.get(1).getSerial() +
                Variables.game_instructions.get(4).getSerial() +
                "100" + // Bits del 8 al 6 sin tomar en cuenta
                new_property.getSerial() + 
                Variables.stop_bit;
        }
        else if(port.getPlayerId().equals("10")){
            Variables.info_to_send = Variables.stop_bit + 
                Variables.game_stations.get(2).getSerial() +
                Variables.game_stations.get(2).getSerial() +
                Variables.game_instructions.get(4).getSerial() +
                "100" + // Bits del 8 al 6 sin tomar en cuenta
                new_property.getSerial() + 
                Variables.stop_bit;
        }
        else {
            Variables.info_to_send = Variables.stop_bit + 
                Variables.game_stations.get(3).getSerial() +
                Variables.game_stations.get(3).getSerial() +
                Variables.game_instructions.get(4).getSerial() +
                "100" + // Bits del 8 al 6 sin tomar en cuenta
                new_property.getSerial() + 
                Variables.stop_bit;
        }

        port.sendData(Variables.info_to_send);
        Variables.info_to_send = "";
        
        port.downMoney(new_property.getPrice());
        buyCardButton.setEnabled(false);
        money_label.setText(String.valueOf(port.getMoney() + " $"));
        
        history_plays.append("Compraste la propiedad " + new_property.getPropertyName() + "\n");
        history_plays.append("Click 'Finalizar Turno' para terminar su jugada \n");       
    }//GEN-LAST:event_buyCardButtonActionPerformed

    private void endTurnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endTurnButtonActionPerformed
        String name = "";
        history_plays.setText("");
       
        if (port.getPlayerId().equals("00")){
            name = "Estación 1";
            Variables.info_to_send = Variables.stop_bit + 
            port.getPlayerId() +
            "01" +
            Variables.game_instructions.get(7).getSerial() +
            "10000001" +
            Variables.stop_bit;
        }
        else if(port.getPlayerId().equals("01")){
            name = "Estación 2";
            Variables.info_to_send = Variables.stop_bit + 
            port.getPlayerId() +
            "10" +
            Variables.game_instructions.get(7).getSerial() +
            "10000010" +
            Variables.stop_bit;
        }
        else if (port.getPlayerId().equals("10")){
            name = "Estación 3";
            Variables.info_to_send = Variables.stop_bit + 
            port.getPlayerId() +
            "11" +
            Variables.game_instructions.get(7).getSerial() +
            "10000011" +
            Variables.stop_bit;
        }
        else if (port.getPlayerId().equals("11")) {
            name = "Estación 4";
            Variables.info_to_send = Variables.stop_bit + 
            port.getPlayerId() +
            "00" +
            Variables.game_instructions.get(7).getSerial() +
            "10000000" +
            Variables.stop_bit;
        }
        
        port.sendData(Variables.info_to_send);
        Variables.info_to_send = "";
        
        history_plays.append("La " + name + " ha finalizado el turno \n");

        endTurnButton.setEnabled(false);
        throwDicesButtton.setEnabled(false);
        moveRecordButton.setEnabled(false);
        buyCardButton.setEnabled(false);     
    }//GEN-LAST:event_endTurnButtonActionPerformed

    private void sellCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellCardButtonActionPerformed
        
    }//GEN-LAST:event_sellCardButtonActionPerformed

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
    public static javax.swing.JButton buyCardButton;
    public static javax.swing.JButton endTurnButton;
    public static javax.swing.JTextArea history_plays;
    private javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton3;
    private javax.swing.JLabel jDice1;
    private javax.swing.JLabel jDice2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel label_money_description;
    public static javax.swing.JLabel money_label;
    private javax.swing.JPanel monopolyPanel;
    public javax.swing.JLabel monopoly_board;
    public static javax.swing.JButton moveRecordButton;
    public javax.swing.JLabel record;
    private javax.swing.JButton releaseGameButton;
    public javax.swing.JButton sellCardButton;
    public static javax.swing.JButton throwDicesButtton;
    // End of variables declaration//GEN-END:variables
}
