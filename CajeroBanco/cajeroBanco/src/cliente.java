public class cliente {


/*Variables o propiedades */

    private String nombre;
    private int cantidad;


/*Constructor/ es */


    public cliente(String nombre, int cantidad){

        this.nombre = nombre;
        this.cantidad = cantidad;

    }

/*metodos getters */
   
   
    public String getNombre() {
        return nombre;
    }


    public int getCantidad() {
        return cantidad;
    }

}
