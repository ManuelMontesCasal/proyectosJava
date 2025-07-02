public class ejemploThreadHilos extends Thread {


    public void run(){

        for(int i = 0; i <= 10; i++){

            System.out.println(i * i);

                try {
                    
                      Thread.sleep(1000);//se pausa un segundo//


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                }

            }

        }


        public static void main(String[] args) {
            
            ejemploThreadHilos thread1 =  new ejemploThreadHilos();
            ejemploThreadHilos thread2 = new ejemploThreadHilos();
            
            
            thread1.start(); // se inicia el primer hilo//

            thread2.start();//se inicia el segundo hilo//
        
        
        
        }







}
