package GestorTareas;

import java.util.Scanner;

public class Principal {

     public static void main(String[] args) {
        
     //Variables o Atributos y clase Scanner//

        int menu;
        int Posicion;
        String Tarea;
        
     

        Scanner sc = new Scanner(System.in);
    
     

    //Crearemos un objeto de la clase Gestor de Tareas//

    GestorDeTareasArrayList LibroTareas = new GestorDeTareasArrayList("Mis Tareas", 5);

   //Crearemos un menu//


       do{

            System.out.println("1--Crear Tarea");
            System.out.println("2--Borrar Tarea");
            System.out.println("3--Mostrar lista de Tareas");
            System.out.println("4--Salir");

            menu = sc.nextInt();
            
            switch (menu) {
                case 1:
           
         try {
               
                System.out.println("Introduce la posicion donde almacenar tu tarea");
                    Posicion = sc.nextInt();

                System.out.println("Introduce la nota que quieres almacenar");
                   sc.nextLine(); 
                     Tarea = sc.nextLine();

                  LibroTareas.CrearTarea(Posicion,Tarea);
            
        } catch (TareaExistenteException e) {
                   
                    System.out.println(e.getMessage());
            
                } catch (IndexOutOfBoundsException e){

                    System.out.println("Esa posicion no existe. Intentelo de nuevo.");

                }         
                
            break;
            
                case 2:
                try {
                    
                System.out.println("Introduce la posicion de la tarea que deseas eliminar");

                    Posicion = sc.nextInt();
                    
                    LibroTareas.BorrarTarea(Posicion);
                
                } catch (PosicionVaciaException e) {
                   
                     System.out.println(e.getMessage());
               }  catch (IndexOutOfBoundsException e){

                    System.out.println("La posicion seleccionada no existe. Pruebe otra vez.");
               }
              
             break;

                case 3:

               System.out.println(LibroTareas.toString());

            break;

            case 4:

                LibroTareas.Salir();
            
            
            default:
              
            
            System.out.println("Estas introduciendo una opcion erronea. Por favor, vuelve a intentarlo.");
            
        break;
            }

         }while( menu != 5);


            sc.close();


        }

   
   
    }







   