// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here..
        int sum =0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        String s = sum+"";
        int l = s.length();
        for(int i=0;i<l;i++){
            char c1= s.charAt(i);
            char c2 = s.charAt(l-i-1);
            if(c1!=c2){
                return false;
            }
        }
        return true;
    }
}
