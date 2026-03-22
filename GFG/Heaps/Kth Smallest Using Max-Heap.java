class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer>pq = new PriorityQueue<>( (a,b) -> b-a);
        int i=0;
        for(;i<k;i++){
            pq.add(arr[i]);
        }
        for(;i<arr.length;i++){
            if(arr[i] < pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
        
    }
}
Time Complexity: O(n log k)
Auxiliary Space: O(k)
