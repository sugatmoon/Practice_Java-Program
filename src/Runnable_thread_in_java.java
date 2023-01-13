class runnable1 implements Runnable{
    public void run(){
        System.out.println("This will run the thread 1.");
    }
}
class runnable2 implements Runnable{
   public void run(){
        System.out.println("This will run the thread 2.");
        System.out.println("This will run the thread 2.");
    }
}
public class Runnable_thread_in_java {
    public static void main(String[] args) {
        runnable1 r1 = new runnable1();
        Thread run1 = new Thread(r1);
        runnable2 r2= new runnable2();
        Thread run2 = new Thread(r2);
        run1.start();
        run2.start();
    }
}
