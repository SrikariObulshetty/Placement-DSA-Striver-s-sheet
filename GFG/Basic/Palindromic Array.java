/*Complete the Function below*/
class Solution {
    
    public static boolean palindrome(int n){
        String s = n+"";
        int l = s.length();
        for(int i=0;i<l/2;i++){
            char c1=s.charAt(i);
            char c2=s.charAt(l-i-1);
            if(c1!=c2){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int n:arr){
            if(!palindrome(n)){
                return false;
            }
        }
        return true;
    }
}
