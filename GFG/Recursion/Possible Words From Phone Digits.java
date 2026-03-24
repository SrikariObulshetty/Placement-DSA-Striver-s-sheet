class Solution {
    
    public void combinations(int []arr, int idx, StringBuilder sb, HashMap<Integer,String>map, ArrayList<String>ans){
        if(idx==arr.length){
            ans.add(sb.toString());
            return;
        }
        if(arr[idx]==1 || arr[idx]==0){ 
            combinations(arr, idx+1, sb, map, ans);
            return;
        }   
        String mapped=map.get(arr[idx]);
        for(int j=0;j<mapped.length();j++){
            char c=mapped.charAt(j);
            combinations(arr, idx+1, sb.append(c), map, ans);
            sb.deleteCharAt(sb.length()-1);
        }
        return;
    }
    
    
    public ArrayList<String> possibleWords(int[] arr) {
        // code here...
        ArrayList<String>ans = new ArrayList<>();
        
        HashMap<Integer,String>map = new HashMap<>();
        //I am handling for 0,1 cases in combinations function,so no need to add them in map.
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        combinations(arr, 0, new StringBuilder(), map, ans);
        return ans;
    }
}
