class Solution {
    public int longestOnes(int[] nums, int k) {
        Queue<Integer>q = new LinkedList<>();
        int l = nums.length;
        int max=0;
        int i=0;
        int j=0;
        for(;j<l;j++){
            //two cases
            if(nums[j]==1){ 
                max=Math.max(max, j-i+1);
            }
            else{ //element is 0.
                q.add(j);
                if(k>0){ 
                    k--;
                    max=Math.max(max, j-i+1); 
                }
                else{ //k=0
                    // j--; if we do this while adding into queue,dups are repeated.So, dont do this
                    // k++; //we're bringing 'i' pointer to the next of earliest 0,so indirectly we're not toggling a zero,/so, k++.
                    int m = q.poll();
                    i= m + 1; 
                } 
            }
        }
        if(k>0){
           max=Math.max(max, j-i); //j=len, so j-i will give length;
        }
        
        return max;
        
    }
}
