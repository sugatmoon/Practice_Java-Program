class thread1 extends Thread{
    public void run(){
        while (true){
            System.out.println("This is threading1 in java.");
        }
    }
}
class thread2 extends Thread{
    public void run(){
        while (true){
            System.out.println("This is threading2 in java.");
        }

    }
}
class thread3 extends Thread{
    public void run(){
        while (true){
            System.out.println("This is threading3 in java.");
        }
    }
}
public class Threads_in_java {
    public static void main(String[] args) {
        thread1 th1;
        thread2 th2;
        thread3 th3;
        th1 = new thread1();
        th2 = new thread2();
        th3 = new thread3();
        th1.start();
        th2.start();
        th3.start();
    }
}

