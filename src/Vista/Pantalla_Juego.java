/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Objetos.Mascota;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author david
 */
public class Pantalla_Juego extends javax.swing.JPanel {

    private Timer timerPrincipal;
    private Pantalla_Principal pantallaP;
    private Mascota mascota;
    private String nombreMascota;
    private Pantalla_Baño baño;
    private Pantalla_Cuarto cuarto;
    private Pantalla_Cocina cocina;
    private Pantalla_Tienda tienda;
    private Selector_Juegos juegos;
    private Pantalla_Logros logros;

    public Selector_Juegos getJuegos() {
        return juegos;
    }

    public Mascota getMascota() {
        return this.mascota;
    }

    public JProgressBar getPbEnergia() {
        return pbEnergia;
    }

    public JProgressBar getPbExperiencia() {
        return pbExperiencia;
    }

    public JProgressBar getPbHambre() {
        return pbHambre;
    }

    public JProgressBar getPbHigiene() {
        return pbHigiene;
    }

    public JProgressBar getPbVida() {
        return pbVida;
    }

    /**
     * Creates new form Pantalla_Juego
     */
    public Pantalla_Juego(String nombre, String estado, Pantalla_Principal p) {
        initComponents();
        this.nombreMascota = nombre;
        this.pantallaP = p;
        this.mascota = this.obtenerMascotaDesdeArchivo(this.nombreMascota);
        this.lblNombreMascota.setText(nombre);
        if (estado.equalsIgnoreCase("muerto")) {
            this.bloquearBotones();
            this.cambiarPanel(new Pantalla_Muerte());
        }
        this.baño = new Pantalla_Baño(this);
        this.cocina = new Pantalla_Cocina(this);
        this.cuarto = new Pantalla_Cuarto(this);
        this.tienda = new Pantalla_Tienda(this, this.cocina);
        this.juegos = new Selector_Juegos(this);
        this.logros = new Pantalla_Logros(this);
        if (this.mascota != null) {
            this.actualizarInterfaz();
            timerPrincipal = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    actualizarBarrasCadaSegundo();
                    if (pbVida.getValue() <= 0) {
                        mascotaMuerta();
                    }
                }
            ;
            });
            timerPrincipal.start();
        } else {
            System.out.println("Hubo un error al obtener los datos, la aplicacion se cerrara");
            System.exit(0);
        }
    }

    public void cambiarPanel(JPanel p) {
        if (this.mascota.getVida() <= 0) {
            p.setSize(460, 330);
            p.setLocation(0, 0);
            this.jpCambiante.removeAll();
            this.jpCambiante.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
            this.jpCambiante.revalidate();
            this.jpCambiante.repaint();
        } else {
            if (this.comprobarAcciones()) {
                p.setSize(460, 330);
                p.setLocation(0, 0);
                this.jpCambiante.removeAll();
                this.jpCambiante.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
                this.jpCambiante.revalidate();
                this.jpCambiante.repaint();
            } else {
                PanelMensaje pm = new PanelMensaje((JFrame) SwingUtilities.getWindowAncestor(this), true, "<html>TERMINA LA ACCIÓN <br>QUE ESTAS REALIZANDO</html>", 3);
                pm.setVisible(true);
                //JOptionPane.showMessageDialog(this, "Termina la accion que estas realizando");
            }
        }
    }

    private boolean comprobarAcciones() {
        boolean confirmacionCambio = true;
        boolean bañarse = this.baño.isEstaBañandose();
        boolean dormir = this.cuarto.isEstaDurmiendo();
        if (bañarse || dormir) {
            confirmacionCambio = false;
        }
        return confirmacionCambio;
    }

    private void regresarPanel(JPanel p) {
        //Metodo para cambiar y adaptar el fondo para la pantalla principal del menu
        p.setSize(590, 400);
        p.setLocation(0, 0);
        this.removeAll();
        this.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        this.revalidate();
        this.repaint();
        this.timerPrincipal.stop();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCambiante = new javax.swing.JPanel();
        lblPerrito = new javax.swing.JLabel();
        lblFondoSala = new javax.swing.JLabel();
        btnBaño = new javax.swing.JButton();
        btnCocina = new javax.swing.JButton();
        btnDormir = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnCasa = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        btnLogros = new javax.swing.JButton();
        pbExperiencia = new javax.swing.JProgressBar();
        lblNombreMascota = new javax.swing.JLabel();
        lblIconoMoneda = new javax.swing.JLabel();
        lblMonedas = new javax.swing.JLabel();
        lvlIconoNivel = new javax.swing.JLabel();
        lvlLetrasNivel = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        lblIconoExperiencia = new javax.swing.JLabel();
        lblIconoVida = new javax.swing.JLabel();
        pbVida = new javax.swing.JProgressBar();
        lblIconoHambre = new javax.swing.JLabel();
        pbHambre = new javax.swing.JProgressBar();
        pbEnergia = new javax.swing.JProgressBar();
        pbHigiene = new javax.swing.JProgressBar();
        lblIconoHigiene = new javax.swing.JLabel();
        lblIconoEnergia = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpCambiante.setBackground(new java.awt.Color(255, 255, 255));
        jpCambiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jpCambiante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPerrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/perritoPastorAleman.gif"))); // NOI18N
        jpCambiante.add(lblPerrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 203, 160));

        lblFondoSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/fondoSala.jpg"))); // NOI18N
        lblFondoSala.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jpCambiante.add(lblFondoSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 330));

        add(jpCambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 460, 330));

        btnBaño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/banera_Apagada.png"))); // NOI18N
        btnBaño.setContentAreaFilled(false);
        btnBaño.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBaño.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/banera_Grande.png"))); // NOI18N
        btnBaño.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/banera.png"))); // NOI18N
        btnBaño.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBaño.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBañoActionPerformed(evt);
            }
        });
        add(btnBaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 60, 60));

        btnCocina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/comer_Apagado.png"))); // NOI18N
        btnCocina.setContentAreaFilled(false);
        btnCocina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCocina.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/comer_Grande.png"))); // NOI18N
        btnCocina.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/comer.png"))); // NOI18N
        btnCocina.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCocina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCocinaActionPerformed(evt);
            }
        });
        add(btnCocina, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 60, 60));

        btnDormir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/cama-matrimonial_Apagada.png"))); // NOI18N
        btnDormir.setContentAreaFilled(false);
        btnDormir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDormir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/cama-matrimonial_Grande.png"))); // NOI18N
        btnDormir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/cama-matrimonial.png"))); // NOI18N
        btnDormir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnDormir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDormir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirActionPerformed(evt);
            }
        });
        add(btnDormir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 60, 60));

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/palanca-de-mando_Apagado.png"))); // NOI18N
        btnJugar.setContentAreaFilled(false);
        btnJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJugar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/palanca-de-mando_Grande.png"))); // NOI18N
        btnJugar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/palanca-de-mando.png"))); // NOI18N
        btnJugar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnJugar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 60, 60));

        btnCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/casa_Apagada.png"))); // NOI18N
        btnCasa.setContentAreaFilled(false);
        btnCasa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCasa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/casa_Grande.png"))); // NOI18N
        btnCasa.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/casa.png"))); // NOI18N
        btnCasa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCasa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasaActionPerformed(evt);
            }
        });
        add(btnCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 60, 60));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/salvado_Apagado.png"))); // NOI18N
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/salvado_Grande.png"))); // NOI18N
        btnGuardar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/salvado.png"))); // NOI18N
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 60, 60));

        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/carrito-de-compras_Apagado.png"))); // NOI18N
        btnComprar.setContentAreaFilled(false);
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/carrito-de-compras_Grande.png"))); // NOI18N
        btnComprar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/carrito-de-compras.png"))); // NOI18N
        btnComprar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnComprar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 60, 60));

        btnLogros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/trofeo_Apagado.png"))); // NOI18N
        btnLogros.setContentAreaFilled(false);
        btnLogros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogros.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/trofeo_Grande.png"))); // NOI18N
        btnLogros.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/trofeo.png"))); // NOI18N
        btnLogros.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnLogros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogrosActionPerformed(evt);
            }
        });
        add(btnLogros, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 60, 60));

        pbExperiencia.setToolTipText("");
        pbExperiencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(pbExperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 80, 10));

        lblNombreMascota.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        lblNombreMascota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        lblIconoMoneda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconoMoneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/dolar.png"))); // NOI18N
        add(lblIconoMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 40, 30));

        lblMonedas.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        lblMonedas.setForeground(new java.awt.Color(0, 0, 0));
        lblMonedas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMonedas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        add(lblMonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 80, 30));

        lvlIconoNivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/iconoNivel.png"))); // NOI18N
        add(lvlIconoNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 40, 30));

        lvlLetrasNivel.setForeground(new java.awt.Color(0, 0, 0));
        lvlLetrasNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvlLetrasNivel.setText("LVL");
        add(lvlLetrasNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lblNivel.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        lblNivel.setForeground(new java.awt.Color(0, 0, 0));
        lblNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        add(lblNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 50, 30));

        lblIconoExperiencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/experiencia.png"))); // NOI18N
        add(lblIconoExperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 30, -1));

        lblIconoVida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/corazon.png"))); // NOI18N
        add(lblIconoVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, 40));
        add(pbVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 180, 20));

        lblIconoHambre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/pollo.png"))); // NOI18N
        add(lblIconoHambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));
        add(pbHambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 180, 20));
        add(pbEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 190, 20));
        add(pbHigiene, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 190, 20));

        lblIconoHigiene.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/burbujas.png"))); // NOI18N
        add(lblIconoHigiene, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        lblIconoEnergia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos_Graficos/encendiendo.png"))); // NOI18N
        add(lblIconoEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 20, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBañoActionPerformed
        this.cambiarPanel(this.baño);
        //System.out.println(this.mascota.getHigiene());
    }//GEN-LAST:event_btnBañoActionPerformed

    private void btnCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCocinaActionPerformed
        this.cambiarPanel(this.cocina);
    }//GEN-LAST:event_btnCocinaActionPerformed

    private void btnDormirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirActionPerformed
        this.cambiarPanel(this.cuarto);
        //System.out.println(this.mascota.getEnergía());
    }//GEN-LAST:event_btnDormirActionPerformed

    private void btnCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasaActionPerformed
        this.timerPrincipal.stop();
        PanelMensaje pm = new PanelMensaje((JFrame) SwingUtilities.getWindowAncestor(this), true, "<html>¿QUIERES GUARDAR LA PARTIDA <br>ANTES DE SALIR?</html>", 1);
        pm.setVisible(true);
        int opcion = pm.getResultado();
        Pantalla_Principal pp = new Pantalla_Principal(this.pantallaP.getMus());
        //pp.getMus().stop();
        //this.pantallaP.getMus().stop();
        if (opcion == 0) {
            boolean seGuardo = this.guardarPartidaEnArchivo(this.mascota);
            if (seGuardo) {
                this.regresarPanel(pp.getJpPrincipal());
            }
        } else if (opcion == 1) {
            this.regresarPanel(pp.getJpPrincipal());
        } else {
            this.timerPrincipal.start();
        }
    }//GEN-LAST:event_btnCasaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean seGuardo = this.guardarPartidaEnArchivo(this.mascota);
        if (seGuardo) {
            PanelMensaje pm = new PanelMensaje((JFrame) SwingUtilities.getWindowAncestor(this), true, "<html>PARTIDA GUARDADA</html>", 3);
            pm.setVisible(true);
            //JOptionPane.showMessageDialog(this, "PARTIDA GUARDADA");
        } else {
            System.out.println("No se pudo guardar la partida");
            //JOptionPane.showMessageDialog(this, "NO SE PUDO GUARDAR LA PARTIDA");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        this.cambiarPanel(this.tienda);
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        this.cambiarPanel(this.juegos);
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnLogrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogrosActionPerformed
        this.cambiarPanel(this.logros);
    }//GEN-LAST:event_btnLogrosActionPerformed
    /*public Mascota obtenerMascota() {
        Mascota m = null;
        try {
            this.con.conectar();
            Connection cn = con.conectar();
            String sql = "select * from mascotas where nombre = '" + this.nombreMascota + "';";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String nombre = rs.getString("nombre");
                int nivel = rs.getInt("nivel");
                int vida = rs.getInt("vida");
                int energia = rs.getInt("energia");
                int hambre = rs.getInt("hambre");
                int higiene = rs.getInt("higiene");
                int dinero = rs.getInt("dinero");
                int exp = rs.getInt("exp");
                int cantPizzas = rs.getInt("cantPizzas");
                int cantHamburguesas = rs.getInt("cantHamburguesas");
                int cantSushis = rs.getInt("cantSushis");
                int cantPastillas = rs.getInt("cantPastillas");
                int cantJarabes = rs.getInt("cantJarabes");
                int cantSueros = rs.getInt("cantSueros");
                m = new Mascota(nombre, nivel, vida, energia, hambre, higiene, dinero, exp,
                        cantPizzas, cantHamburguesas, cantSushis, cantPastillas, cantJarabes,
                        cantSueros);
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener Partidas");
        }
        return m;
    }*/
    public Mascota obtenerMascotaDesdeArchivo(String nombreMascota) {
        Mascota mascota = null;

        try (BufferedReader reader = new BufferedReader(new FileReader("src/Archivos/mascotas.txt"))) {
            String linea;

            // Leer la primera línea (encabezado) y descartarla
            reader.readLine();

            // Leer las líneas restantes
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");

                if (partes.length >= 14 && partes[0].equalsIgnoreCase(nombreMascota)) {
                    // Leer y convertir los datos de la línea en variables
                    String nombre = partes[0];
                    int nivel = Integer.parseInt(partes[1]);
                    int vida = Integer.parseInt(partes[2]);
                    int energia = Integer.parseInt(partes[3]);
                    int hambre = Integer.parseInt(partes[4]);
                    int higiene = Integer.parseInt(partes[5]);
                    int dinero = Integer.parseInt(partes[6]);
                    int exp = Integer.parseInt(partes[7]);
                    int cantPizzas = Integer.parseInt(partes[8]);
                    int cantHamburguesas = Integer.parseInt(partes[9]);
                    int cantSushis = Integer.parseInt(partes[10]);
                    int cantPastillas = Integer.parseInt(partes[11]);
                    int cantJarabes = Integer.parseInt(partes[12]);
                    int cantSueros = Integer.parseInt(partes[13]);

                    // Crear la instancia de la mascota
                    mascota = new Mascota(nombre, nivel, vida, energia, hambre, higiene, dinero, exp,
                            cantPizzas, cantHamburguesas, cantSushis, cantPastillas, cantJarabes, cantSueros);
                    break; // Salir del bucle al encontrar la mascota
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de mascotas: " + e.getMessage());
        }

        return mascota;
    }

    public void mascotaMuerta() {
        timerPrincipal.stop();
        boolean seGuardo = this.guardarPartidaEnArchivo(this.mascota);
        boolean seActualizo = this.actualizarEstadoArchivos();
        if (seGuardo && seActualizo) {
            this.bloquearBotones();
            cambiarPanel(new Pantalla_Muerte());
        } else {
            System.out.println("HUBO UN ERROR AL MORIR");
        }
    }

    public void actualizarInterfaz() {
        this.lblNivel.setText(String.valueOf(this.mascota.getLevel()));
        this.lblMonedas.setText(String.valueOf(this.mascota.getDinero()));
        this.pbExperiencia.setMaximum(this.mascota.getLevel() * 10);
        this.pbExperiencia.setValue(this.mascota.getExp());
        this.pbVida.setValue(this.mascota.getVida());
        this.pbEnergia.setValue(this.mascota.getEnergía());
        this.pbHambre.setValue(this.mascota.getHambre());
        this.pbHigiene.setValue(this.mascota.getHigiene());
    }

    public void incrementarExperiencia(int expGanada) {
        int experienciaActual = this.pbExperiencia.getValue();
        int maxExperiencia = this.pbExperiencia.getMaximum();
        int nuevaExperiencia = experienciaActual + expGanada;
        if (nuevaExperiencia >= maxExperiencia) {
            // La experiencia ha alcanzado o superado el máximo, subir de nivel
            this.mascota.setLevel(this.mascota.getLevel() + 1);
            PanelMensaje pm = new PanelMensaje((JFrame) SwingUtilities.getWindowAncestor(this), true, "<html>¡FFELICIDES! <br> SUBISTE DE NIVEL</html>", 4);
            pm.setVisible(true);
            if (this.mascota.getLevel() == 2) {
                pm = new PanelMensaje((JFrame) SwingUtilities.getWindowAncestor(this), true, "<html>¡FFELICIDES! <br> CONSEGUISTE EL LOGRO NOVATO</html>", 3);
                pm.setVisible(true);
                this.insertarLogroMascotaEnArchivo("Novato", "Sube un nivel", "facil");
                this.logros.rellenarLogros();
            } else if (this.mascota.getLevel() == 10) {
                pm = new PanelMensaje((JFrame) SwingUtilities.getWindowAncestor(this), true, "<html>¡FFELICIDES! <br> CONSEGUISTE EL LOGRO DESCENTE</html>", 3);
                pm.setVisible(true);
                this.insertarLogroMascotaEnArchivo("Descente", "Sube 10 niveles", "medio");
                this.logros.rellenarLogros();
            } else if (this.mascota.getLevel() == 20) {
                pm = new PanelMensaje((JFrame) SwingUtilities.getWindowAncestor(this), true, "<html>¡FFELICIDES! <br> CONSEGUISTE EL LOGRO EXPERTO</html>", 3);
                pm.setVisible(true);
                this.insertarLogroMascotaEnArchivo("Experto", "Sube 20 niveles", "dificil");
                this.logros.rellenarLogros();
            }
            //JOptionPane.showMessageDialog(this, "!FELICIDADES¡\nSUBISTE DE NIVEL", "NIVEL+", 0, new ImageIcon("C:\\Users\\david\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto_Mascota\\src\\Elementos_Graficos\\elevar-a-mismo-nivel.png"));
            this.pbExperiencia.setValue(0);
            this.pbExperiencia.setMaximum(this.mascota.getLevel() * 10);
            // Calcular la nueva cantidad de experiencia después de subir de nivel
            nuevaExperiencia = nuevaExperiencia - maxExperiencia; // Exceso de experiencia
        }
        this.pbExperiencia.setValue(nuevaExperiencia);
        this.mascota.setExp(nuevaExperiencia);
        this.guardarPartidaEnArchivo(this.mascota);
        this.actualizarInterfaz();
    }

    public void incrementarDinero(int dinero) {
        this.mascota.setDinero(this.mascota.getDinero() + dinero);
        this.actualizarInterfaz();
    }

    public void disminuirDinero(int dinero) {
        if (dinero > this.mascota.getDinero()) {
            PanelMensaje pm = new PanelMensaje((JFrame) SwingUtilities.getWindowAncestor(this), true, "<html>NO TIENES SUFICIENTE DINERO <br> VE A JUGAR PARA OBTENER MAS</html>", 3);
            pm.setVisible(true);
            //JOptionPane.showMessageDialog(this, "NO TIENES SUFICIENTE DINERO");
        } else {
            this.mascota.setDinero(this.mascota.getDinero() - dinero);
            this.lblMonedas.setText(String.valueOf(this.mascota.getDinero()));
        }
    }

    public void actualizarBarrasCadaSegundo() {
        // Reducir cada barra de progreso por el porcentaje de reducción
        int tiempoEnergia = pbEnergia.getValue() - 1;
        pbEnergia.setValue(tiempoEnergia);
        mascota.setEnergía(tiempoEnergia);
        int tiempoHambre = pbHambre.getValue() - 1;
        pbHambre.setValue(tiempoHambre);
        mascota.setHambre(tiempoHambre);
        int tiempoHigiene = pbHigiene.getValue() - 1;
        pbHigiene.setValue(tiempoHigiene);
        mascota.setHigiene(tiempoHigiene);
        if (tiempoEnergia < 50 || tiempoHambre < 50 || tiempoHigiene < 50) {
            int tiempoVida = pbVida.getValue() - 2;
            pbVida.setValue(tiempoVida);
            mascota.setVida(tiempoVida);
        }
        actualizarInterfaz();
    }

    /*public boolean actualizarEstadoPartida() {
        try {
            Connection cc = this.con.conectar();
            PreparedStatement ps = null;
            String sql = "update partidas set estado = 'muerto' where mascota ='"
                    + this.mascota.getNombre() + "';";
            ps = cc.prepareStatement(sql);
            int n = ps.executeUpdate();
            if (n > 0) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            System.out.println("Hubo un error al cambiar estado de la partida");
            return false;
        }
    }*/
    
    public boolean actualizarEstadoArchivos(){
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Archivos/partidas.txt")); BufferedWriter writer = new BufferedWriter(new FileWriter("src/Archivos/partidas" + ".tmp"))) {

            String linea;
            boolean partidaActualizada = false;

            // Construir la línea de datos para la partida
            String lineaNueva = mascota.getNombre()
                    + ",muerto";

            // Leer el archivo línea por línea y actualizar la línea correspondiente a la mascota
            while ((linea = reader.readLine()) != null) {
                if (linea.toLowerCase().startsWith(mascota.getNombre().toLowerCase())) {
                    writer.write(lineaNueva);
                    writer.newLine(); // Agregar una nueva línea después de la partida actualizada
                    partidaActualizada = true;
                } else {
                    writer.write(linea);
                    writer.newLine(); // Copiar la línea original al archivo temporal
                }
            }

            // Si la partida fue actualizada correctamente, reemplazar el archivo original con el temporal
            if (partidaActualizada) {
                reader.close();
                writer.close();
                // Eliminar el archivo original
                if (!new File("src/Archivos/partidas.txt").delete()) {
                    System.err.println("Error al eliminar el archivo original.");
                    return false;
                }
                // Renombrar el archivo temporal como el archivo original
                if (!new File("src/Archivos/partidas" + ".tmp").renameTo(new File("src/Archivos/partidas.txt"))) {
                    System.err.println("Error al renombrar el archivo temporal.");
                    return false;
                }
                System.out.println("Partida actualizada en el archivo correctamente.");
                return true;
            } else {
                System.out.println("No se encontró la partida para actualizar en el archivo.");
                return false;
            }

        } catch (IOException e) {
            System.err.println("Error al actualizar la partida en el archivo: " + e.getMessage());
            return false;
        }
    }

    private void bloquearBotones() {
        this.btnBaño.setEnabled(false);
        this.btnCocina.setEnabled(false);
        this.btnComprar.setEnabled(false);
        this.btnDormir.setEnabled(false);
        this.btnJugar.setEnabled(false);
        this.btnGuardar.setEnabled(false);
        this.btnLogros.setEnabled(false);
    }

    /*public boolean guardarPartida() {
        try {
            Connection cc = this.con.conectar();
            PreparedStatement ps = null;
            String sql = "update mascotas " + " set nivel = '" + this.mascota.getLevel()
                    + "', vida = '" + this.mascota.getVida() + "', energia ='"
                    + this.mascota.getEnergía() + "', hambre ='" + this.mascota.getHambre()
                    + "', higiene = '" + this.mascota.getHigiene() + "', dinero = '" + mascota.getDinero()
                    + "', exp = '" + this.mascota.getExp() + "', cantPizzas ='" + this.mascota.getCantPizzas()
                    + "', cantHamburguesas='" + this.mascota.getCantHamburguesas() + "', cantSushis='"
                    + this.mascota.getCantSushis() + "', cantPastillas='" + this.mascota.getCantPastillas()
                    + "', cantJarabes='" + this.mascota.getCantJarabes() + "', cantSueros='"
                    + this.mascota.getCantSueros() + "' where nombre='" + this.mascota.getNombre() + "';";
            ps = cc.prepareStatement(sql);
            int n = ps.executeUpdate();
            if (n > 0) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            System.out.println("Hubo un error al guardar partida");
            return false;
        }
    }*/
    public boolean guardarPartidaEnArchivo(Mascota mascota) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Archivos/mascotas.txt")); BufferedWriter writer = new BufferedWriter(new FileWriter("src/Archivos/mascotas" + ".tmp"))) {

            String linea;
            boolean partidaActualizada = false;

            // Construir la línea de datos para la partida
            String lineaNueva = mascota.getNombre()
                    + "," + mascota.getLevel()
                    + "," + mascota.getVida()
                    + "," + mascota.getEnergía()
                    + "," + mascota.getHambre()
                    + "," + mascota.getHigiene()
                    + "," + mascota.getDinero()
                    + "," + mascota.getExp()
                    + "," + mascota.getCantPizzas()
                    + "," + mascota.getCantHamburguesas()
                    + "," + mascota.getCantSushis()
                    + "," + mascota.getCantPastillas()
                    + "," + mascota.getCantJarabes()
                    + "," + mascota.getCantSueros();

            // Leer el archivo línea por línea y actualizar la línea correspondiente a la mascota
            while ((linea = reader.readLine()) != null) {
                if (linea.toLowerCase().startsWith(mascota.getNombre().toLowerCase())) {
                    writer.write(lineaNueva);
                    writer.newLine(); // Agregar una nueva línea después de la partida actualizada
                    partidaActualizada = true;
                } else {
                    writer.write(linea);
                    writer.newLine(); // Copiar la línea original al archivo temporal
                }
            }

            // Si la partida fue actualizada correctamente, reemplazar el archivo original con el temporal
            if (partidaActualizada) {
                reader.close();
                writer.close();
                // Eliminar el archivo original
                if (!new File("src/Archivos/mascotas.txt").delete()) {
                    System.err.println("Error al eliminar el archivo original.");
                    return false;
                }
                // Renombrar el archivo temporal como el archivo original
                if (!new File("src/Archivos/mascotas" + ".tmp").renameTo(new File("src/Archivos/mascotas.txt"))) {
                    System.err.println("Error al renombrar el archivo temporal.");
                    return false;
                }
                System.out.println("Partida actualizada en el archivo correctamente.");
                return true;
            } else {
                System.out.println("No se encontró la partida para actualizar en el archivo.");
                return false;
            }

        } catch (IOException e) {
            System.err.println("Error al guardar la partida en el archivo: " + e.getMessage());
            return false;
        }
    }

    /*private boolean insertarLogroMascota(String logro, String descripcion, String dificultad) {
        try {
            Conexion con = new Conexion();
            Connection cn = con.conectar();
            String sql = "insert into logrospormascota( mascota,"
                    + "nombrelogro, descripcion,dificultad ) values (?,?,?,?)";
            PreparedStatement psd = cn.prepareStatement(sql);
            psd.setString(1, this.mascota.getNombre());
            psd.setString(2, logro);
            psd.setString(3, descripcion);
            psd.setString(4, dificultad);
            int n = psd.executeUpdate();
            if (n > 0) {
                System.out.println("Nuevo Logro Guardado");
                return true;
            }
            return false;
        } catch (SQLException ex) {
            System.out.println("Error al Guardar lOgro");
            return false;
        }
    }*/
    public boolean insertarLogroMascotaEnArchivo(String logro, String descripcion, String dificultad) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Archivos/logrospormascota.txt", true))) {
            // Construir la línea de datos del nuevo logro
            String linea = this.mascota.getNombre() + "," + logro + "," + descripcion + "," + dificultad;

            // Escribir la línea en el archivo
            writer.write(linea);
            writer.newLine(); // Agregar una nueva línea después de cada logro

            System.out.println("Nuevo Logro Guardado en el archivo.");
            return true;
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de logros: " + e.getMessage());
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaño;
    private javax.swing.JButton btnCasa;
    private javax.swing.JButton btnCocina;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnDormir;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnLogros;
    private javax.swing.JPanel jpCambiante;
    private javax.swing.JLabel lblFondoSala;
    private javax.swing.JLabel lblIconoEnergia;
    private javax.swing.JLabel lblIconoExperiencia;
    private javax.swing.JLabel lblIconoHambre;
    private javax.swing.JLabel lblIconoHigiene;
    private javax.swing.JLabel lblIconoMoneda;
    private javax.swing.JLabel lblIconoVida;
    private javax.swing.JLabel lblMonedas;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNombreMascota;
    private javax.swing.JLabel lblPerrito;
    private javax.swing.JLabel lvlIconoNivel;
    private javax.swing.JLabel lvlLetrasNivel;
    private javax.swing.JProgressBar pbEnergia;
    private javax.swing.JProgressBar pbExperiencia;
    private javax.swing.JProgressBar pbHambre;
    private javax.swing.JProgressBar pbHigiene;
    private javax.swing.JProgressBar pbVida;
    // End of variables declaration//GEN-END:variables
}
