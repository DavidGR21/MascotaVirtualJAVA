package Objetos;

public class Comida {
    private String nombre;
    private int cantRecupera;

    public Comida(String nombre, int cantRecupera) {
        this.nombre = nombre;
        this.cantRecupera = cantRecupera;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantRecupera() {
        return this.cantRecupera;
    }

    public void setCantRecupera(int cantRecupera) {
        this.cantRecupera = cantRecupera;
    }
    
    
}
