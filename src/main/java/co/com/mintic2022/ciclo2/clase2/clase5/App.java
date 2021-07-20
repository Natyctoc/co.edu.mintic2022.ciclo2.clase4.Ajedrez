package co.com.mintic2022.ciclo2.clase2.clase5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        inicializarTablero();
    }

    private static void inicializarTablero() {
        Tablero t = new Tablero();
        t.ubicarFicha(0,0, new Torre(Color.BLANCO));
        t.ubicarFicha(0,7, new Torre(Color.BLANCO));
        t.ubicarFicha(0,1, new Caballo(Color.BLANCO));
        t.ubicarFicha(0,6, new Caballo(Color.BLANCO));
        t.ubicarFicha(0,2, new Alfil(Color.BLANCO));
        t.ubicarFicha(0,5, new Alfil(Color.BLANCO));
        t.ubicarFicha(0,3, new Rey(Color.BLANCO));
        t.ubicarFicha(0,4, new Reina(Color.BLANCO));
        for(int i = 0; i < 8; i++) {
            t.ubicarFicha(1, i, new Peon(Color.BLANCO));
        }

        t.ubicarFicha(7,0, new Torre(Color.NEGRO));
        t.ubicarFicha(7,7, new Torre(Color.NEGRO));
        t.ubicarFicha(7,1, new Caballo(Color.NEGRO));
        t.ubicarFicha(7,6, new Caballo(Color.NEGRO));
        t.ubicarFicha(7,2, new Alfil(Color.NEGRO));
        t.ubicarFicha(7,5, new Alfil(Color.NEGRO));
        t.ubicarFicha(7,3, new Rey(Color.NEGRO));
        t.ubicarFicha(7,4, new Reina(Color.NEGRO));
        for(int i = 0; i < 8; i++) {
            t.ubicarFicha(6, i, new Peon(Color.NEGRO));
        }
    }
}
