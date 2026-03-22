class Solution {
    // Function to return kth largest element from an array.
    public static int KthLargest(int nums[], int k) {
        // Your code here
        return quickSort(nums, k, 0, nums.length-1);
    }
    
    public static int quickSort(int []nums, int k, int low, int high){
        if(low <= high){
            int tar=nums.length-k;
            int pivot = partition(nums, low, high);
            if(pivot==tar){
                return nums[pivot];
            }
            else if(pivot < tar){ 
                return quickSort(nums, k, pivot+1, high);
            }
            else{
                return quickSort(nums,k, low, pivot-1);
            }
        
        }
        return -1;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot=arr[high];
        int j=low;
        for(int i=low;i<high;i++){
            if(arr[i] <= pivot){
                int temp=arr[j];
                arr[j++]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=pivot;
        arr[high]=temp;
        return j;
    }
}

