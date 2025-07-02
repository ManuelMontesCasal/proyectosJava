import java.time.LocalDate;

public abstract class Servicios {

/* Variables o Atibutos */

    protected static String trabajador;
    protected LocalDate fechaInicio;
    protected String cliente;


/* Constructor/es */

    public Servicios( String trabajador, LocalDate fechaInicio, String cliente){

        this.trabajador = trabajador;

        this.fechaInicio = fechaInicio;

        this.cliente = cliente;
}

/* Metodos getter y setter */

    
    public String getTrabajador() {
        return trabajador;
    }


    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }


    public LocalDate getFechaInicio() {
        return fechaInicio;
    }


    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    public String getCliente() {
        return cliente;
    }


    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

/* Además, un servicio siempre debe tener programados los siguientes
métodos: */


    public abstract double costeMaterial(); /* Este método calculará el total gastado en material */

    public abstract double costeManoObra(); /* Este método calculará el total gastado en mano de obra. */

    public abstract double costeTotal(); /* Este método calculará el coste total del servicio. */

    public abstract String detalleServicio(); /* Este método devolverá una cadena con información detallada de lo que
    ha costado el Servicio */


}
