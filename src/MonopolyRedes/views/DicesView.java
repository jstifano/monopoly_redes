package MonopolyRedes.views;

import MonopolyRedes.Variables;
import static MonopolyRedes.Variables.current_dices;
import MonopolyRedes.utils.ActionDice;
import javax.swing.ImageIcon;

public class DicesView extends javax.swing.JFrame {
    
    public DicesView() {
        initComponents();   

        /*if( Variables.current_dices.get(0).equals("1") ){
            icon_dice = new ImageIcon(Variables.dices_images[0]);
        }
        else if ( Variables.current_dices.get(0).equals("2") ){
            icon_dice = new ImageIcon(Variables.dices_images[1]);
        }
        else if ( Variables.current_dices.get(0).equals("3") ){
            icon_dice = new ImageIcon(Variables.dices_images[2]);
        }
        else if ( Variables.current_dices.get(0).equals("4") ){
            icon_dice = new ImageIcon(Variables.dices_images[3]);
        }
        else if ( Variables.current_dices.get(0).equals("5") ){
            icon_dice = new ImageIcon(Variables.dices_images[4]);
        }
        else if ( Variables.current_dices.get(0).equals("6") ){
            icon_dice = new ImageIcon(Variables.dices_images[5]);
        }

        if( Variables.current_dices.get(1).equals("1") ){
            icon_dice2 = new ImageIcon(Variables.dices_images[0]);
        }
        else if ( Variables.current_dices.get(1).equals("2") ){
            icon_dice2 = new ImageIcon(Variables.dices_images[1]);
        }
        else if ( Variables.current_dices.get(1).equals("3") ){
            icon_dice2 = new ImageIcon(Variables.dices_images[2]);
        }
        else if ( Variables.current_dices.get(1).equals("4") ){
            icon_dice2 = new ImageIcon(Variables.dices_images[3]);
        }
        else if ( Variables.current_dices.get(1).equals("5") ){
            icon_dice2 = new ImageIcon(Variables.dices_images[4]);
        }
        else if ( Variables.current_dices.get(1).equals("6") ){
            icon_dice2 = new ImageIcon(Variables.dices_images[5]);
        }

        jLabel1.setIcon(icon_dice);
        jLabel2.setIcon(icon_dice2);*/    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/Dice1.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 150, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyRedes/images/Dice2.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 20, 133, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
