
package ec.edu.espoch.miprimerprogramajava;

/**
 *
 * @author tatia
 */
public class CuartaPractica {
    public static void main(String[] args) {
        int[] calificaciones = new int [5];
        calificaciones[0]=10;
        calificaciones[4]=8;
        calificaciones[3]=7;
        
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("elemento "+i+": "+calificaciones[i]);
        }
    }
}
