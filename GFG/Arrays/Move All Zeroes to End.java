class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int l = arr.length;
        int i=0;
        int j=0;
        while(j < l){
            if(arr[j] != 0){
                 //swap
                int temp =  arr[i];
                arr[i++] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
    }
}

TC:O(n)
SC:O(1);
