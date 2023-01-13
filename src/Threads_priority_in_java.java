class threads extends Thread{
    public threads(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i<1){
            System.out.println("This is thread priority:"+getName()+" "+getId());
//            System.out.println("This is id:"+ getId());
            i++;
        }
    }
}
public class Threads_priority_in_java {
    public static void main(String[] args) {
        threads th = new threads("sugat");
        threads th1 = new threads("Ayush");
        threads th2 = new threads("manish");
        threads th3 = new threads("Sameer");
        threads th4 = new threads("Ashok");
        th.setPriority(threads.MAX_PRIORITY);
        th4.setPriority(threads.MIN_PRIORITY);
        th2.setPriority(threads.NORM_PRIORITY);
        th.start();
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
