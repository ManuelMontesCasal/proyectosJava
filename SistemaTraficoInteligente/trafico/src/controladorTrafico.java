public class controladorTrafico {

/*Variables o propiedades */

    private semaforo semaforo;


/*Constructor/ es */

    public controladorTrafico(){

        this.semaforo = new semaforo();


    }


/*Metodo cambioSemaforo */


    public void SolicitudCambiarSemaforo(){

        if(semaforo.getEstado().equals("Rojo")){

            semaforo.cambiarEstado("Verde");

        }

    }


/*Metodo iniciarControl */


    public void iniciarControl(){

        semaforo.start();

        new sensorVehiculo(this).start();


    }



    public static void main(String[] args) {
        
        controladorTrafico controlador = new controladorTrafico();

        controlador.iniciarControl();
    
    }
}
