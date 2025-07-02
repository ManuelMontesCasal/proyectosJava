package GestorTareas;

public class PosicionVaciaException  extends Exception{

// Constructor//

    public PosicionVaciaException(){

        super("Estas intentando borrar una posicion que no tiene ninguna tarea asignada.");

    }


}
