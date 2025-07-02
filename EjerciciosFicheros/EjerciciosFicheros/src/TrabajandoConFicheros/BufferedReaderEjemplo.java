package EjerciciosFicheros.src.TrabajandoConFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEjemplo {

public static void main(String[] args) {
    

        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Ruta ficheros java\\FicheroBufferedWriter.txt"))) {
            
        String linea;


            while ((linea = br.readLine()) != null) {
                
                
                System.out.println(linea);
         }  

              } catch (IOException e) {
           
            System.out.println("Error");
        
        }


     }


}
