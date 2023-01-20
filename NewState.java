
class starting implements Runnable{
    @Override
    public void run() {
        // No processing in this block
    }
}

public class NewState {
    public static void main(String[] args) throws InterruptedException {
        starting r=new starting();// child class

        Thread t=new Thread(r);

        System.out.println(t.getState());
    }
}
