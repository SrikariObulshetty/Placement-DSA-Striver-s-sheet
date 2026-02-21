class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int l = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for(int i=1;i<l;i++){
            if(arr[i]!=ans.get(ans.size()-1) ){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}


TC:O(n)
SC:O(1)
