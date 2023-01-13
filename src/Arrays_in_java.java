public class Arrays_in_java {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,6,8,7,9,6,5};
        System.out.println(number.length);
        for(int i=0;i<number.length;i++)
        {
            System.out.println(number[i]);
        }
        System.out.println("Through reverse order");
        for(int i= number.length-1;i>=0;i--)
        {
            System.out.println(number[i]);
        }
//        Printing list of array using for-each loop
        System.out.println("For Each Loop");
        for(int elements:number)
        {
            System.out.print(elements+" ");
        }
    }
}
