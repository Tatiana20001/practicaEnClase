
package ec.edu.espoch.miprimerprogramajava;

public class MiPrimerProgramaJava {

    public static void main(String[] args) {
        
        /*byte edad=19;
        String nombre="Taty";
        String ciudad="Sacha";
        System.out.println("Tengo "+edad+", me llamo "+nombre+" y vivo en el "+ciudad);
        byte numUno=2;
        byte numDos=2;
        int resultado=numUno+numDos;
        System.out.println("SUMA DE DOS NUMEROS");
        System.out.println("Numero uno: "+numUno);
        System.out.println("Numero dos: "+numDos);
        System.out.println("Respuesta: "+resultado);*/
        byte edad=37;
        if(edad>=0 && edad<=1)
        {
            System.out.println("Eres un bebe");
        }
        else if(edad>=2 && edad <=11)
        {
            System.out.println("Eres un niño");
        }
        else if(edad>=12 && edad <=17)
        {
            System.out.println("Eres un adolescente");
        }
        else if(edad>=18 && edad <=35)
        {
            System.out.println("Eres joven");
        }
        else if(edad>=36 && edad <=64)
        {
            System.out.println("Eres un adulto");
        }
        else if(edad>=65 && edad<=120)
        {
            System.out.println("Eres un adulto mayor");
        }
        else
        {
            System.out.println("Edad invalida");
        }
    }
}
