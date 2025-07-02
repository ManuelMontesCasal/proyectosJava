import java.io.IOException;

public class processLauncher {

    public static void main(String[] args) {
        
        try {
            
           
            ProcessBuilder pb1 = new ProcessBuilder("java", "-classpath","/ProcessExample/src/Thread/ProcessExample.java","ProcessExample");

            ProcessBuilder pb2 = new ProcessBuilder("java", "-classpath","/ProcessExample/src/Thread/ProcessExample.java","ProcessExample");

            pb1.start();
            pb2.start();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
