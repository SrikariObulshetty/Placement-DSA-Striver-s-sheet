TC:O(n)
SC:O(1)


class Solution {
    public static int largest(int[] arr) {
        // code here
        int max=-1;
        for(int n:arr){
            max=Math.max(max, n);
        }
        return max;
    }
}
