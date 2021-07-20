package co.com.mintic2022.ciclo2.clase2.clase5;

public class Tablero implements Dibujable {

    private Casilla[] casillas;

    public Tablero() {
        casillas = new Casilla[64];
        for (int i = 0; i < casillas.length; i++) {
            casillas[i] = new Casilla(i / 8, i % 8);
            System.out.println(i + ": " + casillas[i]);
        }
    }

    public void ubicarFicha(Integer fila,Integer columna, Ficha ficha) {
        casillas[8 * fila + columna].ubicarFicha(ficha);
    }

    public Boolean enroque() {
        return null;
    }

    public Boolean jaque() {
        return null;
    }

    public Boolean jaqueMate() {
        return null;
    }

    @Override
    public void mostrar() {
    }

    @Override
    public void posicionar(Integer x, Integer y) {
    }
}
