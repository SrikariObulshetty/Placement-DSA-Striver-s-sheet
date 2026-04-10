class Solution {
    static int sumOfDigits(int n) {
        // code here.....
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
TC:O(N) -> N=no.of digits
SC:O(1)
