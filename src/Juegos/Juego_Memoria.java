/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Juegos;

import Juego_Memoria.Coincidencia;
import Juego_Memoria.Juego;
import Vista.Pantalla_Juego;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author david
 */
public class Juego_Memoria extends javax.swing.JPanel {

    Pantalla_Juego pantallaPrincipal;
    Juego juego;
    private int clic;
    private List<Integer> siguiente;
    private int cont01, cont02, cont03, cont04, cont05, cont06, cont07, cont08;

    public List<Integer> getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(List<Integer> siguiente) {
        this.siguiente = siguiente;
    }

    public JButton getBtn01() {
        return this.btn01;
    }

    public JButton getBtn02() {
        return this.btn02;
    }

    public JButton getBtn03() {
        return this.btn03;
    }

    public JButton getBtn04() {
        return this.btn04;
    }

    public JButton getBtn05() {
        return this.btn05;
    }

    public JButton getBtn06() {
        return this.btn06;
    }

    public JButton getBtn07() {
        return this.btn07;
    }

    public JButton getBtn08() {
        return this.btn08;
    }

    public Pantalla_Juego getPantallaPrincipal() {
        return pantallaPrincipal;
    }

    public void setPantallaPrincipal(Pantalla_Juego pantallaPrincipal) {
        this.pantallaPrincipal = pantallaPrincipal;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public int getClic() {
        return clic;
    }

    public void setClic(int clic) {
        this.clic = clic;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * Creates new form Juego_Memoria
     */
    public Juego_Memoria(Pantalla_Juego j) {
        initComponents();
        this.juego = new Juego(this, j);
        this.clic = 0;
        this.pantallaPrincipal = j;
        this.siguiente = juego.todasFilasTabla();
        juego.imgStart();
        this.cont01 = this.cont02 = this.cont03 = this.cont04 = this.cont05 = this.cont06
                = this.cont07 = this.cont08 = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn04 = new javax.swing.JButton();
        btn05 = new javax.swing.JButton();
        btn06 = new javax.swing.JButton();
        btn07 = new javax.swing.JButton();
        btn08 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn01.setBackground(new java.awt.Color(51, 0, 51));
        btn01.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });
        add(btn01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 120));

        btn02.setBackground(new java.awt.Color(51, 0, 51));
        btn02.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });
        add(btn02, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 120));

        btn03.setBackground(new java.awt.Color(51, 0, 51));
        btn03.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btn03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn03ActionPerformed(evt);
            }
        });
        add(btn03, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 110, 120));

        btn04.setBackground(new java.awt.Color(51, 0, 51));
        btn04.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn04ActionPerformed(evt);
            }
        });
        add(btn04, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 110, 120));

        btn05.setBackground(new java.awt.Color(51, 0, 51));
        btn05.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn05ActionPerformed(evt);
            }
        });
        add(btn05, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 110, 120));

        btn06.setBackground(new java.awt.Color(51, 0, 51));
        btn06.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btn06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn06ActionPerformed(evt);
            }
        });
        add(btn06, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 110, 120));

        btn07.setBackground(new java.awt.Color(51, 0, 51));
        btn07.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btn07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn07ActionPerformed(evt);
            }
        });
        add(btn07, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 110, 120));

        btn08.setBackground(new java.awt.Color(51, 0, 51));
        btn08.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn08ActionPerformed(evt);
            }
        });
        add(btn08, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 110, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/fondoJuegoMemoria.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void btn03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn03ActionPerformed
        if (this.juego.getMatch().isEmpty()) {
            Coincidencia c = new Coincidencia();
            c.setBtn(btn03);
            c.setNumeroBtn(3);
            c.setValorCoincidencia(siguiente.get(2));
            juego.getMatch().add(c);
            juego.pintarCoincidencia();
            juego.coincidir();
            this.cont01 = 0;
            this.cont02 = 0;
            this.cont03 = 1;
            this.cont04 = 0;
            this.cont05 = 0;
            this.cont06 = 0;
            this.cont07 = 0;
            this.cont08 = 0;
        } else {
            if (cont03 == 0) {
                Coincidencia c = new Coincidencia();
                c.setBtn(btn03);
                c.setNumeroBtn(3);
                c.setValorCoincidencia(siguiente.get(2));
                juego.getMatch().add(c);
                juego.pintarCoincidencia();
                juego.coincidir();
                this.cont01 = 0;
                this.cont02 = 0;
                this.cont03 = 1;
                this.cont04 = 0;
                this.cont05 = 0;
                this.cont06 = 0;
                this.cont07 = 0;
                this.cont08 = 0;
            }
        }
    }//GEN-LAST:event_btn03ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        if (this.juego.getMatch().isEmpty()) {
            Coincidencia c = new Coincidencia();
            c.setBtn(btn01);
            c.setNumeroBtn(1);
            c.setValorCoincidencia(siguiente.get(0));
            juego.getMatch().add(c);
            juego.pintarCoincidencia();
            juego.coincidir();
            this.cont01 = 1;
            this.cont02 = 0;
            this.cont03 = 0;
            this.cont04 = 0;
            this.cont05 = 0;
            this.cont06 = 0;
            this.cont07 = 0;
            this.cont08 = 0;
        } else {
            if (cont01 == 0) {
                Coincidencia c = new Coincidencia();
                c.setBtn(btn01);
                c.setNumeroBtn(1);
                c.setValorCoincidencia(siguiente.get(0));
                juego.getMatch().add(c);
                juego.pintarCoincidencia();
                juego.coincidir();
                this.cont01 = 1;
                this.cont02 = 0;
                this.cont03 = 0;
                this.cont04 = 0;
                this.cont05 = 0;
                this.cont06 = 0;
                this.cont07 = 0;
                this.cont08 = 0;
            }
        }
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn05ActionPerformed
        if (this.juego.getMatch().isEmpty()) {
            Coincidencia c = new Coincidencia();
            c.setBtn(btn05);
            c.setNumeroBtn(5);
            c.setValorCoincidencia(siguiente.get(4));
            juego.getMatch().add(c);
            juego.pintarCoincidencia();
            juego.coincidir();
            this.cont01 = 0;
            this.cont02 = 0;
            this.cont03 = 0;
            this.cont04 = 0;
            this.cont05 = 1;
            this.cont06 = 0;
            this.cont07 = 0;
            this.cont08 = 0;
        } else {
            if (cont05 == 0) {
                Coincidencia c = new Coincidencia();
                c.setBtn(btn05);
                c.setNumeroBtn(5);
                c.setValorCoincidencia(siguiente.get(4));
                juego.getMatch().add(c);
                juego.pintarCoincidencia();
                juego.coincidir();
                this.cont01 = 0;
                this.cont02 = 0;
                this.cont03 = 0;
                this.cont04 = 0;
                this.cont05 = 1;
                this.cont06 = 0;
                this.cont07 = 0;
                this.cont08 = 0;
            }
        }
    }//GEN-LAST:event_btn05ActionPerformed

    private void btn06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn06ActionPerformed
        if (this.juego.getMatch().isEmpty()) {
            Coincidencia c = new Coincidencia();
            c.setBtn(btn06);
            c.setNumeroBtn(6);
            c.setValorCoincidencia(siguiente.get(5));
            juego.getMatch().add(c);
            juego.pintarCoincidencia();
            juego.coincidir();
            this.cont01 = 0;
            this.cont02 = 0;
            this.cont03 = 0;
            this.cont04 = 0;
            this.cont05 = 0;
            this.cont06 = 1;
            this.cont07 = 0;
            this.cont08 = 0;
        } else {
            if (cont06 == 0) {
                Coincidencia c = new Coincidencia();
                c.setBtn(btn06);
                c.setNumeroBtn(6);
                c.setValorCoincidencia(siguiente.get(5));
                juego.getMatch().add(c);
                juego.pintarCoincidencia();
                juego.coincidir();
                this.cont01 = 0;
                this.cont02 = 0;
                this.cont03 = 0;
                this.cont04 = 0;
                this.cont05 = 0;
                this.cont06 = 1;
                this.cont07 = 0;
                this.cont08 = 0;
            }
        }
    }//GEN-LAST:event_btn06ActionPerformed

    private void btn04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn04ActionPerformed
        if (this.juego.getMatch().isEmpty()) {
            Coincidencia c = new Coincidencia();
            c.setBtn(btn04);
            c.setNumeroBtn(4);
            c.setValorCoincidencia(siguiente.get(3));
            juego.getMatch().add(c);
            juego.pintarCoincidencia();
            juego.coincidir();
            this.cont01 = 0;
            this.cont02 = 0;
            this.cont03 = 0;
            this.cont04 = 1;
            this.cont05 = 0;
            this.cont06 = 0;
            this.cont07 = 0;
            this.cont08 = 0;
        } else {
            if (cont04 == 0) {
                Coincidencia c = new Coincidencia();
                c.setBtn(btn04);
                c.setNumeroBtn(4);
                c.setValorCoincidencia(siguiente.get(3));
                juego.getMatch().add(c);
                juego.pintarCoincidencia();
                juego.coincidir();
                this.cont01 = 0;
                this.cont02 = 0;
                this.cont03 = 0;
                this.cont04 = 1;
                this.cont05 = 0;
                this.cont06 = 0;
                this.cont07 = 0;
                this.cont08 = 0;
            }
        }
    }//GEN-LAST:event_btn04ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        if (this.juego.getMatch().isEmpty()) {
            Coincidencia c = new Coincidencia();
            c.setBtn(btn02);
            c.setNumeroBtn(2);
            c.setValorCoincidencia(siguiente.get(1));
            juego.getMatch().add(c);
            juego.pintarCoincidencia();
            juego.coincidir();
            this.cont01 = 0;
            this.cont02 = 1;
            this.cont03 = 0;
            this.cont04 = 0;
            this.cont05 = 0;
            this.cont06 = 0;
            this.cont07 = 0;
            this.cont08 = 0;
        } else {
            if (cont02 == 0) {
                Coincidencia c = new Coincidencia();
                c.setBtn(btn02);
                c.setNumeroBtn(2);
                c.setValorCoincidencia(siguiente.get(1));
                juego.getMatch().add(c);
                juego.pintarCoincidencia();
                juego.coincidir();
                this.cont01 = 0;
                this.cont02 = 1;
                this.cont03 = 0;
                this.cont04 = 0;
                this.cont05 = 0;
                this.cont06 = 0;
                this.cont07 = 0;
                this.cont08 = 0;
            }
        }
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn07ActionPerformed
        if (this.juego.getMatch().isEmpty()) {
            Coincidencia c = new Coincidencia();
            c.setBtn(btn07);
            c.setNumeroBtn(7);
            c.setValorCoincidencia(siguiente.get(6));
            juego.getMatch().add(c);
            juego.pintarCoincidencia();
            juego.coincidir();
            this.cont01 = 0;
            this.cont02 = 0;
            this.cont03 = 0;
            this.cont04 = 0;
            this.cont05 = 0;
            this.cont06 = 0;
            this.cont07 = 1;
            this.cont08 = 0;
        } else {
            if (cont07 == 0) {
                Coincidencia c = new Coincidencia();
                c.setBtn(btn07);
                c.setNumeroBtn(7);
                c.setValorCoincidencia(siguiente.get(6));
                juego.getMatch().add(c);
                juego.pintarCoincidencia();
                juego.coincidir();
                this.cont01 = 0;
                this.cont02 = 0;
                this.cont03 = 0;
                this.cont04 = 0;
                this.cont05 = 0;
                this.cont06 = 0;
                this.cont07 = 1;
                this.cont08 = 0;
            }
        }
    }//GEN-LAST:event_btn07ActionPerformed

    private void btn08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn08ActionPerformed
        if (this.juego.getMatch().isEmpty()) {
            Coincidencia c = new Coincidencia();
            c.setBtn(btn08);
            c.setNumeroBtn(8);
            c.setValorCoincidencia(siguiente.get(7));
            juego.getMatch().add(c);
            juego.pintarCoincidencia();
            juego.coincidir();
            this.cont01 = 0;
            this.cont02 = 0;
            this.cont03 = 0;
            this.cont04 = 0;
            this.cont05 = 0;
            this.cont06 = 0;
            this.cont07 = 0;
            this.cont08 = 1;
        } else {
            if (cont08 == 0) {
                Coincidencia c = new Coincidencia();
                c.setBtn(btn08);
                c.setNumeroBtn(8);
                c.setValorCoincidencia(siguiente.get(7));
                juego.getMatch().add(c);
                juego.pintarCoincidencia();
                juego.coincidir();
                this.cont01 = 0;
                this.cont02 = 0;
                this.cont03 = 0;
                this.cont04 = 0;
                this.cont05 = 0;
                this.cont06 = 0;
                this.cont07 = 0;
                this.cont08 = 1;
            }
        }
    }//GEN-LAST:event_btn08ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn03;
    private javax.swing.JButton btn04;
    private javax.swing.JButton btn05;
    private javax.swing.JButton btn06;
    private javax.swing.JButton btn07;
    private javax.swing.JButton btn08;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}