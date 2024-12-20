/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Pantalla_Tienda extends javax.swing.JPanel {

    private Pantalla_Juego juego;
    private Pantalla_Cocina cocina;

    /**
     * Creates new form tienda
     */
    public Pantalla_Tienda(Pantalla_Juego p, Pantalla_Cocina c) {
        initComponents();
        this.juego = p;
        this.cocina = c;
        this.pFondoProductos.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnComprar = new javax.swing.JButton();
        pFondoProductos = new javax.swing.JPanel();
        btnPastilla = new javax.swing.JButton();
        btnSuero = new javax.swing.JButton();
        btnJarabe = new javax.swing.JButton();
        lblPrecioSuero = new javax.swing.JLabel();
        lblPrecioPastilla = new javax.swing.JLabel();
        lblPrecioJarabe = new javax.swing.JLabel();
        btnPizza = new javax.swing.JButton();
        btnHamburguesa = new javax.swing.JButton();
        btnSushi = new javax.swing.JButton();
        lblPrecioPizza = new javax.swing.JLabel();
        lblPrecioHamburguesa = new javax.swing.JLabel();
        lblPrecioSushi = new javax.swing.JLabel();
        lblFondoTienda = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprar.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(0, 0, 0));
        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/billete-de-banco_Apagado.png"))); // NOI18N
        btnComprar.setText("COMPRAR");
        btnComprar.setContentAreaFilled(false);
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComprar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/billete-de-banco_Grande.png"))); // NOI18N
        btnComprar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/billete-de-banco.png"))); // NOI18N
        btnComprar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnComprar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprarMouseExited(evt);
            }
        });
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 130, 110));

        pFondoProductos.setBackground(new java.awt.Color(102, 102, 102));
        pFondoProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPastilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/medicamento.png"))); // NOI18N
        btnPastilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPastilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastillaActionPerformed(evt);
            }
        });
        pFondoProductos.add(btnPastilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 60, 50));

        btnSuero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/suero.png"))); // NOI18N
        btnSuero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSueroActionPerformed(evt);
            }
        });
        pFondoProductos.add(btnSuero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 60, 50));

        btnJarabe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/jarabe.png"))); // NOI18N
        btnJarabe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJarabe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJarabeActionPerformed(evt);
            }
        });
        pFondoProductos.add(btnJarabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 60, 50));

        lblPrecioSuero.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        lblPrecioSuero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioSuero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/dolar.png"))); // NOI18N
        lblPrecioSuero.setText("60");
        lblPrecioSuero.setToolTipText("");
        lblPrecioSuero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pFondoProductos.add(lblPrecioSuero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 60, 30));

        lblPrecioPastilla.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        lblPrecioPastilla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioPastilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/dolar.png"))); // NOI18N
        lblPrecioPastilla.setText("15");
        lblPrecioPastilla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pFondoProductos.add(lblPrecioPastilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, -1));

        lblPrecioJarabe.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        lblPrecioJarabe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioJarabe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/dolar.png"))); // NOI18N
        lblPrecioJarabe.setText("30");
        lblPrecioJarabe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pFondoProductos.add(lblPrecioJarabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 60, 30));

        btnPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/porcion-de-pizza.png"))); // NOI18N
        btnPizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPizzaActionPerformed(evt);
            }
        });
        pFondoProductos.add(btnPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        btnHamburguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/hamburguesa-con-queso.png"))); // NOI18N
        btnHamburguesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHamburguesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHamburguesaActionPerformed(evt);
            }
        });
        pFondoProductos.add(btnHamburguesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 50));

        btnSushi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/sushi.png"))); // NOI18N
        btnSushi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSushi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSushiActionPerformed(evt);
            }
        });
        pFondoProductos.add(btnSushi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 60, 50));

        lblPrecioPizza.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        lblPrecioPizza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/dolar.png"))); // NOI18N
        lblPrecioPizza.setText("10");
        lblPrecioPizza.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pFondoProductos.add(lblPrecioPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 30));

        lblPrecioHamburguesa.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        lblPrecioHamburguesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioHamburguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/dolar.png"))); // NOI18N
        lblPrecioHamburguesa.setText("25");
        lblPrecioHamburguesa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pFondoProductos.add(lblPrecioHamburguesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 60, 30));

        lblPrecioSushi.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        lblPrecioSushi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioSushi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/dolar.png"))); // NOI18N
        lblPrecioSushi.setText("50");
        lblPrecioSushi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pFondoProductos.add(lblPrecioSushi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 60, -1));

        add(pFondoProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 240, 190));

        lblFondoTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/fondoTienda.jpg"))); // NOI18N
        add(lblFondoTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPastillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastillaActionPerformed
        int precioPastilla = Integer.valueOf(this.lblPrecioPastilla.getText());
        this.comprar(precioPastilla);
        this.juego.getMascota().setCantPastillas(this.juego.getMascota().getCantPastillas() + 1);
        this.juego.guardarPartidaEnArchivo(this.juego.getMascota());
        this.cocina.llenarProductos();
    }//GEN-LAST:event_btnPastillaActionPerformed

    private void btnPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPizzaActionPerformed
        int precioPizza = Integer.valueOf(this.lblPrecioPizza.getText());
        this.comprar(precioPizza);
        this.juego.getMascota().setCantPizzas(this.juego.getMascota().getCantPizzas() + 1);
        this.juego.guardarPartidaEnArchivo(this.juego.getMascota());
        this.cocina.llenarProductos();
    }//GEN-LAST:event_btnPizzaActionPerformed
    private void comprar(int precio) {
        this.juego.disminuirDinero(precio);
    }
    private void btnComprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseEntered
        this.btnComprar.setForeground(new Color(102, 0, 0));
    }//GEN-LAST:event_btnComprarMouseEntered

    private void btnComprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseExited
        this.btnComprar.setForeground(Color.black);
    }//GEN-LAST:event_btnComprarMouseExited

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if (this.pFondoProductos.isVisible()) {
            this.pFondoProductos.setVisible(false);
        } else {
            this.pFondoProductos.setVisible(true);
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnHamburguesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHamburguesaActionPerformed
        int precioHamburguesa = Integer.valueOf(this.lblPrecioHamburguesa.getText());
        this.comprar(precioHamburguesa);
        this.juego.getMascota().setCantHamburguesas(this.juego.getMascota().getCantHamburguesas() + 1);
        this.juego.guardarPartidaEnArchivo(this.juego.getMascota());
        this.cocina.llenarProductos();
    }//GEN-LAST:event_btnHamburguesaActionPerformed

    private void btnSushiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSushiActionPerformed
        int precioSushi = Integer.valueOf(this.lblPrecioSushi.getText());
        this.comprar(precioSushi);
        this.juego.getMascota().setCantSushis(this.juego.getMascota().getCantSushis() + 1);
        this.juego.guardarPartidaEnArchivo(this.juego.getMascota());
        this.cocina.llenarProductos();
    }//GEN-LAST:event_btnSushiActionPerformed

    private void btnJarabeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJarabeActionPerformed
        int precioJarabe = Integer.valueOf(this.lblPrecioJarabe.getText());
        this.comprar(precioJarabe);
        this.juego.getMascota().setCantJarabes(this.juego.getMascota().getCantJarabes() + 1);
        this.juego.guardarPartidaEnArchivo(this.juego.getMascota());
        this.cocina.llenarProductos();
    }//GEN-LAST:event_btnJarabeActionPerformed

    private void btnSueroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSueroActionPerformed
        int precioSuero = Integer.valueOf(this.lblPrecioSuero.getText());
        this.comprar(precioSuero);
        this.juego.getMascota().setCantSueros(this.juego.getMascota().getCantSueros() + 1);
        this.juego.guardarPartidaEnArchivo(this.juego.getMascota());
        this.cocina.llenarProductos();
    }//GEN-LAST:event_btnSueroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnHamburguesa;
    private javax.swing.JButton btnJarabe;
    private javax.swing.JButton btnPastilla;
    private javax.swing.JButton btnPizza;
    private javax.swing.JButton btnSuero;
    private javax.swing.JButton btnSushi;
    private javax.swing.JLabel lblFondoTienda;
    private javax.swing.JLabel lblPrecioHamburguesa;
    private javax.swing.JLabel lblPrecioJarabe;
    private javax.swing.JLabel lblPrecioPastilla;
    private javax.swing.JLabel lblPrecioPizza;
    private javax.swing.JLabel lblPrecioSuero;
    private javax.swing.JLabel lblPrecioSushi;
    private javax.swing.JPanel pFondoProductos;
    // End of variables declaration//GEN-END:variables
}
