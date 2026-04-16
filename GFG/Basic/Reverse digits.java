// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here..
        int ans=0;
        while(n!=0){
            int r = n%10;
            n/=10;
            ans = ans*10 + r;
        }
        return ans;
    }
}
