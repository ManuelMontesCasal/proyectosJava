public class principal {

    public static void main(String[] args) {
        long initialTime = System.currentTimeMillis();
        cliente cliente1 = new cliente("Cliente 1", 5);
        cliente cliente2 = new cliente("Cliente 2", 2);
        cliente cliente3 = new cliente("Cliente 3", 2);
        cliente cliente4 = new cliente("Cliente 4", 5);
        cajero cajero1 = new cajero("Cajero 1", cliente1, initialTime);
        cajero cajero2 = new cajero("Cajero 2", cliente2, initialTime);
        cajero cajero3 = new cajero("Cajero 3", cliente3, initialTime);
        cajero cajero4 = new cajero("Cajero 4", cliente4, initialTime);
        cajero1.start();
        cajero2.start();
        cajero3.start();
        cajero4.start();
        }
        














}
