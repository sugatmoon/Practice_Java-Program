public class AlphabatesPrint {
    public static void main(String[] args) {
        int x = 'A';
        int y = 'Z';
        int w = 'a';
        int z = 'z';
        for(int i = x; i<y;i++){
            System.out.printf("%c ",i);
        }
        System.out.printf("\n");
        for(int i = w; i<z;i++){
            System.out.printf("%c ",i);
        }
    }
}
