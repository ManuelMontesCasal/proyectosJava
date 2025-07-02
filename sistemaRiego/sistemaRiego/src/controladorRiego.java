public class controladorRiego {

/*Creamos un objeto de actuador de riego */

    actuadorRiego actuador = new actuadorRiego();


/*Metodo de sincronizacion de humedad */

    public synchronized void verificarHumedad(double humedad){

        if(humedad < 38){

            actuador.activar();

        } else if(humedad > 70){

            actuador.desactivar();

        }

    }

    public static void main(String[] args) {
        
        controladorRiego controlador = new controladorRiego();

        sensorHumedad sensor1 = new sensorHumedad(controlador);
        sensorHumedad sensor2 = new sensorHumedad(controlador);


            sensor1.start();
            sensor2.start();



                try {
                    
                      Thread.sleep(10000); //simular la duracion de la simulacion//
           
                         sensor1.interrupt();
                         sensor2.interrupt();
                         sensor1.join();
                         sensor2.join();
                
                } catch (InterruptedException e) {
                    
                        e.printStackTrace();

                }
    
                    System.out.println("Simulacion de riego terminada");
            }

        }
