class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int l=arr.length;
        if(l%2==0){
            int sum = arr[l/2] + arr[l/2 -1];
            return (double)sum/2;
        }
        return arr[l/2];
    }
}
