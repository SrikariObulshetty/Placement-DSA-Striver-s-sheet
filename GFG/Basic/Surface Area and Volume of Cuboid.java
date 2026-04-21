// User function Template for Java

class Solution {
    public int[] find(int l, int b, int h) {
        // code here.....
        int ans[] = new int[2];
        ans[1]=l*b*h;
        ans[0] = 2*(l*b + b*h + l*h);
        return ans;
    }
}
