import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero {
    
    public static void main(String[] args) {
    try{    
    //creacion de fichero//

        File ficheroPrueba = new File ("prueba.txt");
    
    //Escribir en el fichero//

        FileWriter escribir = new FileWriter(ficheroPrueba);
            escribir.write("Esto es un archivo de prueba y se llama Archivo.txt");
            escribir.close();
    
    
    //Leer el contenido//

        FileReader leer = new FileReader(ficheroPrueba);
        BufferedReader buffer = new BufferedReader(leer);
        String contenido = buffer.readLine();
        System.out.println(contenido);
            leer.close();
    
    }catch (IOException e){

        System.out.println("Puede ocurrir un problema.");
    }
   
   
   
     }


}




