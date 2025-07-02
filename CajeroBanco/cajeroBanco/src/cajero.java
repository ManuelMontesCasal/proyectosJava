public class cajero extends Thread{

/*Variables o atributos */

    private cliente cliente;
    private long tiempoInicial;


/*Constructor */

    public cajero(String nombre, cliente cliente, long tiempoInicial){

        super(nombre);
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;

    }

/*Metodo run */

@Override
public void run(){

    System.out.println("El" + this.getName() + "comienza a procesar al cliente " + cliente.getNombre() + ", tiempo " + (System.currentTimeMillis()- tiempoInicial) /1000 + "segundos");

        for(int i = 0; i < cliente.getCantidad(); i++){

           esperarXsegundos(1);

        }

    System.out.println("El" + this.getName() + "ha terminado con el cliente :" +cliente.getNombre() + ", tiempo" + (System.currentTimeMillis()- tiempoInicial) /1000 + "seg");
   
   
    }

/*metodo esperar x segundos */

private void esperarXsegundos(int segundos) {
    try {
    Thread.sleep(segundos * 1000);
    } catch (InterruptedException ex) {
    Thread.currentThread().interrupt();
        }
    
    }
   
}
    






