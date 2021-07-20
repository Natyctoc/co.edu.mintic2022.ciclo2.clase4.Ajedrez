package co.com.mintic2022.ciclo2.clase2.clase5;

public abstract class Ficha implements Dibujable, ElementoMovil {

    private Casilla casilla;

    private final Color color;

    public Ficha(Color color) {
        this.color = color;
    }

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    public Boolean capturar() {
        //si en la casilla a la que se mueve
        //se encuentra una ficha del contrincante
        //captura la ficha reemplazandola en la casilla
        return null;
    }

    @Override
    public String toString() {
        return "Ficha [color=" + color + "]";
    }
}
