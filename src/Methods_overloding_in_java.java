import java.security.spec.RSAOtherPrimeInfo;

public class Methods_overloding_in_java {
        static void fuc(){
            System.out.println("Good Morning!!");
        }
        static int fuc(int x){
            System.out.println("Print:"+x);
            return 0;
        }
        static int fuc(int x, int y){
            System.out.println("Print:"+x+y);
            return 0;
        }
        static void fun(int array[]){
            array[0] = 65;
            System.out.println(array);
        }

    public static void main(String[] args ) {
            int x=65;
            int y =6;
            int[] array ={36,5,46,4,8,5,6,4};
        fuc();
        fuc(x);
        fuc(x,y);
        fun(array);
        System.out.println(array[0]);


    }
}
