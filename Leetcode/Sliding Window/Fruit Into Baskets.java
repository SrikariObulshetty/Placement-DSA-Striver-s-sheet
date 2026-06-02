class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int max=0;
        int l = fruits.length;
        int i=0;
        int j=0;
        for(;j<l;j++){
            map.put(fruits[j], j);
            if(map.size() > 2){ 
                Map.Entry<Integer, Integer> minEntry =
    Collections.min(
        map.entrySet(),
        Map.Entry.comparingByValue()
    );
               i = minEntry.getValue() + 1;
                map.remove(minEntry.getKey());
            } 
            else{
                max=Math.max(max, j-i+1);
            }
        } 
        return max;
    }
}
