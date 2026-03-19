import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;
            while (!st.isEmpty() && st.peek() <= nums[idx]) {
                st.pop();
            }

            if (i < n) { //this condition is for code discipline it seems,even though code works well widout
                // this condition,it is used to remove overwriting.
                if (!st.isEmpty()) {
                    ans[idx] = st.peek();
                }
            }

            st.push(nums[idx]);
        }

        return ans;
    }
}

TC:O(N)
SC:O(N)
