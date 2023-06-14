package june14th;
public class Threadclass extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Threadclass thread = new Threadclass();
        thread.start();
    }
}