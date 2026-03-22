class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low>=high){
            return;
        }
        int pivot = partition(arr, low, high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1, high);
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here.
        //We will consider last element as PIVOT.
        int pivot=arr[high];
        int j=low;
        for(int i=low;i<high;i++){
            if(arr[i] < pivot){ //swap
                int temp=arr[j];
                arr[j++] = arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=pivot;
        arr[high]=temp;
        return j;
    }
}
TC:O(NlogN), Worst Case:O(N^2) -> This case occurs when array is already sorted.
SC:O(logN) -> Recursion stack space.
