public class ejemploConcurrente extends Thread {

   // Variables// 
         private String threadName;

    //Constructor//

     public ejemploConcurrente(String threadName){

        this.threadName = threadName;

    }


    public void run(){

        for(int i = 1; i<=5; i++){

            System.out.println(threadName + " :" + i);


            try {
                
                Thread.sleep(500); //pausa de medio segundo//

             } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
       }

       public static void main(String[] args) {
        
        ejemploConcurrente thread1 = new ejemploConcurrente("thread1");
        ejemploConcurrente thread2 = new ejemploConcurrente("thread2");

        thread1.start();
        thread2.start();
    
     }
}
