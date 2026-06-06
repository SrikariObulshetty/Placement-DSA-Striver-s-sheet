class Solution {
    public int countGoodSubstrings(String s) {
        int l = s.length();
        if(l < 3){
            return 0;
        }
        char arr[] =s.toCharArray();
        int ans = 0;
        for(int i=0;i<=l-3;i++){
            char c1= arr[i];
            char c2=arr[i+1];
            char c3=arr[i+2];
            if(c1!=c2 && c2!=c3 && c3!=c1){
                ans++;
            }
        }
        return ans;



    }
}
