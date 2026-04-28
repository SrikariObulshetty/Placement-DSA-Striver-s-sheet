// User function Template for Java

class Solution {
    static int cubeRoot(int n) {
        // code here...
        for(int i=1;i<=n;i++){
            if(i*i*i == n){
                return i;
            }
            else if(i*i*i > n){
                return i-1;
            }
        }
        return -1;
    }
};
