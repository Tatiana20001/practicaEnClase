
package ec.edu.espoch.miprimerprogramajava;

/**
 *
 * @author tatia
 */
import java.util.Scanner;
public class TerceraPractica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("CALCULADORA BASICA");
        System.out.println("Ingrese el primer numero: ");
        int n1=sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2=sc.nextInt();
        
        System.out.println("Elija su opcion: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        int opcion = sc.nextInt();
        do{
        switch(opcion){
            case 1:
                System.out.println("La suma de los dos numeros es "+(n1+n2));
                break;
            case 2: 
                System.out.println("La resta de los dos numeros es "+(n1-n2));
                break;
            case 3: 
                System.out.println("La multiplicacion de los dos numeros es "+(n1*n2));
                break;
            case 4: 
                if(n2==0){
                    System.out.println("No se puede dividir un numero entre 0");
                }else{
                    System.out.println("La division de los dos numeros es "+(n1/n2)); 
                }
                break;
            case 5:
                System.out.println("Saliendo del programa ");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
            }
        }while(opcion!=5);
        
    
        /*System.out.println("Ingrese la tabla que desea: ");
        int tabla=sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabla+" x "+i+": "+(tabla*i));   
        }*/
        /*int multiplicando=4;
        int cont=1;
        while(cont<10){
            System.out.println("multiplicando "+cont);
            cont=cont+1;
        }*/
    }
}

