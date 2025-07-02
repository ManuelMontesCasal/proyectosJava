package EjerciciosFicheros.src.TrabajandoConFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticaFile {

    public static void main(String[] args) {
    //Creamos un fichero//
        File F = new File ("FicheroEjemplo.txt");
    try{
    //Escribimos en el //

        FileWriter fw = new FileWriter(F);

            fw.write("Esto es una prueba que hago yo solo.");
            fw.close();

    //Visualizamos su contenido

        FileReader fr = new FileReader(F);
        BufferedReader fR = new BufferedReader(fr);
        String ImprimirBuffered = fR.readLine();
        fr.close();

            System.out.println(ImprimirBuffered);



     } catch (IOException e){

        System.out.println("error");
    } 

    }

}
