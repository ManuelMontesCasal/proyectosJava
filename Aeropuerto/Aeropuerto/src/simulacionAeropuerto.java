public class simulacionAeropuerto {

public static void main(String[] args) {
    
/* creamos objeto de controlador aeropuerto */

    controladorAeropuerto controlador = new controladorAeropuerto();
    
    controlador.iniciarProceso();

        try {
            
            Thread.sleep(2000); // Simulamos tiempo de procesos

        } catch (InterruptedException e) {
            
            e.printStackTrace();
        
        }



        controlador.sincronizacionProcesos();


        try {
            
            Thread.sleep(2000); // Simulamos tiempo de procesos

        } catch (InterruptedException e) {
            
            e.printStackTrace();
        
        }



        controlador.finalizarProceso();

    }
}
