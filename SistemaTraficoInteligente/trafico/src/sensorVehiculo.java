public class sensorVehiculo extends Thread {

/*Variables o atributos */

    private controladorTrafico controlador;

/*Contructor/ es */


    public sensorVehiculo(controladorTrafico controlador){


        this.controlador = controlador;

    }


/*Metodo run */
    @Override
    public void run(){

    try {
        
        while (!Thread.interrupted()) {
            
            Thread.sleep((int) (Math.random() * 5000 + 1000)); //simula deteccion aleatoria de vehiculos//
            System.out.println("Vehiculo detectado");
            controlador.SolicitudCambiarSemaforo();
        
        }
     } catch (InterruptedException e) {
            System.out.println("Sensor de vehiculos interrumpido");
    
    }

    }

}
