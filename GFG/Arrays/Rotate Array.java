// User function Template for Java

class Solution {
    
    static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--]= temp;
        }
    }
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int len = arr.length;
        d = d%len;
        if(d==0){
            return;
        }
        reverse(arr, d, len-1);
        reverse(arr, 0 ,d-1);
        reverse(arr, 0 , len-1);
    }
}

TC:O(n)
SC:O(1)
