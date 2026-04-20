// User function Template for Java

class Solution {
    public long find_fact(int n) {
        // Code here.....
        long prod=1;
        for(long i=2;i<=n;i++){
            prod*=i;
        }
        return prod;
    }
}
