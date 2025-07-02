import java.util.Scanner;

public class ejercicio4_Scanner {
/* Modifica la aplicación anterior, para que nos pida el nombre que 
queremos introducir. */  

public static void main(String[] args) {
 /*Introducción del String */   
    String nombre,apellido;

    /*Introducción de datos */

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce tu nombre:");
        nombre = sc.nextLine();
    System.out.print("introduce tu Apellido:");
        apellido = sc.nextLine();
        
        /*Visualización */

        System.out.println("Bienvenido " + nombre +" "+ apellido );
    




}

}
