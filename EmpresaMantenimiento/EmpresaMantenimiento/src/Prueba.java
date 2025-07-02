import java.time.LocalDate;
import java.util.ArrayList;

public class Prueba {

public static void main(String[] args) {
    

    RevisionAlarmas rv1 = new RevisionAlarmas(LocalDate.of(2024, 8, 16), "Supermercados Suma", 16);

    TrabajoPintura tp1 = new TrabajoPintura("Guillermo Fernandez", LocalDate.of(2024, 4, 5),"Casa particular", 120.75, 149.99);



        System.out.println(tp1.detalleServicio());
        System.out.println(rv1.detalleServicio());


    
    ArrayList <Servicios> listaServicios = new ArrayList<>();

        listaServicios.add(tp1);
        listaServicios.add(rv1);


    double sumadorServicios = 0;
    double sumadorSalarios = 0;

        for(Servicios sumaServicios : listaServicios){

          

            sumadorServicios += sumaServicios.costeTotal();

            sumadorSalarios += sumaServicios.costeManoObra();


         }

        System.out.println( "esta es la suma total de los costes totales : " + sumadorServicios);

        System.out.println( "esta es la suma total de los Salarios es : " + sumadorSalarios);
        
          
    
    
    }







}
