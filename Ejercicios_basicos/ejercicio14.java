import java.util.Scanner;

public class ejercicio14 {
/*Realiza una aplicación que nos calcule una ecuación de segundo 
grado. Debes pedir las variables a, b y c por teclado y comprobar 
antes que el discriminante (operación en la raíz cuadrada). Para la 
raíz cuadrada usa el método sqlrt de Math. Te recomiendo que uses 
mensajes de traza */ 
public static void main(String[] args) {
    
    /*Variables*/

    int a,b,c;
    double x1,x2;
    double discriminante;
   double operacion_final;

    /*Introducción de datos */

    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el valor de a : ");
        a = sc.nextInt();
    System.out.print("Introduce el valor de b :");
        b = sc.nextInt();
     System.out.print("Introduce el valor de c :");   
        c= sc.nextInt();
    /*Calculamos el discrimante*/
        
        discriminante = Math.pow(b, 2) - 4 *a*c;

    /*condicionante */

        if(discriminante>0)
        {
            x1= ((b*(-1)) + Math.sqrt(discriminante)) / 2*a;
            x2= ((b*(-1)) - Math.sqrt(discriminante)) / 2*a;

            /*Visualizamos */
            System.out.println("Soluciones");
            System.out.println("El valor de X1 es = " + x1);
            System.out.println("El valor de X2 es = " + x2);
            
        }else
        {
            System.out.println("La ecuación no puede resolverse puesto que el discriminante es negativo.");

        }
    }
}





