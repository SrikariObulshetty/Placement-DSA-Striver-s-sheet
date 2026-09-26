class Solution {

    public String reverse(String s, int l){
        String r = "";
        for(int i=l-1;i>=0;i--){
            r+=s.charAt(i);
        }
        return r;
    }
    public int longestPalindromeSubseq(String s) {
        int l = s.length();
        String r = reverse(s, l);

        // Use longest common subsequence using space optimisation logic.
        int dp[] = new int[l];
        for(int i=0;i<l;i++){
            if(s.charAt(0) == r.charAt(i)){
                dp[i] = 1;
            }
            else{
                if(i>0){
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
                temp[0] = 1 ; 
            }
            else{
                temp[0] = dp[0];
            }
           
            for(int j=1;j<l;j++){ // j must start from "1" 
                if(s.charAt(i) == r.charAt(j)){
                    temp[j] = 1 + dp[j-1];
                }
                else{
                    temp[j] = Math.max(temp[j-1], dp[j]);
                } 
                
            }    
            dp = temp;


        }
        return dp[l-1];
        
        
        
    }
}
