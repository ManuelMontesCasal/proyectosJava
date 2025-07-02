import java.util.HashMap;

public class Diccionario {

/* Variables o Atributos */

   private HashMap<String, String> diccionario;

/* Constructor/ es */

    public Diccionario(){

       diccionario = new HashMap<>(); 

    }


/* Metodo nuevoPar */


    public void nuevoPar(String palEsp, String palIng){

        diccionario.put(palEsp, palIng);

    }

/* Metodo traduce */

    public String traduce(String palEsp){

        
         return diccionario.get(palEsp);

        }


/*Metodo palabraAleatoria */


    public String palabraAleatoria(){

        int numPal = diccionario.size();
        int numAlt = (int) (Math.random() *numPal);

        String palEsp = (String) diccionario.keySet().toArray() [numAlt];

            return palEsp;

        }    

/*Metodo primeraLetraTraduccion */ 

    public String primeraLetraTraduccion(String palEsp){

        String palIng = diccionario.get(palEsp);
        char primerCaracter = palIng.charAt(0);

            String miString = String.valueOf(primerCaracter);

            return miString;

    }


/* Metodo primeraLetraTraduccion mas eficiente */


    public String primeraLetraaTraduccion(String palEsp){

        String palIng = diccionario.get(palEsp);
       
            return  palIng.trim().substring(0,1).toUpperCase();


    }








}
