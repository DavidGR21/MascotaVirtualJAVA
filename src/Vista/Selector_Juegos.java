/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Juegos.Juego_Memoria;
import java.awt.Color;

/**
 *
 * @author david
 */
public class Selector_Juegos extends javax.swing.JPanel {
    
    private Pantalla_Juego juegoPrincipal;
    private Juego_Memoria juegoMemoria;

    /**
     * Creates new form Selector_Juegos
     */
    public Selector_Juegos(Pantalla_Juego j) {
        initComponents();
        this.pFondoJuegos.setVisible(false);
        this.juegoPrincipal = j;
        this.juegoMemoria = new Juego_Memoria(j);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJugar = new javax.swing.JButton();
        pFondoJuegos = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblFondoSelectorJuegos = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJugar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(51, 0, 51));
        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/palanca_Apagado.png"))); // NOI18N
        btnJugar.setText("JUGAR");
        btnJugar.setContentAreaFilled(false);
        btnJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJugar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJugar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/palanca_Grande.png"))); // NOI18N
        btnJugar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/palanca.png"))); // NOI18N
        btnJugar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnJugar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnJugarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnJugarMouseExited(evt);
            }
        });
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, 100));

        pFondoJuegos.setBackground(new java.awt.Color(51, 0, 51));
        pFondoJuegos.setForeground(new java.awt.Color(51, 0, 51));
        pFondoJuegos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/memoria.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pFondoJuegos.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        add(pFondoJuegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 300, 80));

        lblFondoSelectorJuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/fondoSelectorJuegos (1).gif"))); // NOI18N
        add(lblFondoSelectorJuegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        if (this.pFondoJuegos.isVisible()) {
            this.pFondoJuegos.setVisible(false);
        } else {
            this.pFondoJuegos.setVisible(true);
        }
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnJugarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJugarMouseEntered
        this.btnJugar.setForeground(Color.white);
    }//GEN-LAST:event_btnJugarMouseEntered

    private void btnJugarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJugarMouseExited
        this.btnJugar.setForeground(new Color(51, 0, 51));
    }//GEN-LAST:event_btnJugarMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.juegoPrincipal.cambiarPanel(this.juegoMemoria);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblFondoSelectorJuegos;
    private javax.swing.JPanel pFondoJuegos;
    // End of variables declaration//GEN-END:variables
}
