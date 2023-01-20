
class run implements Runnable{
    public void run(){

    }
}

public class RunnableState {
    public static void main(String[] args) throws InterruptedException {
        run r=new run();// child class

        Thread t=new Thread(r);

        t.start();
        System.out.println(t.getState());
    }
}
