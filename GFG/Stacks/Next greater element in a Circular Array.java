class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        int l=arr.length;
        ArrayList<Integer>ans = new ArrayList<>(Collections.nCopies(l,-1));
        Stack<Integer>st = new Stack<>();
        for(int i= (2*l)-1 ;i>=0; i--){
            int idx = i%l;
            while(!st.isEmpty() && arr[idx] >= st.peek()){
                st.pop();
            }
            if(!st.isEmpty()){
                ans.set(idx, st.peek());
            }
            st.push(arr[idx]);
        }
        return ans;
        
    }
}
