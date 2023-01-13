interface Properties{
    int x = 33;
    void breaking();
    void horning();
    void power();
}
class sportBike implements Properties{
    void bolwing(){
        System.out.println("SugatMoon");
    }
     public void breaking(){
        System.out.println("This is Breaking System.");
    }
    public void  horning(){
        System.out.println("This horn Blowing  System.");
    }
    public void power(){
        System.out.println("This is power System.");
    }
}
public class interface_in_java {
    public static void main(String[] args) {
        sportBike sb = new sportBike();
        sb.power();
        sb.bolwing();
        sb.horning();
        sb.breaking();
    }
}
