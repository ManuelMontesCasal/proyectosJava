import java.util.Random;

public class Tablero {

/* Variables o atributos */

    private final int [][] tablero;
    public static final int FIL = 4;
    public static final int COL = 4;

/* Constructor /es */

    public Tablero(){

        tablero = new int [FIL][COL];

        for(int f = 0; f<FIL; f++){
            for(int c = 0; c<COL; c++){

                tablero[f][c] = 0;
            
            }
        }
     
            ingresarDos();
            ingresarDos();
       
            tablero[2][1] = 8;
            tablero[2][2] = 8;
            
           
    }



/* Metodo celdas vacias */


     public int vacias(){

        int vacias = 0;

        for(int f = 0; f<FIL;f++){
            for(int c = 0;c<COL;c++){

                if(tablero[f][c] == 0){

                    vacias++;
                }
            }
         }

            return vacias;
    }

 /* Metodo mostrar */

     public void Mostrar(){

     for(int f = 0; f<FIL; f++){

            System.out.print("|");

        for(int c = 0; c<COL; c++){

            System.out.print(tablero[f][c]+ "|");
            
            }
       
            System.out.println("\n");

        }
    }


/* Metodo Ganador */

    public boolean ganador(){

        for(int f = 0; f<FIL;f++){
            for(int c = 0; c<COL;c++){

            if(tablero[f][c]==2048){

                return true;
            }
         }
    }

        return false;
}


/* Metodo filasVacias */


    private int filasVacias(int fila) {
    
    int n = 0;

        for(int c = 0; c<COL;c++){

            if(tablero[fila][c]== 0){

                n++;

            }

        }

            return n;
    }


/*Metodo columnaVacia */

   

    public int columnaVacia(int columna){

        int n = 0;

        for(int f = 0; f<FIL;f++){

            if(tablero[f][columna]== 0){

                n++;
            }
        }

            return n;
    }

/* Metodo introducir ficha 2 */


    public void ingresarDos(){

    int f;
    int c;

    Random random = new Random();

        do {
            
            f = random.nextInt(FIL);

        } while (filasVacias(f)== 0);


        do {
            
            c = random.nextInt(COL);

        } while (columnaVacia(c)== 0);

        tablero[f][c] = 2;
     }

/* METODOS PARA MOVER ARRIBA LAS CASILLAS */

/* Metodo ColocarArriba y MoverArriba */


     public void colocarArriba( int c ){

        if(columnaVacia(c) < COL)
            for(int veces = 0; veces < COL-1 ; veces++){

                for( int f = 0; f < FIL-1 ; f++){
                    if(tablero[f][c]== 0){
                    
                        tablero[f][c] = tablero[f + 1][c];
                        tablero[f + 1][c] = 0;
                   
                    }
                }
           
            }
        }

     public void moverArriba(){

        for(int c = 0; c < COL; c++){

         moverArribaYSumarColumna(c);

         }
     
     if(!finPartida()){
        
        ingresarDos(); 

     }  
   }   




     public void sumarArriba( int c){

        if(columnaVacia(c) < 3){

            for(int f = 0; f < FIL-1; f++){

                if(tablero[f][c]== tablero[f + 1][c]){

                    tablero[f][c] *= 2;
                    tablero[f + 1][c] = 0;
                }
            }
        }
    }


    public void moverArribaYSumarColumna(int c){

        colocarArriba(c);
        sumarArriba(c);
        colocarArriba(c);
    }

/*metodo finPartida */

    public boolean finPartida(){

       return (ganador() || vacias() == 0);

            
    }
/* METODOS PARA COLOCAR ABAJO LAS CASILLAS */

/* Metodos para colocar y mover abajo */


    public void colocarAbajo(int c){

        if(columnaVacia(c) < COL){

            for( int veces = 0; veces < COL - 1; veces++){
                for( int f = FIL - 1; f > 0; f--){

                    if(tablero[f][c] == 0){

                        tablero[f][c] = tablero[f - 1][c];
                        tablero[f - 1][c] = 0;
                    }
                  }
                }
            }
        }


/* Metodo para sumar de arriba a abajo */

    public void sumarAbajo(int c){

        if(columnaVacia(c) < 3){

            for(int f = 0; f < FIL-1; f++){

                if(tablero[f][c]== tablero[f + 1][c]){

                    tablero[f + 1][c] *= 2;
                    tablero[f][c] = 0;

                }
            }
         }
    }

/* Metodo que itere todas las columnas para que se muevan abajo */


    public void moverAbajoTodo(){

        for( int c = 0; c < COL; c++){

            colocarAbajo(c);
        }
    }

   
/* Metodo que baje los numeros y los sume si son iguales */

    public void moverAbajoYSUmarColumna(int c){

        colocarAbajo(c);
        sumarAbajo(c);
        colocarAbajo(c);
     }

   
/* METODOS PARA MOVER DE IZQUIERDA A DERECHA LAS CASILLAS */

/* Metodo para mover las casillas hacia la derecha */


    public void colocarDerecha(int f){

        if(filasVacias(f) < FIL){

            for( int veces = 0; veces < 3; veces++){

                for(int c = COL - 1; c > 0; c--){

                    if(tablero[f][c] == 0){

                        tablero[f][c] = tablero[f][c - 1];
                        tablero[f][c - 1] = 0;

                    }
                }

             }
         }
    }

/* Metodo para sumar las casillas de izquiera a derecha */

    public void sumarDerecha(int f){

        if(filasVacias(f) < 3){

            for(int c = COL - 1; c > 0; c--){

                if(tablero[f][c] == tablero[f][c - 1]){

                    tablero[f][c] *= 2;
                    tablero[f][c - 1] = 0;

                }
             }
        }
    }


/* Metodo para iterar todas las filas hacia la derecha */


    public void moverDerechaTodo(){

        for (int f = 0; f< COL - 1; f++){

            colocarDerecha(f);

        }


    }

/* Metodo para mover y sumar las casillas de izquierda a derecha */
   
    public void moverDerechaYSumarFilas( int f){

            colocarDerecha(f);
            sumarDerecha(f);
            colocarDerecha(f);
 }

/* METODOS PARA MOVER Y SUMAR LAS CASILLAS DE DERECHA A IZQUIERDA */

/* Metodo para mover las casillas de derecha a izquierda */

    public void colocarIzquierda( int f){

        if(filasVacias(f) < 3){

            for(int veces = 0; veces < 3; veces++){

                for(int c = 0; c < COL - 1; c++){

                    if(tablero[f][c] == 0){

                        tablero[f][c] = tablero[f][c + 1];
                        tablero[f][c + 1] = 0;

                    }
                }
             }
        }
    }


/* Metodo para sumar las casillas de derecha a izquierda */

    public void sumarIzquierda(int f){

        if(filasVacias(f) < FIL){

            for( int c = 0; c < COL - 1; c++){

                if(tablero[f][c] == tablero[f][c + 1]){

                    tablero[f][c] *= 2;
                    tablero[f][c + 1] = 0;
                
                }

            }

        }
    }

/* Metodo para iterar todas las filas hacia la izquierda */


    public void moverIzquierdaTodo(){

        for(int f = 0; f < COL - 1; f++){

            colocarIzquierda(f);

        }

    }


/* Metodo para mover a la izquierda y sumar */


    public void moverIzquierdaYSumarfila(int f){

        colocarIzquierda(f);
        sumarIzquierda(f);
        colocarIzquierda(f);
    
    }











}