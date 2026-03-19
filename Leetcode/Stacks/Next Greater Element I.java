class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>st = new Stack<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        int l=nums2.length;
        map.put(nums2[l-1], -1);
        st.push(nums2[l-1]);
        for(int i=nums2.length-2;i>=0;i--){
           while(!st.isEmpty() && nums2[i] > st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums2[i], -1);
            }
            else{
                map.put(nums2[i], st.peek());
            }
            st.push(nums2[i]);
        }
        int n=nums1.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}

TC:O(nums1.len + nums2.len);
SC:O(nums2.len);
