import java.util.Scanner;

public class ejercicio9 {
 /*Lee un número por teclado que pida el precio de un producto (puede 
tener decimales) y calcule el precio final con IVA. El IVA sera una 
constante que sera del 21% */   
public static void main(String[] args) {
    
    /*Declaración de variables */

    double precio_de_producto,precio_final;
    double IVA = 0.21;

    /*Introducción de datos */

    Scanner sc = new Scanner(System.in);

    System.out.println(" Dame el precio de X producto ");
        precio_de_producto = sc.nextDouble();

        /*Calculo y visualización */

        precio_final = precio_de_producto *(1+IVA);

        System.out.println("El precio final del producto es "+ precio_final );







    }


}
