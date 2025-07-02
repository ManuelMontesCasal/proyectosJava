public class controladorAeropuerto {

 /*Variables o atributos */

    private proceso checkIn;
    private proceso seguridad;
    private proceso embarque;
    private proceso controlTrafico;


/*Construtor /es */

    public controladorAeropuerto(){

        checkIn = new proceso("Check-in");
        seguridad = new proceso("Seguridad");
        embarque = new proceso("Embarque");
        controlTrafico = new proceso("Control del trafico aereo");

    }


/*Metodo iniciar proceso */

    public void iniciarProceso(){

        new Thread(() -> checkIn.iniciar()).start();    

        new Thread(()  -> seguridad.iniciar()).start();

        new Thread(() -> embarque.iniciar()).start();

        new Thread(() -> controlTrafico.iniciar()).start();

        

    }

/*metodo sincronizacion de procesos */

    public void sincronizacionProcesos(){

        checkIn.esperarEvento();

        seguridad.esperarEvento();

        embarque.esperarEvento();

        controlTrafico.esperarEvento();

    }


/*Finalizacion de proceso */

    public void finalizarProceso(){

        checkIn.detener();

        seguridad.detener();

        embarque.detener();

        controlTrafico.detener();

    }



}
