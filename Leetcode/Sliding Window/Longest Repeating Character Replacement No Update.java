class Solution {
    public int characterReplacement(String s, int k) {
         //Brute Force.
          int l = s.length();
          int ans = 0;
          int arr[] = new int[26];
          int maxFreq=0;
          int i=0,j=0;
          while(j < l){
             arr[s.charAt(j) - 'A']++;
             maxFreq = Math.max(maxFreq, arr[s.charAt(j) - 'A']);
             while(j-i+1 - maxFreq > k){
                arr[s.charAt(i++) - 'A']--; 
                // No need to update maxFreq
             }
             ans=Math.max(ans, j-i+1);
             j++;
          }
          return ans;
    }
}
