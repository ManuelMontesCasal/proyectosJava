package EjerciciosFicheros.src.TrabajandoConFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

 public class EscribirYLeerFicheros {

    //Ejercicio 1-- Escribir en un fichero "Hola Mundo"//

public static void main(String[] args) {
    
    //1. Al utilizar la clase FileWriter no haria falta crear un archivo ya que al escribir en el se nos crea por defecto//

          try{
    
            FileWriter fw = new FileWriter("C:\\Users\\User\\Desktop\\Ruta ficheros java\\Hola mundo.txt");
           

                fw.write("Hola mundo. Me llamo Manuel y este es mi primer archivo");
                
                fw.close();

    // 1. Ahora tendremos que visualizar el contenido del fichero con la clase FileReader//

            FileReader fR = new FileReader("C:\\Users\\User\\Desktop\\Ruta ficheros java\\Hola mundo.txt");
            BufferedReader buffer = new BufferedReader(fR);
            String contenido = buffer.readLine();
            System.out.println(contenido);
            fR.close();

            }catch (IOException e){

            System.out.println("error");
            
            }
   
   
        }




}