class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        if(l==0){
            return 0;
        }
        else if(l==1){ 
            return 1;
        }
        int max=0;
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        for(int j=0;j<l;j++){
            char c = s.charAt(j);
            if(!map.containsKey(c)){
                max=Math.max(max, j-i+1); //update maximum
            }
            else{
                //check if idx is the window range 
                int idx = map.get(c);
                if(idx>=i && idx<j){ //slide window
                    i= idx + 1;

                }
                else{
                   
                    max=Math.max(max, j-i+1); 
                }
                
            }
            map.put(c, j);
        }
        return max;
        
    }
}
