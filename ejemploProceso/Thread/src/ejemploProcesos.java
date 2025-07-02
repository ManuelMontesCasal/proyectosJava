public class ejemploProcesos {

    public static void main(String[] args) {
        
        for(int i = 1; i <= 10; i++){

            System.out.println(i * i);

                try {
                    
                    Thread.sleep(1000); //Pausamos 1 segundo//

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
