package Objetos;

public class Mascota {

    private String nombre;
    private int level;
    private int vida;
    private int energía;
    private int hambre;
    private int higiene;
    private int dinero;
    private int exp;
    private int cantPizzas;
    private int cantHamburguesas;
    private int cantSushis;
    private int cantPastillas;
    private int cantJarabes;
    private int cantSueros;

    public Mascota(String nombre, int level, int vida, int energía, int hambre, int higiene, int dinero, int exp, int cantPizzas, int cantHamburguesas, int cantSushis, int cantPastillas, int cantJarabes, int cantSueros) {
        this.nombre = nombre;
        this.level = level;
        this.vida = vida;
        this.energía = energía;
        this.hambre = hambre;
        this.higiene = higiene;
        this.dinero = dinero;
        this.exp = exp;
        this.cantPizzas = cantPizzas;
        this.cantHamburguesas = cantHamburguesas;
        this.cantSushis = cantSushis;
        this.cantPastillas = cantPastillas;
        this.cantJarabes = cantJarabes;
        this.cantSueros = cantSueros;
    }

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.level = 1;
        this.vida = 100;
        this.energía = 100;
        this.hambre = 100;
        this.higiene = 100;
        this.dinero = 0;
        this.exp = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergía() {
        return this.energía;
    }

    public void setEnergía(int energía) {
        this.energía = energía;
    }

    public int getHambre() {
        return this.hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public int getHigiene() {
        return this.higiene;
    }

    public void setHigiene(int higiene) {
        this.higiene = higiene;
    }

    public int getDinero() {
        return this.dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getExp() {
        return this.exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getCantPizzas() {
        return this.cantPizzas;
    }

    public void setCantPizzas(int cantPizzas) {
        this.cantPizzas = cantPizzas;
    }

    public int getCantHamburguesas() {
        return this.cantHamburguesas;
    }

    public void setCantHamburguesas(int cantHamburguesas) {
        this.cantHamburguesas = cantHamburguesas;
    }

    public int getCantSushis() {
        return this.cantSushis;
    }

    public void setCantSushis(int cantSushis) {
        this.cantSushis = cantSushis;
    }

    public int getCantPastillas() {
        return this.cantPastillas;
    }

    public void setCantPastillas(int cantPastillas) {
        this.cantPastillas = cantPastillas;
    }

    public int getCantJarabes() {
        return this.cantJarabes;
    }

    public void setCantJarabes(int cantJarabes) {
        this.cantJarabes = cantJarabes;
    }

    public int getCantSueros() {
        return this.cantSueros;
    }

    public void setCantSueros(int cantSueros) {
        this.cantSueros = cantSueros;
    }

}
