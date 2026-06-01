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
        int arr[] = new int[128];
        Arrays.fill(arr,-1);
        int i=0;
        for(int j=0;j<l;j++){
            char c = s.charAt(j);
            if(arr[c]==-1){ 
                max=Math.max(max, j-i+1); //update maximum
            }
            else{
                //check if idx is the window range 
                int idx = arr[c]; 
                if(idx>=i && idx<j){ //slide window
                    i= idx + 1;

                }
                else{
                    max=Math.max(max, j-i+1); 
                }
                
            }
            arr[c]=j;
        }
        return max;
        
    }
}
