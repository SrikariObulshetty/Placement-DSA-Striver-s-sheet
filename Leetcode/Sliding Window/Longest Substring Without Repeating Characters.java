class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int j = 0;
        for(int i=0;i<l;i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c) >= j && map.get(c)<= i){
                    j = map.get(c) + 1; 
                }
            }
            map.put(c, i);
            max = Math.max(max, i - j + 1); 
        } 
        return max;  
        
    }
}
