// jButton1: Botón para lanzar los dados.
// jButton2: Botón para realizar la animación de mover la ficha

package MonopolyRedes.views;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import MonopolyRedes.Variables;
import MonopolyRedes.positions.Position;
import java.util.ArrayList;

public class Board extends javax.swing.JFrame {
   
    public Board() {
        initComponents();
        MouseMotionListener mml = new MouseMotionListener() {
   
            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("El evento es" + e.getX() + '/' + e.getY() );
            }

            @Override
            public void mouseDragged(MouseEvent e) {
            }
        };
        
        monopoly_board.addMouseMotionListener(mml);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        record = new javax.swing.JLabel();
        monopoly_board = new javax.swing.JLabel();
        monopolyPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego de Monopolio");
        setMaximumSize(new java.awt.Dimension(500, 500));
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

        javax.swing.GroupLayout monopolyPanelLayout = new javax.swing.GroupLayout(monopolyPanel);
        monopolyPanel.setLayout(monopolyPanelLayout);
        monopolyPanelLayout.setHorizontalGroup(
            monopolyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monopolyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(monopolyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addContainerGap())
        );
        monopolyPanelLayout.setVerticalGroup(
            monopolyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monopolyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(631, Short.MAX_VALUE))
        );

        getContentPane().add(monopolyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        record.setBounds(Variables.coordinates.get(6).getCoordinateX(),Variables.coordinates.get(6).getCoordinateY(),80,60);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JPanel monopolyPanel;
    public javax.swing.JLabel monopoly_board;
    public javax.swing.JLabel record;
    // End of variables declaration//GEN-END:variables
}
