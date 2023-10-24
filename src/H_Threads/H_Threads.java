package H_Threads;

public class H_Threads extends Thread{

    public void run(){
        System.out.println("Running");
    }
    public static void main(String[] args) {

        H_Threads threads = new H_Threads();
        threads.start();
    }
}
