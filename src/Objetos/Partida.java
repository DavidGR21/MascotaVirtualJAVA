package Objetos;

public class Partida {

    private String mascota;
    private String estado;

    public Partida(String mascotas, String estado) {
        this.mascota = mascotas;
        this.estado = estado;
    }

    public String getMascotas() {
        return this.mascota;
    }

    public void setMascota(String mascotas) {
        this.mascota = mascotas;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
