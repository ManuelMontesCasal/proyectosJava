public class Mythread extends Thread {

    public void run(){

        for(int i = 0; i <= 10; i++){


            System.out.println(i);
            
                try {
                    
                    Thread.sleep(500); //Pausar el hilo 0.5 segundos//;

                } catch (InterruptedException e) {
                    
                    e.printStackTrace();

                }
            }
        }

        public static void main(String[] args) {
            
            Mythread thread1 = new Mythread();
            Mythread thread2 = new Mythread();
       
            thread1.start();
            thread2.start();
       
        }
    }
