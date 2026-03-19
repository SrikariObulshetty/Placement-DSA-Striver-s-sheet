class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int l=nums.length;
        int ans[] = new int[l];
        Arrays.fill(ans, Integer.MIN_VALUE);
        Stack<Integer>st = new Stack<>();
        st.push(nums[l-1]);
        for(int i=l-1;i>=0;i--){
            while(!st.isEmpty() && nums[i] >= st.peek()){ 
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = Integer.MIN_VALUE;
            }
            else{  
                ans[i]=st.peek();
            }
            st.push(nums[i]);
        }
        //Second round.
    for(int i=l-1;i>=0;i--){
        if(ans[i]==Integer.MIN_VALUE){
            while(!st.isEmpty() && nums[i] >= st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(nums[i]);
        }       
    }
    return ans;
    }
}
TC:O(N)
SC:O(N)
