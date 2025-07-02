import java.util.Scanner;

public class ejercicio_Prueba2 {
    
public static void main(String[] args) {
    /*Variables */

int acumulado =1;

 int numero,introduccion_numero, sumas =0;

   /*Introducción de datos */

   Scanner sc = new Scanner(System.in);
    System.out.println("Dime la cantidad de numeros que quieres sumar: " );
        introduccion_numero = sc.nextInt();

        /*Bucle While */

        while( acumulado<= introduccion_numero){
            System.out.println("Dame el numero " +acumulado);
            numero = sc.nextInt();
            acumulado++;
            sumas+=numero;
        }

            System.out.println("La suma de todos los numeros es : " +sumas);



    }



}
