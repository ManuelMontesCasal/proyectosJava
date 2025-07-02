package EjerciciosFicheros.src.TrabajandoConFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerConFicheros {

    //En este ejercicio vamos a leer archivos con la clase Scanner//


    public static void main(String[] args)  {
    
        File f = new File("NumerosAlineados.txt");

            try{
        
                Scanner sc = new Scanner(f);
                Scanner Usuario = new Scanner(System.in);

                int num;
            System.out.println("Dame un numero.");
                int numeroPrueba = Usuario.nextInt();

            while(sc.hasNext()){

                num = sc.nextInt();
                
                if(num > numeroPrueba){

                    System.out.println(num);

                }
            }

                sc.close();
                Usuario.close();
    
            }catch (FileNotFoundException e) {

                System.out.println("error");
            
            }

    
    }


}
