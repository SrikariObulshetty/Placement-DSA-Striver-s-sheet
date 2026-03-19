class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            ans.set(i, st.isEmpty() ? -1 : st.peek());
            st.push(arr[i]);
        }

        return ans;
    }
}

TC:O(N)
SC:O(N)
