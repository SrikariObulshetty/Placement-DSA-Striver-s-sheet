class Solution {
    // Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int k) {
        // Your code here
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        int i=0;
        for(;i<k;i++){
            pq.add(arr[i]);
        }
        for(;i<arr.length;i++){
            if(arr[i] > pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
Time Complexity: O(n log k)
Auxiliary Space: O(k)
