
package ec.edu.espoch.miprimerprogramajava;

/**
 *
 * @author tatia
 */
import java.util.Scanner;
public class SegundaPractica {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el año actual: ");
        int anioac = sc.nextInt();
        System.out.println("Ingrese su año de nacimiento: ");
        int anio = sc.nextInt();
        System.out.println("Usted tiene "+(anio-anioac)+" años");
    }
}
