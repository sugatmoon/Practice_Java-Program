import java.util.Scanner;

public class custom_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >0){
            try{
                throw new myException();
            }
            catch (Exception ex){
                System.out.println(ex.toString());
                System.out.println(ex.getMessage());
                System.out.println(ex);
                ex.printStackTrace();
            }
        }
    }
}
class myException extends Exception{
    @Override
    public String toString() {
        return super.toString() + "This methode will print String exception.";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"This method will print Message Exception";
    }
}
