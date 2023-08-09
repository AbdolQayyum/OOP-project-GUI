/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tictactes;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdul Qayyum
 */
public class Tictactoe_s extends javax.swing.JFrame {

private String startGame = "X";
private int xCount = 0;
private int oCount = 0;
private int i =0;
   
    public Tictactoe_s() {
        initComponents();
// increase the size of dialogue box
        setSize(1200,600);
        setLocationRelativeTo(null);
    }
// Create game Score method that can count the score of both players
private void gameScore(){

jlblPlayerX.setText(String.valueOf(xCount));
jlblPlayer0.setText(String.valueOf(oCount));

}

private void choose_a_player(){

if (startGame.equalsIgnoreCase("X")){

startGame = "0";

}
else{

startGame = "X";
}

}
// wiining game method .This method tells us that which player wins the game 
private void wining_game(){

String b1 = jButton1.getText();
String b2 = jButton15.getText();
String b3 = jButton3.getText();

String b4 = jButton6.getText();
String b5 = jButton7.getText();
String b6 = jButton8.getText();

String b7 = jButton14.getText();
String b8 = jButton12.getText();
String b9 = jButton13.getText();

// condition to check that if three X are place in same row 
if(b1 == ("X") && b2 == ("X") && b3 == ("X")){

JOptionPane.showMessageDialog(this,"Player X wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
xCount++;

// calling gamescore Method
gameScore();

jButton1.setBackground(Color.YELLOW);
jButton15.setBackground(Color.YELLOW);
jButton3.setBackground(Color.YELLOW);

}

if(b4 == ("X") && b5 == ("X") && b6 == ("X")){

JOptionPane.showMessageDialog(this,"Player X wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
xCount++;

// calling gamescore Method
gameScore();

jButton6.setBackground(Color.MAGENTA);
jButton7.setBackground(Color.MAGENTA);
jButton8.setBackground(Color.MAGENTA);

}

if(b7 == ("X") && b8 == ("X") && b9 == ("X")){

JOptionPane.showMessageDialog(this,"Player X wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
xCount++;

// calling gamescore Method
gameScore();

jButton14.setBackground(Color.cyan);
jButton12.setBackground(Color.cyan);
jButton13.setBackground(Color.cyan);

}

// Coulmn 1
if(b1 == ("X") && b4 == ("X") && b7 == ("X")){

JOptionPane.showMessageDialog(this,"Player X wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
xCount++;

// calling gamescore Method
gameScore();

jButton1.setBackground(Color.YELLOW);
jButton6.setBackground(Color.YELLOW);
jButton14.setBackground(Color.YELLOW);

}
// coulmn 2
if(b2 == ("X") && b5 == ("X") && b8 == ("X")){

JOptionPane.showMessageDialog(this,"Player X wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
xCount++;

// calling gamescore Method
gameScore();

jButton15.setBackground(Color.MAGENTA);
jButton7.setBackground(Color.MAGENTA);
jButton12.setBackground(Color.MAGENTA);

}
// Coulmn 3
if(b3 == ("X") && b6 == ("X") && b9 == ("X")){

JOptionPane.showMessageDialog(this,"Player X wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
xCount++;

// calling gamescore Method
gameScore();

jButton3.setBackground(Color.cyan);
jButton8.setBackground(Color.cyan);
jButton12.setBackground(Color.cyan);

}

// diagnol 1
if(b1 == ("X") && b5 == ("X") && b9 == ("X")){

JOptionPane.showMessageDialog(this,"Player X wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
xCount++;

// calling gamescore Method
gameScore();

jButton1.setBackground(Color.YELLOW);
jButton7.setBackground(Color.YELLOW);
jButton13.setBackground(Color.YELLOW);

}
// diagnol 2
if(b3 == ("X") && b5 == ("X") && b7 == ("X")){

JOptionPane.showMessageDialog(this,"Player X wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
xCount++;

// calling gamescore Method
gameScore();

jButton3.setBackground(Color.MAGENTA);
jButton7.setBackground(Color.MAGENTA);
jButton14.setBackground(Color.MAGENTA);

}

// Now for the Player 0

if(b1 == ("0") && b2 == ("0") && b3 == ("0")){

JOptionPane.showMessageDialog(this,"Player 0 wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
oCount++;

// calling gamescore Method
gameScore();

jButton1.setBackground(Color.YELLOW);
jButton15.setBackground(Color.YELLOW);
jButton3.setBackground(Color.YELLOW);

}

if(b4 == ("0") && b5 == ("0") && b6 == ("0")){

JOptionPane.showMessageDialog(this,"Player 0 wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
oCount++;

// calling gamescore Method
gameScore();

jButton6.setBackground(Color.MAGENTA);
jButton7.setBackground(Color.MAGENTA);
jButton8.setBackground(Color.MAGENTA);

}

if(b7 == ("0") && b8 == ("0") && b9 == ("0")){

JOptionPane.showMessageDialog(this,"Player 0 wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
oCount++;

// calling gamescore Method
gameScore();

jButton14.setBackground(Color.cyan);
jButton12.setBackground(Color.cyan);
jButton13.setBackground(Color.cyan);

}

// Coulmn 1
if(b1 == ("0") && b4 == ("0") && b7 == ("0")){

JOptionPane.showMessageDialog(this,"Player 0 wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
oCount++;

// calling gamescore Method
gameScore();

jButton1.setBackground(Color.YELLOW);
jButton6.setBackground(Color.YELLOW);
jButton14.setBackground(Color.YELLOW);

}

// coulmn 2
if(b2 == ("0") && b5 == ("0") && b8 == ("0")){

JOptionPane.showMessageDialog(this,"Player 0 wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
oCount++;

// calling gamescore Method
gameScore();

jButton15.setBackground(Color.MAGENTA);
jButton7.setBackground(Color.MAGENTA);
jButton14.setBackground(Color.MAGENTA);

}
// Coulmn 3
if(b3 == ("0") && b6 == ("0") && b9 == ("0")){

JOptionPane.showMessageDialog(this,"Player 0 wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
oCount++;

// calling gamescore Method
gameScore();

jButton3.setBackground(Color.cyan);
jButton8.setBackground(Color.cyan);
jButton12.setBackground(Color.cyan);

}

// diagnol 1
if(b1 == ("0") && b5 == ("0") && b9 == ("0")){

JOptionPane.showMessageDialog(this,"Player 0 wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
oCount++;

// calling gamescore Method
gameScore();

jButton1.setBackground(Color.YELLOW);
jButton7.setBackground(Color.YELLOW);
jButton13.setBackground(Color.YELLOW);

}
// diagnol 2
if(b3 == ("0") && b5 == ("0") && b7 == ("0")){

JOptionPane.showMessageDialog(this,"Player 0 wins the game","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
oCount++;

// calling gamescore Method
gameScore();

jButton3.setBackground(Color.MAGENTA);
jButton7.setBackground(Color.MAGENTA);
jButton14.setBackground(Color.MAGENTA);

}


if(i==9){

JOptionPane.showMessageDialog(this,"Game drwan..! No one Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
}



}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jlblPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jlblPlayer0 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton15, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Player X:");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setForeground(new java.awt.Color(204, 204, 204));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jlblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setForeground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setForeground(new java.awt.Color(204, 204, 204));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setText("Player 0:");
        jPanel11.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setForeground(new java.awt.Color(204, 204, 204));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jlblPlayer0.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlblPlayer0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(jlblPlayer0, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setForeground(new java.awt.Color(204, 204, 204));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton14, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setForeground(new java.awt.Color(204, 204, 204));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton12, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setForeground(new java.awt.Color(204, 204, 204));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton13, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setForeground(new java.awt.Color(204, 204, 204));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setForeground(new java.awt.Color(204, 204, 204));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents




    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startGame);

 if (startGame.equalsIgnoreCase("X")){

jButton8.setForeground(Color.red);

}
else{

jButton8.setForeground(Color.blue);

}
choose_a_player();
wining_game();
i++;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       jButton12.setText(startGame);

 if (startGame.equalsIgnoreCase("X")){

jButton12.setForeground(Color.red);

}
else{

jButton12.setForeground(Color.blue);

}
choose_a_player();
wining_game();
i++;
    }//GEN-LAST:event_jButton12ActionPerformed
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
               frame = new JFrame("EXIT");
       if (JOptionPane.showConfirmDialog(frame, "Please Confirm, You really want to exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION);
{
       System.exit(0);
}
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
      jButton1.setText(null);
      jButton15.setText(null);
      jButton3.setText(null);

      jButton6.setText(null);
      jButton7.setText(null);
      jButton8.setText(null);

      jButton14.setText(null);
      jButton12.setText(null);
      jButton13.setText(null);

jButton1.setBackground(Color.LIGHT_GRAY);
jButton15.setBackground(Color.LIGHT_GRAY);
jButton3.setBackground(Color.LIGHT_GRAY);

jButton6.setBackground(Color.LIGHT_GRAY);
jButton7.setBackground(Color.LIGHT_GRAY);
jButton8.setBackground(Color.LIGHT_GRAY);

jButton14.setBackground(Color.LIGHT_GRAY);
jButton12.setBackground(Color.LIGHT_GRAY);
jButton13.setBackground(Color.LIGHT_GRAY);
 i =0;
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
jButton1.setText(startGame);

 if (startGame.equalsIgnoreCase("X")){

jButton1.setForeground(Color.red);

}
else{

jButton1.setForeground(Color.blue);

}
choose_a_player();
wining_game();
i++;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       jButton15.setText(startGame);

 if (startGame.equalsIgnoreCase("X")){

jButton15.setForeground(Color.red);

}
else{

jButton15.setForeground(Color.blue);

}
choose_a_player();
wining_game();
i++;
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);

 if (startGame.equalsIgnoreCase("X")){

jButton3.setForeground(Color.red);

}
else{

jButton3.setForeground(Color.blue);

}
choose_a_player();
wining_game();
i++;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(startGame);

 if (startGame.equalsIgnoreCase("X")){

jButton6.setForeground(Color.red);

}
else{

jButton6.setForeground(Color.blue);

}
choose_a_player();
wining_game();
i++;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(startGame);

 if (startGame.equalsIgnoreCase("X")){

jButton7.setForeground(Color.red);

}
else{

jButton7.setForeground(Color.blue);

}
choose_a_player();
wining_game();
i++;

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jButton14.setText(startGame);

 if (startGame.equalsIgnoreCase("X")){

jButton14.setForeground(Color.red);

}
else{

jButton14.setForeground(Color.blue);

}
choose_a_player();
wining_game();
i++;
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       jButton13.setText(startGame);

 if (startGame.equalsIgnoreCase("X")){

jButton13.setForeground(Color.red);

}
else{

jButton13.setForeground(Color.blue);

}
choose_a_player();
wining_game();
i++;
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tictactoe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tictactoe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tictactoe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tictactoe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tictactoe_s().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlblPlayer0;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
