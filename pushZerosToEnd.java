public class pushZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {2,0,60,20,0,0,0,2,0,1,0,1};
        int[] temp = new int[arr.length];
        int i = 0;
        int j = arr.length-1;
        for (int x : arr ){
            if (x > 0) {
                temp[i] = x;
                i++;
            }else {
                temp[j] =x;
                j--;
            }
        }
    }
}
