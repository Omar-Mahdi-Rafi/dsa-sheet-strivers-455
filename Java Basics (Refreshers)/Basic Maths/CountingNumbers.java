public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int count = 0;
        int num = n;
        while (num != 0) {
            int temp = num % 10;
            if (temp != 0 && n % temp == 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}
