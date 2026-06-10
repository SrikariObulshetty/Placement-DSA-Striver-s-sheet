class Solution {
    public int numberOfSubstrings(String s) {
         int l = s.length(); 
         int [] lastSeen = new int[3];
         Arrays.fill(lastSeen,-1);
         int cnt = 0;
         for(int i=0;i<l;i++){
            char c = s.charAt(i);
            lastSeen[c-'a'] = i;
            cnt = cnt + 1 + Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2]) );
         }
         return cnt; 
    }
}
