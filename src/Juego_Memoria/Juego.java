package Juego_Memoria;

import Juegos.Juego_Memoria;
import Vista.PanelMensaje;
import Vista.Pantalla_Juego;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Juego {

    private List<Coincidencia> coincidencia = new ArrayList<>();
    private List<Coincidencia> coincidenciaCorrecta = new ArrayList<>();
    private Juego_Memoria juego;
    private Pantalla_Juego juegoPrincipal;

    public Juego(Juego_Memoria j, Pantalla_Juego ju) {
        this.juego = j;
        this.juegoPrincipal = ju;
    }

    //METODO DONDE SE CARGAR NUMEROS RAMDON EN FILA
    public static List<Integer> filasTabla() {
        List<Integer> lista = new ArrayList<>();
        Random r = new Random();
        int cont = 1;
        for (int i = 0; i < cont; i++) {
            if (lista.size() != 4) {
                cont++;
            }
            int valor = r.nextInt(5);
            if (!lista.contains(valor) && lista.size() != 5 && valor != 0) {
                lista.add(valor);
            }
        }
        return lista;
    }

    //METODO PARA INGRESAR LAS DOS FILAS
    public static List<Integer> todasFilasTabla() {
        List<Integer> todo = new ArrayList<>();
        todo.addAll(filasTabla());
        todo.addAll(filasTabla());
        return todo;
    }

    //METODO PARA PINTAR LAS IMAGENES
    public void asignarImagenBtn(JButton btn, int value) {
        try {
            btn.setIcon(new ImageIcon(getClass().getResource("/Elementos_Graficos/0" + value + ".png")));
            btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            btn.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //METODO QUE INICIALIZA LAS IMAGENES EN ?
    public void imgStart() {
        asignarImagenBtn(this.juego.getBtn01(), 5);
        asignarImagenBtn(this.juego.getBtn02(), 5);
        asignarImagenBtn(this.juego.getBtn03(), 5);
        asignarImagenBtn(this.juego.getBtn04(), 5);
        asignarImagenBtn(this.juego.getBtn05(), 5);
        asignarImagenBtn(this.juego.getBtn06(), 5);
        asignarImagenBtn(this.juego.getBtn07(), 5);
        asignarImagenBtn(this.juego.getBtn08(), 5);
    }

    //METODO PARA CUANDO LOS DOS VALORES SEAN IGUALES 
    public void pintarCoincidencia() {
        System.out.println(getMatch().size());
        if (getMatch().size() == 1) {
            asignarImagenBtn(getMatch().get(0).getBtn(), getMatch().get(0).getValorCoincidencia());
        } else if (getMatch().size() == 2) {
            asignarImagenBtn(getMatch().get(1).getBtn(), getMatch().get(1).getValorCoincidencia());
        }
    }

    //METODO DONDE LAS IMAGENES YA HICIERON MATCH
    public void imgStartMatch() {
        if (coincidenciaCorrecta.size() == 8) {
            Random r = new Random();
            int valor = r.nextInt(15) + 10;
            this.juegoPrincipal.incrementarDinero(valor);
            //JOptionPane.showMessageDialog(null, "<html>Ganaste el Juego, y obtendras " + valor + " monedas</html>");
            PanelMensaje pm = new PanelMensaje((JFrame) SwingUtilities.getWindowAncestor(juegoPrincipal), true, "<html>GANASTE EL JUEGO, OBTENDRAS: <br>" + valor + " monedas</html>", 3);
            pm.setVisible(true);
            this.juegoPrincipal.incrementarExperiencia(12);
            this.juego.setSiguiente(this.todasFilasTabla());
            for (int i = 0; i < coincidenciaCorrecta.size(); i++) {
                //asignarImagenBtn(coincidenciaCorrecta.get(i).getBtn(), coincidenciaCorrecta.get(i).getValorCoincidencia());
                coincidenciaCorrecta.get(i).getBtn().setEnabled(true);
            }
            coincidenciaCorrecta.clear();
            imgStart();
            this.juegoPrincipal.cambiarPanel(this.juegoPrincipal.getJuegos());
        }
        for (int i = 0; i < coincidenciaCorrecta.size(); i++) {
            //System.out.println(coincidenciaCorrecta.get(i).getNumeroBtn() + "_" + coincidenciaCorrecta.get(i).getValorCoincidencia());
            asignarImagenBtn(coincidenciaCorrecta.get(i).getBtn(), coincidenciaCorrecta.get(i).getValorCoincidencia());
            coincidenciaCorrecta.get(i).getBtn().setEnabled(false);
        }
    }

    //METODO QUE CONTROLA LA EJECUCION
    public void reset() {
        imgStart();
        imgStartMatch();
    }

    //METODO DE MATCH
    public void coincidir() {
        if (getMatch().size() == 2) {
            if (getMatch().get(0).getNumeroBtn() != 0 && getMatch().get(1).getNumeroBtn() != 0) {

                if (getMatch().get(0).getValorCoincidencia() == getMatch().get(1).getValorCoincidencia()) {
                    coincidenciaCorrecta.add(getMatch().get(0));
                    coincidenciaCorrecta.add(getMatch().get(1));
                    getMatch().clear();
                    reset();

                } else {
                    Runnable mx = new Runnable() {
                        @Override
                        public void run() {
                            getMatch().clear();
                            reset();
                        }
                    };
                    setTimeout(mx, 1500);
                }
            }
        }
    }

    public void setTimeout(Runnable runnable, int delay) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            } catch (Exception e) {
                System.err.println(e);
            }
        }).start();
    }

    public List<Coincidencia> getMatch() {
        return this.coincidencia;
    }

    public void setMatch(List<Coincidencia> match) {
        this.coincidencia = match;
    }
}
