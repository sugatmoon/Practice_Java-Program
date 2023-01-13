public class variable_argument {
    static int fun(int ...arr){
        int sum=0;
        for(int x :arr)
        {
            sum+=x;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of an array:" + fun(6,6,6,4,6));
    }
}
