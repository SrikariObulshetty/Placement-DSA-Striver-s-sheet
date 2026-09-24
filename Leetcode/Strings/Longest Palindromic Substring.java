class Solution {


    public static int[] expand(String s, int l, int r){
        int [] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        
        while(l>=0 && r<s.length()  && s.charAt(l) == s.charAt(r)){
             if(r-l+1 >= ans[1]-ans[0] ){
                   ans[0] = l;
                   ans[1] = r+1;
             }
              
              l--;
              r++;
        } 
        return ans;
    }


    public String longestPalindrome(String s) {
        // Idea is to consider evry index as mid point of a palindrom nd then expand both sides
        int st = -1;
        int e = -1;
        int l = s.length();
        for(int i=0;i<l;i++){
            int [] odd = expand(s, i, i);

            int []  even = expand(s, i, i+1);

            if( (odd[1] - odd[0] ) > (even[1] -even[0])    ){
                if(odd[1] - odd[0] > e-st ){
                   st = odd[0];
                   e = odd[1];
                }
                
            }
            else{
                if(even[1] - even[0] > e-st){
                    st = even[0];
                    e = even[1];
                }
                 
            } 
        }

        return s.substring(st, e);
        
    }


}
