class Solution {

    public String reverse(String s, int l){
        String r = "";
        for(int i=l-1;i>=0;i--){
            r+=s.charAt(i);
        }
        return r;
    }


    public int minInsertions(String s) {
        // Logic is to use the Longest Palindrome Subsequence 
        // Find the lps and min chars would be n - lps.length()
        int l = s.length();
        String r = reverse(s, l);
        int [] dp = new int[l];
        for(int i=0;i<l;i++){
            if(s.charAt(0) == r.charAt(i) ){
                dp[i]  = 1;
            }
            else{
                if(i > 0){
                    dp[i] = dp[i-1];
                }
                else{
                    dp[i] = 0;
                }
            }
        }

        for(int i=1;i<l;i++){
            int temp[] = new int[l];
            if(s.charAt(i) == r.charAt(0)){
                temp[0] = 1;
            }
            else{
                temp[0] = dp[0];
            }
            for(int j=1;j<l;j++){
                if(s.charAt(i) == r.charAt(j)){
                    temp[j] = 1 + dp[j-1];
                }
                else{
                    temp[j] = Math.max(dp[j], temp[j-1] );
                }
            }
            dp = temp;
        }
        return l - dp[l-1]; 
    }
}
