class Solution {
    public int countGoodSubstrings(String s) {
         // Brute Force..
         int l = s.length();
         if(l < 3){
            return 0;
         }
         int ans=0;
         int i = 0;
         int j = 0;
         HashMap<Character, Integer> map = new HashMap<>();
         while(j < l){
             char c1 = s.charAt(i);
             char c2 = s.charAt(j);
             map.put(c2, map.getOrDefault(c2, 0) + 1);
             if(j-i+1 == 3){
                if(map.size() == 3){
                    ans++;
                }
                map.put(c1, map.get(c1) - 1);
                if(map.get(c1) == 0){
                    map.remove(c1);
                }
                i++;
             }
             j++;
         }
         return ans;
        
    }
}
