class Solution {
    boolean isBinary(String s) {
        // Your code here.....
        for(char c:s.toCharArray()){
            if(!(c=='1') && !(c=='0')){
                return false;
            }
        }
        return true;   
    }
}
TC:O(N)
SC:O(1)
