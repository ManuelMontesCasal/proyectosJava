package GestorTareas;


public class TareaExistenteException extends Exception {

    //Metodo Constructor//

        public TareaExistenteException(){

            super("Estas intentando introducir una tarea en una posicion que ya tiene una tarea asignada.");

        }






}
