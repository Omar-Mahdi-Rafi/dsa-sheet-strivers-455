import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();

		// String strNum = "" + n;
        
		// int strLength = strNum.length();
		int evenSum = 0, oddSum = 0;

		while(n!=0){
			int digit = n%10;
			if (digit%2 == 0){
				evenSum += digit;
			}else{
				oddSum += digit;
			}
		    n = n/10;
		}
		System.out.println(evenSum + " " + oddSum);
	}
}
