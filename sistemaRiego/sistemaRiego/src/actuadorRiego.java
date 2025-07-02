public class actuadorRiego {

/*Variables o atributos */

    private boolean activo;


/*Metodos para sincronizar */

    public synchronized void activar(){

        if(!activo){

            activo = true;

                System.out.println("Aspersores activados");

            }

        }

    
    public synchronized void desactivar(){

        if(activo){

            activo = false;

                System.out.println("Aspersores desactivados");

            }

        }

    }
