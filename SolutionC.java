public class SolutionC {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.isPalindrome(121);
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int reverse = 0;
        int pop = 0;
        while (x > reverse) {
            pop = x % 10;
            reverse = reverse * 10 + pop;
            x = x / 10;

        }
        return (x == reverse) || (x == reverse / 10);

    }
}