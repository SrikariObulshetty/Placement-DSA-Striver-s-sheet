class Solution {

    public int recursion(String s, String t, int idx1, int idx2){
          // Base cases
          if(idx1<0 || idx2<0){
            return 0;
          }
          // if chars match
          if(s.charAt(idx1) == t.charAt(idx2)){
                return 1 + recursion(s, t, idx1-1, idx2-1);
          }
          
          return Math.max( recursion(s,t,idx1-1, idx2) , recursion(s,t,idx1, idx2-1));
    }
    
    public int longestCommonSubsequence(String text1, String text2) {
        return recursion(text1, text2, text1.length()-1, text2.length()-1);
    }
}
