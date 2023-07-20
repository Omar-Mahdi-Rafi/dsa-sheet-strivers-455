import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        // boolean b1 = Character.isLetter(ch);
        if (Character.isLetter(ch) == true){
        // boolean b2 = Character.isUpperCase(ch);
        if (Character.isUpperCase(ch) == true){
        System.out.println("1");
          }
        else{
            System.out.println("0");
          }
        }
        else{
            System.out.println("-1");
        }

    }
}
