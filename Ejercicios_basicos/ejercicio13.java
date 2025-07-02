import java.util.Scanner;

public class ejercicio13 {
    
public static void main(String[] args) {
 
    /*Introducción de variables */
 
    int numVentas , venta , totalVenta= 0;  
    
    /*Introducción de datos */
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el numero de ventas");
        numVentas = sc.nextInt();

        /*Bucle For */

        for(int i =1;i<=numVentas;i++){
            System.out.println("Introduce la venta " + i + ":");

            venta = sc.nextInt();

            totalVenta+=venta;

        }

        /*Visualización */
        System.out.println("La suma de todas las ventas es : " +totalVenta);
    }


}
