public class ejercicio_1 {
    //1 Declara dos variables numéricas (con el valor que desees), muestra //
    //por consola la suma, resta, multiplicación, división y módulo (resto //
    //de la división)//
/**
 * @param args
 */
public static void main(String[] args) {
    
//Entrada de datos

int num_1 = 10;
int num_2 = 5;

//Resultados

int sumar = num_1 + num_2;
int resta = num_1 - num_2;
int multiplicacion = num_1 * num_2;
int division = num_1 /num_2;
int resto = num_1 %num_2;

//Visualizacion


System.out.println("la suma es=" +sumar);
System.out.println("la resta es=" +resta);
System.out.println("la multiplicación es=" +multiplicacion);
System.out.println("la división es=" +division);
System.out.println("el resto es=" +resto);
}

}