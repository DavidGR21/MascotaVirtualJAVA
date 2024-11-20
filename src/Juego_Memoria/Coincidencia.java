package Juego_Memoria;

import javax.swing.JButton;

/**
 *
 * @author david
 */
public class Coincidencia {

    private int numeroBtn;
    private JButton btn;
    private int valorCoincidencia;

    public Coincidencia() {
    }

    public Coincidencia(int numberBtn, JButton btn, int valueMatch) {
        this.numeroBtn = numberBtn;
        this.btn = btn;
        this.valorCoincidencia = valueMatch;
    }

    public int getNumeroBtn() {
        return this.numeroBtn;
    }

    public void setNumeroBtn(int numeroBtn) {
        this.numeroBtn = numeroBtn;
    }

    public JButton getBtn() {
        return this.btn;
    }

    public void setBtn(JButton btn) {
        this.btn = btn;
    }

    public int getValorCoincidencia() {
        return this.valorCoincidencia;
    }

    public void setValorCoincidencia(int valorCoincidencia) {
        this.valorCoincidencia = valorCoincidencia;
    }


}
