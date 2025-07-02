public class semaforo extends Thread {

/*Variables o atributos */

    private String estado; //Estados posibles : Rojo, Amarillo o Verde//


/*Constructor /es */

    public semaforo(){

        this.estado = "Rojo"; //estado inicial//

    }

/*Metodos sincronizar */

    public synchronized void cambiarEstado(String nuevoEstado){

        this.estado = nuevoEstado;

            System.out.println("Semaforo cambia a " + estado);

        notify(); //notificar a cualquier hilo esperando el cambio de estado//

    }


    public synchronized String getEstado(){


        return estado;

    }


/*Metodo run */

    @Override
    public void run(){

        try {
            

                while (!Thread.interrupted()) {
            
                    synchronized(this){

                        while (estado.equals("verde") || estado.equals("Amarillo")) {
                            
                       
                            Thread.sleep(5000); // mantenemos el estado de verde o amarillo 5 segundos
                            cambiarEstado("Rojo");
                        }

                        while(estado.equals("Rojo")){

                            wait(); //Esperamos hasta que se solicite cambiar a verde//

                        }

                    }
                
                }

            } catch (InterruptedException e) {
                System.out.println("Semaforo interrumpido");
        }

    }

}
