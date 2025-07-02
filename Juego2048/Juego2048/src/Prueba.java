import java.util.Scanner;

public class Prueba {

public static void main(String[] args) {
    

/* Variables o atributos */

    int menu;
    int opcion;
    
 /* Creamos un objeto de la clase Tablero para inicializar la matriz */   
    
    Tablero tablero = new Tablero();

/* Usaremos la clase Scanner para pedir valores por teclado para decidir que accion queremos hacer con nuestro menu */

    Scanner sc = new Scanner(System.in);

      
 /* Crearemos un menu usando un DO-WHile y un Switch-case */
 
 
    do {
     
        System.out.println("Bienvenido al juego del 2048");

            System.out.println("Escoge donde quieres mover las fichas del tablero");

            System.out.println("1--> Mover hacia arriba");
            System.out.println("2--> Mover hacia abajo");
            System.out.println("3--> Mover hacia la izquierda");
            System.out.println("4--> Mover hacia la derecha");
            System.out.println("5--> Mostrar el tablero");
            System.out.println("6--> Salir del juego");


            menu = sc.nextInt();



            switch (menu) {
                case 1 :
                try{    
                System.out.println("introduce la columna que quieres mover hacia arriba");
                    opcion = sc.nextInt();
                        tablero.moverArribaYSumarColumna(opcion);
                           tablero.ingresarDos();
                
                }catch(ArrayIndexOutOfBoundsException e){

                    System.out.println("Esa opcion esta fuera del rango de la matriz");
                }
                    
                break;


                case 2: 

                System.out.println("Introduce la columna que quieres mover hacia abajo");
                    opcion = sc.nextInt();
                        tablero.moverAbajoYSUmarColumna(opcion);
                            tablero.ingresarDos();
            
                    break;
               

                case 3:

                System.out.println("Introduce la fila que quieres mover hacia la izquierda");
                    opcion = sc.nextInt();
                        tablero.moverIzquierdaYSumarfila(opcion);
                            tablero.ingresarDos();

                    break;


                case 4: 

                System.out.println("Introduce la fila que quieres mover hacia la derecha");
                    opcion = sc.nextInt();
                        tablero.moverDerechaYSumarFilas(opcion);
                            tablero.ingresarDos();

                    break;

                case 5:

                    tablero.Mostrar();

                    break;
                        
                case 6: 
                
                    System.out.println("Hasta pronto");
                    
                default:

                        System.out.println("La opcion seleccionada no esta disponible. Por favor, introduce una de las opciones validas.");

                    break;
            }

            } while (menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5 || menu == 6);
      
            sc.close();
    
        }
    }