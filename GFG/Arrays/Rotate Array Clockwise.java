class Solution {
    
    
    public void reverse(int l, int h, int[] arr){
         while(l<h){
             int temp=arr[l];
             arr[l]=arr[h];
             arr[h]=temp;
             l++;
             h--;
         }
    }
    
    public void rotateclockwise(int[] arr, int k) {
        // code here.
        int l=arr.length;
        k=k%l;
        reverse(0,l-k-1,arr);
        reverse(l-k,l-1,arr);
        reverse(0,l-1,arr);
    }
}

TC:O(n)
SC:O(1)
