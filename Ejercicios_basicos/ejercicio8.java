import java.util.Scanner;

public class ejercicio8 {
    /*Modifica el ejercicio anterior, para que en lugar de pedir un 
número, pida un carácter (char) y muestre su código en la tabla 
ASCII */
     public static void main(String[] args) {
    /*Declaración de variables */
    int numero;
    char caracter;

    /*Introducción de datos */

    Scanner sc = new Scanner(System.in);

    System.out.print(" Introduce un Caracter ");
        caracter = sc.next().charAt(0);
            
        /*Conversión */

        numero = (int) caracter;

          /*Visualización */

        System.out.println("el Caracter "+ caracter+ "es equivalente al caracter ASCII = " +numero);









    }

}
