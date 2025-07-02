public class proceso {

/*Variables o atributos */

    private String nombre;
    private String estado; // iniciar, ejecutando, esperando o listo//

/* Constructor */

    public proceso(String nombre){

        this.nombre = nombre;
        this.estado = "listo";

    }


/*Metodo iniciar */

    public void iniciar(){

        this.estado = "ejecutando";

        System.out.println(nombre + "Se esta ejecutando");
    
     }


/*Metodo esperarEvento */

    public void esperarEvento(){

        this.estado = "esperando";

        System.out.println(nombre + "Esta esperando");
        

    }


/*metodo continuarProceso*/


    public void continuarProceso(){

        this.estado = "ejecutando";

        System.out.println(nombre + "Continua ejecutandose ");


    }


/*Metodo detener */

    
    public void detener(){

        this.estado = "listo";

        System.out.println(nombre + "Ha terminado y esta listo");


    }

}
