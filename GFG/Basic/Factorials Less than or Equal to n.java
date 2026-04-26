// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long>ans = new ArrayList<>();
        long prod=1;
        for(long i=1;i<=n;i++){
            prod*=i;
            if(prod<=n){
                ans.add(prod);
            }
            else{
                break;
            }
        }
        return ans;
    }
}
