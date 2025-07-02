import java.util.Scanner;

public class ejercicio6 {
  /*Lee un número por teclado e indica si es divisible entre 2 (resto 
= 0). Si no lo es, también debemos indicarlo */  
public static void main(String[] args) {
    
/*Declaración de variables */

int numero_prueba;

/*introducción de datos */

Scanner sc = new Scanner(System.in);

System.out.println("Dame un numero ");
numero_prueba = sc.nextInt();

/*Condición */

if(numero_prueba%2==0){

    System.out.println("El numero " + numero_prueba + " es divisible de 2  ");
}else{

    System.out.println("El numero " + numero_prueba + " no es divisible de 2  ");
}

  }


}
