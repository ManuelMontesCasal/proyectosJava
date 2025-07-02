package EjerciciosFicheros.src.TrabajandoConFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticaBufferedWtiter {


    public static void main(String[] args) {
        //Creamos un fichero usando FileWriter//

        try {
            
            FileWriter fw = new FileWriter("C:\\Users\\User\\Desktop\\Ruta ficheros java\\PracticaBufferedWriter.txt");
            

            //Escribimos en el archivo con BufferedWriter//

            BufferedWriter bw = new BufferedWriter(fw);

                bw.write("Hola, estoy practicando como usar BufferedWriter.");
                bw.newLine();
                bw.write("AAAAHHH, se le olvidaba, estoy practicando unsando Visual Studio Code.");

                bw.close();
                fw.close();


            //Ahora lo vamos a visualizar//

            FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\Ruta ficheros java\\PracticaBufferedWriter.txt");
            BufferedReader br = new BufferedReader(fr);
            String ImprimirArchivo;
            
            while(( ImprimirArchivo = br.readLine()) != null){

                System.out.println(ImprimirArchivo);
           
            }
               
                fr.close();

        } catch (IOException e) {
            System.out.println("Error");
        }

           



    }




}
