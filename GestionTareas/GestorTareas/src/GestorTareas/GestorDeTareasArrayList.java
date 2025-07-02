package GestorTareas;

import java.util.ArrayList;

public class GestorDeTareasArrayList {

// Varibles o Atributos//

    private ArrayList<String> GestorTareas;
    private String nombre;


// Metodo Constuctor/es//

    public GestorDeTareasArrayList( String NombreLibroTareas, int NumeroTareas){

        nombre = NombreLibroTareas;   
        GestorTareas = new ArrayList<>();

            for(int i = 0; i<NumeroTareas; i++){

                GestorTareas.add("");
            }

}

//Metodos crear, eliminar y mostrar tareas//


        //1.Metodo crear tarea//

           
            
            public void CrearTarea(int Posicion, String Tarea) throws TareaExistenteException{

                // Control de Excepciones//

                if(GestorTareas.contains(Tarea)){

                    throw new TareaExistenteException();
                }
                
                
                //Implementación del metodo CrearTarea//

                        GestorTareas.set(Posicion,Tarea);
                }



        //2.Metodo Borrar Tarea//

       
            
            public void BorrarTarea(int Posicion) throws PosicionVaciaException{

                //Control de excepciones//   
                
                if(GestorTareas.get(Posicion)==""){

                    throw new PosicionVaciaException();
               
                }

                //Implementacion del metodo//
                   
                   GestorTareas.set(Posicion, "");

            }
            
             public void Salir(){

                System.out.println("Hasta luego.");

             }


             @Override
             public String toString() {
                
            String Cadena = nombre.toUpperCase()+"\n";
        Cadena += "--------------------------------------------------\n";

                for(int i = 0; i<GestorTareas.size();i++){

                    Cadena += "Tarea " + i + " : ";
                    Cadena += (GestorTareas.get(i)=="") ? " TAREA VACIA" : GestorTareas.get(i);
                    Cadena += "\n";
                }

                Cadena +="----------------------------------------------";
            
                    return Cadena;
            }

        }
