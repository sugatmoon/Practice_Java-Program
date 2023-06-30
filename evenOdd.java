import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = 'j';
        if(x == 'a' ||x == 'e' ||x == 'i' ||x == 'o' ||x == 'u') {
            System.out.printf("This is %c : vowel",x);
        }
        else {
            System.out.printf("This is %c: consonant",x);
        }
    }
}
