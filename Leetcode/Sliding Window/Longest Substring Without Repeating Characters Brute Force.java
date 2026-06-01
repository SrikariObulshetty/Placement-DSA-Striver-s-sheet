class Solution {
    public boolean check(int i, int j, String s){
        for(int m=i;m<=j;m++){
            char c1=s.charAt(m);
            for(int n=m+1;n<=j;n++){
                char c2=s.charAt(n);
                if(c1==c2){ 
                    System.out.println(s.substring(i,j+1)+" " + c1+ " " + c2);
                    return false;
                }
            }
        }
        return true;
    }
    public int lengthOfLongestSubstring(String s) {
        //BRUTE FORCE
        int l = s.length();
        int max=0;
        //create all substrings...
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                if(check(i, j, s)){
                    
                    max = Math.max(max, j-i+1);
                }
            }
        }
        return max; 
    }
}
