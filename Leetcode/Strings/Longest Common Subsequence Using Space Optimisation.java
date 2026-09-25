class Solution { 
    public int longestCommonSubsequence(String t1, String t2) {
       int l1 = t1.length();
       int l2 = t2.length();

       int dp[] = new int[l2]; 

        // Base Cases...

        for(int j=0;j<l2;j++){
             if(t1.charAt(0) == t2.charAt(j)){
                dp[j] = 1;
             }
             else{
                if(j > 0){ 
                    dp[j] = dp[j-1];
                }
                else{
                    dp[j]  = 0; 
                }  
             } 
        }

        for(int i=1;i<l1;i++){  
            int [] temp = new int[l2];

            if(t1.charAt(i) == t2.charAt(0) ){ //these if-else conditions r important, we should not have only else  condition. 
                temp[0] = 1;
            } 
            else{
               temp[0] = dp[0];
            } 
             
            for(int j=1;j<l2;j++){
                if(t1.charAt(i) == t2.charAt(j)){
                    temp[j] = 1 + dp[j-1];
                } 
                else{
                    temp[j] =  Math.max(dp[j], temp[j-1]); 
                } 
            }
            dp = temp;
        } 
        return dp[l2-1]; 
        
    }
}
