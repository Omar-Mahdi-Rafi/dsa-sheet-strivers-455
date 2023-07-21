class Solution {

    void printDiamond(int n) {
        // Your code here
        //Pyramid
        for(int i = 1; i<=n; i++){
            //space
            for(int j = i; j<=(n-1); j++){
                System.out.print(" ");
            }
            //asterisk
            for(int j=0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Inverted Pyramid
        for(int i=n; i>0; i--){
            //space
            for(int j=i; j<=n-1; j++){
                System.out.print(" ");
            }
            //asterisk 
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
