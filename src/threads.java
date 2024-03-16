class myThread extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Thread flow of main class");
            i ++;
        }
    }
}
public class threads {
    public static void main(String[] args) {

        myThread th  = new myThread();
        th.start();
        int j = 1;
        while (true) {
            System.out.println(j + "Normal Flow of main class");
            j++;
        }

    }
}
