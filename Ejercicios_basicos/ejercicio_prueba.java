import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ejercicio_prueba {
    
public static void main(String[] args) {
    
/*Variables */

int acumulador, numeros,introduccion_numeros, suma =0;

/*Introducción de datos */

    Scanner sc = new Scanner(System.in);
        System.out.println("Dime la cantidad de numeros que quieres sumar : ");
        introduccion_numeros = sc.nextInt();

    /*Bucle For */

    for(acumulador=1;acumulador<=introduccion_numeros;acumulador++){
        System.out.println("Dame el numero " +acumulador);
        numeros= sc.nextInt();
        suma+= numeros;

        }
            System.out.println("La suma de todos los numeros es : " +suma);

    }



}
