public class sensorHumedad extends Thread {

/*Variables o propiedades */

    private double humedad;
    private controladorRiego controlador;

/*Metodo constructor */

    public sensorHumedad(controladorRiego controlador){

        this.controlador = controlador;

        this.humedad = Math.random() *100;

    }


/*Metodo run */
    @Override
    public void run(){

        try {
            
          while (!isInterrupted()) {
            
              Thread.sleep(10000); //simula la lectura de humedad cada segundo//
              this.humedad = Math.random() *100; //simula un cambio en la humedad//
                System.out.println("El nivel de humedad es " + humedad + "%");
                    controlador.verificarHumedad(humedad);
    
         }
             } catch (InterruptedException e) {
          
                System.out.println("Sensor de humedad interrumpido"); 

            }

        }

    }
