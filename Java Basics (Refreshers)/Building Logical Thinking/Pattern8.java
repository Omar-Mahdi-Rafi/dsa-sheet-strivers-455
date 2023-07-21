class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=n; i>0; i--){
            //space
            for(int j=i; j<=n-1; j++){
                System.out.print(" ");
            }
            //asterisk 
            for(int j=0; j<(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
