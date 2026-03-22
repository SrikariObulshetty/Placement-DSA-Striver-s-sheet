// User function Template for Java

class Solution {
    static String isKSortedArray(int arr[], int n, int k) {
        // code here.
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], i);
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if( Math.abs(i-map.get(arr[i])) > k){
                return "No";
            }
        }
        return "Yes";
    }
}
Expected Time Complexity: O(nlogn).
Expected Auxiliary Space: O(n).
