public class Sum_of_5_float_number {
    public static void main(String[] args) {
        float num[] ={ 12.5f,31.5f,25.53f,36.34f,24.53f};
        float sum = 0.0f;
        float n = 0.0f;
        for(int i=0;i<num.length;i++)
        {
            sum = sum + num[i];
        }
        System.out.println(sum);
        for(float numbers :num)
        {
            n= n+numbers;
        }
        System.out.println(n);

    }
}
