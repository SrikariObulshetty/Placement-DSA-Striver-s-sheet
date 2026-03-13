class Solution {
    int missingNum(int arr[]) {
        // code here
        int xor = arr.length+1;
        for(int i=0;i<arr.length;i++){
            xor = xor ^ arr[i] ^ (i+1);
        }
        return xor;
    }
}
