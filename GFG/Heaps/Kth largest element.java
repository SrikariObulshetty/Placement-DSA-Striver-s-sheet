class Solution {
    // Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int k) {
        // Your code here
        Arrays.sort(arr);
        return arr[arr.length-k];
    }
}
TC:O(NlogN)
SC:O(1)
