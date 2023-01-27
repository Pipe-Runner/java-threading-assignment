import servers.MultiThreadedServer;
import servers.SingleThreadedServer;

class Main {
    public static void main(String[] args) {
        System.out.println("Starting server");
        SingleThreadedServer server = new SingleThreadedServer(9000);
        new Thread(server).start();
    }
}