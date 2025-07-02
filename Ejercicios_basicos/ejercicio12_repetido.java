public class ejercicio12_repetido {
 public static void main(String[] args) {
    /*Iniciamos la variable */
        int i=1;

        /*Comenzamos el bucle DO-while */


        do{
            if(i%2==0)
            {
                System.out.println(i);
                i++;
            }else 
            {
                if(i%3==0)
                {
                    System.out.println(i);
                    i++;
                }
            }
                }while(i<=100);
    }   



}
