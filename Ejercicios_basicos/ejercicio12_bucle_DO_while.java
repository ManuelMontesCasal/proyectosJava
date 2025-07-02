public class ejercicio12_bucle_DO_while {
    /*Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 
2 y 3. Utiliza el bucle que desees */
    public static void main(String[] args) {
        /*Inicializamos las variables*/
        int i=1;

        /*Inicializamos el bucle for */
        for(i=1;i<=100;i++){

        if(i%2==0)
        {
            System.out.println("Estos son los numeros que son multiplos de 2: " +i);
        }else
        {
            if(i%3==0)
            {
                System.out.println("Estos son los numeros que son multiplos de 3: " +i);
            }else{

                System.out.println("Estos numeros de " +i+  " no son multiplos ni de 2 ni de 3");
                }
        
        
            }        

        }
    
    }
}
