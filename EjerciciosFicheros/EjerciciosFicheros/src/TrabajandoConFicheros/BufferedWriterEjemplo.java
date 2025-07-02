package EjerciciosFicheros.src.TrabajandoConFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEjemplo {
public static void main(String[] args) {
        
    // Aqui escribimos el contenido que queremos que se almacene en ficheros para luego usarlo con la clase BufferedWriter//

        String texto1 = "Hola, esto es un ejemplo de texto en ficheto";
        String texto2 = "Esta es la continuacion del texto1";
        
    try(BufferedWriter bw = new BufferedWriter (new FileWriter ("C:\\Users\\User\\Desktop\\Ruta ficheros java\\FicheroBufferedWriter.txt"))){
            
        
                bw.write(texto1);
                bw.newLine();
                bw.write(texto2);
        
            } catch (IOException e) {
            System.out.println("Error");
        }


    }



 }

