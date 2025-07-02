import java.util.Scanner;

public class ejercicio7 {
/*Lee un número por teclado y muestra por consola, el carácter al que 
pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me 
muestre una a. */    
/**
 * @param args
 */
public static void main(String[] args) {
    /*Declaramos las variables */
    int numero;
    char caracter;

    /*Introducción de datos */

    Scanner sc = new Scanner(System.in);

    System.out.println(" Introduce un numero ");
        numero = sc.nextInt();
            /*Conversión */

            caracter = (char) numero;

          /*Visualización */

        System.out.println("el numero "+ numero+ "es equivalente al caracter ASCII = " +caracter);

    }


}
