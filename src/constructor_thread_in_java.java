class thread extends Thread{
    public thread(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 0;
        while (i<1) {
            System.out.println("This is thread.");
            System.out.println("The name is:"+getName());
            i++;
        }
    }
}
public class constructor_thread_in_java {
    public static void main(String[] args) {
        thread th = new thread("SugatMoon");
        th.start();
        System.out.println("Id of thread:"+th.getId());
    }
}
