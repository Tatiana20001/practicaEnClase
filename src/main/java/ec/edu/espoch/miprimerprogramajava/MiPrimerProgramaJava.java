
package ec.edu.espoch.miprimerprogramajava;

public class MiPrimerProgramaJava {

    public static void main(String[] args) {
        Estudiantes  estudianteUno = new Estudiantes();
        estudianteUno.nombre = "Tatiana";
        estudianteUno.identificacion = 1729539096;
        estudianteUno.caificacionPromedio = 7.8;
        System.out.println("Nombre: " + estudianteUno.nombre);
        System.out.println("Identificacion: " + estudianteUno.identificacion);
        System.out.println("Promedio: " + estudianteUno.caificacionPromedio);
    }  
}
