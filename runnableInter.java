
class myRun implements Runnable {
    int i = 1;
    @Override
    public void run() {
        while (true){
            System.out.println(i + "Runnable Flow");
            i++;
        }
    }
}
public class runnableInter {
    public static void main(String[] args) {
        myRun mr = new myRun();
        Thread t = new Thread(mr);
        t.start();

        int j = 1;
        while (true) {
            System.out.println(j+ "Normal Flow");
            j++;
        }
    }

}
