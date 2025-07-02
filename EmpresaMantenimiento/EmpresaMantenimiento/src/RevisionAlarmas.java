import java.time.LocalDate;

public class RevisionAlarmas extends Servicios {

/* Variables o Atributos */

    protected int alarmasARevisar;

/* Construtor/ es */

    public RevisionAlarmas(LocalDate fechaRevision, String cliente, int numeroAlarmas){

        super("Revisor de alarmas de incendios",fechaRevision, cliente);

        this.alarmasARevisar = numeroAlarmas;

    }   

/* Metodos getter y setter */

     public int getAlarmasARevisar() {
        return alarmasARevisar;
    }

    public void setAlarmasARevisar(int alarmasARevisar) {
        this.alarmasARevisar = alarmasARevisar;
    }

/* Metodos sobreescritos */  
    
    @Override
    public double costeMaterial() {
        
        return 0;
    }

    @Override
    public double costeManoObra() {
        
       double alarmas = (alarmasARevisar /3) * 40;
       
        return alarmas;

}
    @Override
    public double costeTotal() {
       
        return costeManoObra();

    }

    @Override
    public String detalleServicio() {
      

String cadena = "REVISION PERIODICA DE ALARMAS CONTRA INCENCIOS \n";

        cadena += "Cliente :" + cliente + "\n";

        cadena += "Fecha de revision : " + fechaInicio + "\n";

        cadena += "Trabajador : Revisor de alarmas de incendios \n";

cadena += "-----------------------------------------------------------------\n";


        cadena += "Total............" + costeTotal() + "\n";


cadena += "------------------------------------------------------------------";
    
        
        return cadena;
    
    
    
    }



}
