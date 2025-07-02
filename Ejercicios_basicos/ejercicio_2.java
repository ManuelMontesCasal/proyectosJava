public class ejercicio_2 {
   /*  Declara 2 variables numéricas (con el valor que desees), he indica 
    cual es mayor de los dos. Si son iguales indicarlo también. Ves 
    cambiando los valores para comprobar que funciona  */
     public static void main(String[] args) {
       
     //Declaración de variables//

    int valor_1 = 4;
    int valor_2 = 8;

    // utilizamos condicionante if para saber cual es mayor de los 2

    if (valor_1> valor_2)
        {
         System.out.println("el" +valor_1+ "es mayor que" +valor_2);
        } else{
            if (valor_2<valor_1) 
            {
          System.out.println("elvalor"+ valor_2 +"es mayor que"+ valor_1);
            } else{
             System.out.println("Los numeros son iguales");

            }
          }

    }
}