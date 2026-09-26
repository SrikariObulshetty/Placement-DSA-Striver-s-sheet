class Solution {
    public int longestKSubstr(String s, int k) {
        // code here.....
        int l = s.length();
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        int j = 0;
        int max = -1;
        for(int i=0;i<l;i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, i);
            }
            else{ // map already has this key
               map.remove(c);
               map.put(c, i);
            } 
           
            if(map.size() > k){
                for(Character key: map.keySet()){ // remove first element from map.
                    j = map.get(key) + 1;
                    map.remove(key);
                    break; 
                }
            }
             if(map.size() == k){ // update the length
                max = Math.max(max, i- j + 1 ); 
            } 
        }
        
        return max; 
        
        
        
    }
}
