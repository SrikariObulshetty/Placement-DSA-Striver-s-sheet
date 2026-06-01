class Solution {
    public int longestUniqueSubstr(String s) {
        // code here.....
        int l=s.length();
        if(l==0){
            return 0;
        }
        else if(l==1){
            return 1;
        }
        int max=0;
        int arr[] = new int[26];
        Arrays.fill(arr,-1);
        int i=0;
        for(int j=0;j<l;j++){
            char c = s.charAt(j);
            if(arr[c-'a']==-1){
                max=Math.max(max, j-i+1);
            }
            else{
                int idx = arr[c-'a'];
                if(idx>=i && idx<j){ //this char is present before in the window.
                    i=idx + 1; 
                }
                else{
                    max=Math.max(max, j-i+1);
                }
            }
            arr[c-'a']=j; 
        }
        return max;
        
    }
}
