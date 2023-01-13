public class Minimum_element_of_an_Array {
    public static void main(String[] args) {
        int[] numbers= { 3,46,8,4,2,68,45912,4865,489,654,610,2};
        int num =564;
        for(int i=0;i<numbers.length;i++)
        {
            if(num>numbers[i])
            {
                num=numbers[i];
            }
        }
        System.out.println("The minimum element of array:"+num);
    }
}
