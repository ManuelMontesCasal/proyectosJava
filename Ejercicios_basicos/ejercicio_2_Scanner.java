import java.util.Scanner;

public class ejercicio_2_Scanner {
  /*  Declara 2 variables numéricas (con el valor que desees), he indica 
    cual es mayor de los dos. Si son iguales indicarlo también. Ves 
    cambiando los valores para comprobar que funciona  */  
    

/**
 * @param args
 */
public static void main(String[] args) {
    
    /*Declaramos las variables */
    int num_1,num_2;

    /*Introducciòn de datos */

    Scanner sc = new Scanner(System.in);

      System.out.println("Introduce un numero: ");
      num_1= sc.nextInt();

      System.out.println("Introduce otro numero: ");
      num_2= sc.nextInt();

      /*Calculo de datos y visualización */
       if (num_1>num_2)
      {
        System.out.println("El numero" + num_1 + "es mayor que" + num_2);
      }
      else{
        if(num_2>num_1)
        {
          System.out.println("El numero" + num_2 + "es mayor que" +num_1);
        }
        else{
          System.out.println("Los numeros son iguales");
        }
      }
}









}
