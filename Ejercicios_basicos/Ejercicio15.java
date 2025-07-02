import java.util.Scanner;

public class Ejercicio15 {
   /*Lee un número por teclado y comprueba que este numero es mayor o 
igual que cero, si no lo es lo volverá a pedir (do while), después 
muestra ese número por consola */ 
    public static void main(String[] args) {
     /*Declaramos las variables */   

     int PedirNumero;

     /*inicalizamos la introducción de datos */

        Scanner sc = new Scanner(System.in);

        /*DO-While */

        do{
            System.out.println("Dame un numero");
                PedirNumero = sc.nextInt();
                    if(PedirNumero<0){
                        System.out.println("Dame un numero");
                        PedirNumero = sc.nextInt();
                    }
            }while(PedirNumero>=0);


        /*Visualizamos */

      System.out.println("El numero que ha escogido es : " +PedirNumero);
    
    }




}
