public class Maximum_element_of_an_Array {
    public static void main(String[] args) {
        int[] numbers = {1,100000,45,67,9,56,56,6};
        int num=0;
for(int i=0;i< numbers.length;i++){
if (num<numbers[i]) {
                num =numbers[i];
            }
        }
        System.out.println("The gretest number among the Arrays:"+num);
    }
}
