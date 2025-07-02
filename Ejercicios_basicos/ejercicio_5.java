import java.util.Scanner;

public class ejercicio_5 {
    
/*Haz una aplicación que calcule el área de un círculo(pi*R2). El 
radio se pedirá por teclado (recuerda pasar de String a double con 
Double.parseDouble). Usa la constante PI y el método pow de Math. */


    public static void main(String[] args) {
    
    /*Declaración de variables */
      
    double radio,area;
    double PI = 3.1416;

    /*Introducción de datos */

    Scanner sc = new Scanner (System.in);

    System.out.print("Dame un Radio  ");
        radio= sc.nextDouble();

        /*Calculo del area */

        area= PI* Math.pow(radio,2);

        /*Visualización del area */

        System.out.println("El area del circulo es igual a = "  + area);

      }

}
