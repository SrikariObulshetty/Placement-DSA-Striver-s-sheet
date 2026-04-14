// User function Template for Java

class Solution {
    public int[] findSum(int n) {
        // Code here.....
        int odd=0;
        int even=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){ // even
                even+=i;
            }
            else{
                odd+=i;
            }
        }
        return new int[]{odd, even};
    }
}
