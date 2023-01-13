public class Break_and_Continue {
    public static void main(String[] args) {
        for(int i=0;i<=6;i++)
        {
            if(i==4){
                break;
            }
            System.out.println(i);
        }
        System.out.println("This statement out of the loop");
        for(int i=0;i<=6;i++)
        {
            if(i==4){
                System.out.println("<This is skipped by loop>");
                continue;
            }
            System.out.println(i);
        }
        int i=1;
        System.out.println("This is do while loop");
//        do{
//            if(i==2){
//                break;
//            }
//            System.out.println(2*i);
//            i++;
//
//        }while (i<=10);
        System.out.println("This is do_while loop");
        do{
            if(i==2){
                continue;
            }
            System.out.println(2*i);
        }while (i<=10);


    }
}
