import java.time.LocalDate;

public class TrabajoPintura  extends Servicios{

/* Propiedades y atributos */

    protected double superficie;  /* Es la superficie a pintar (metros cuadrados). */
    protected double precioPintura; /* Es el precio de un litro de pintura */

/* COnstructor/ es */

    public TrabajoPintura( String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura){

        super(trabajador, fechaInicio, cliente);

        this.superficie = superficie;

        this.precioPintura = precioPintura;

    }

 /* Metodos getter y setter */   
    
    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

/* Metodos sobreescritos */ 
    
    @Override
    public double costeMaterial() {
       
        double coste_material = (superficie/ 7.8) * precioPintura;

            return coste_material;
    }

    @Override
    public double costeManoObra() {
       
        double coste_Mano_obra = (superficie / 10) * 9.5;

            return coste_Mano_obra;

    }

    @Override
    public double costeTotal() {
       
        
        if( superficie < 50){

            return (costeManoObra() + costeMaterial()) * (1+0.15);
        
        }else{
        
            return costeManoObra() + costeMaterial();

        }
   }

    @Override
    public String detalleServicio() {
       
    String cadena;

        cadena =  "TRABAJO DE PINTURA\n";

    cadena += "Cliente : " + cliente + "\n";
    
    cadena += "Fecha inicio : " + fechaInicio + "\n";
cadena += "------------------------------------------------------- \n";

    cadena += "Pintor : " + trabajador + "\n";
    
    cadena += "Coste Material........" + costeMaterial() + "\n";

    cadena += "Mano de Obra........" + costeManoObra() + "\n";

    cadena += "Coste Adicional........" + (costeManoObra() + costeMaterial()) * (1+0.15) + "\n";

    cadena += "Coste Total........" + costeTotal() + "\n";

cadena += "----------------------------------------------------------";

        return cadena;

    }


}
