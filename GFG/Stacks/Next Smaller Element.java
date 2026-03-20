class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int l=arr.length;
        ArrayList<Integer>ans = new ArrayList<>(Collections.nCopies(l,-1));
        Stack<Integer>st = new Stack<>();
        for(int i=l-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=st.peek()){
                st.pop();
            }
            if(!st.isEmpty()){
                ans.set(i, st.peek());
            }
            st.push(arr[i]);
        }
        return ans;
    }
}

TC:O(N)
SC:O(N)
