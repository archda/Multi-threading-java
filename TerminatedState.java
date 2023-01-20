class terminated implements Runnable{
    @Override
    public void run() {
        // No processing in this block
    }
}
public class TerminatedState {
    public static void main(String[] args) throws InterruptedException {
        terminated r=new terminated();// child class

        Thread t=new Thread(r);
        t.start();
        t.sleep(1000);
        System.out.println(t.getState());
    }
}
