import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Principal {

 /*Creamos un objeto de la clase diccionario */  
   
    private  static Diccionario diccionarioEspIng = new Diccionario();
    private static Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        diccionarioEspIng.nuevoPar("hola", "hello");
        RellenarDiccionario();
        juego();
    }

/*Creamos metodo RellenarDiccionario para meter parejas de palabras en el objeto diccionarioEspIng */

    private static void RellenarDiccionario(){
    try{
        File fichero = new File("C:\\Users\\User\\Desktop\\proyetos java\\Diccionario\\Diccionario\\src\\Palabras.txt");
        FileReader fr = new FileReader(fichero);
        BufferedReader br = new BufferedReader(fr);

        String linea = "";
           
            while((linea = br.readLine()) != null) {
                
                String array[] = linea.split(";");
                diccionarioEspIng.nuevoPar(array[0],array[1]);
       
            }

                br.close();
   
    }catch(Exception e){

        System.out.println("Error en la lectura del archivo");
    }

        

}

/* metodo juego de adivinar palabras en ingles */
   
 public static void juego(){

        String palEsp;
        String letraIng;
        String respuesta;

    do {
         palEsp = diccionarioEspIng.palabraAleatoria();
         letraIng = diccionarioEspIng.primeraLetraaTraduccion(palEsp);
        
            System.out.println(palEsp + ":  "+ letraIng + "...");
            System.out.println("Indique la respuesta correcta : ");
                 respuesta = sc.nextLine();

            String palIng = diccionarioEspIng.traduce(palEsp);
                if(respuesta.equalsIgnoreCase(palIng)){

                    System.out.println("CORRECTO");

                }else{

                    System.out.println("No, la respueesta correcta es" + palIng);
            
            }
            
            }while(!respuesta.equalsIgnoreCase("Fin"));
        
     
       } 
            
       
    } 
    
        

    





