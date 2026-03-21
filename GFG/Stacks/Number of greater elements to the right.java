
class Solution {
    
    static class Pair{
        int val,idx;
        Pair(int val, int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    
    
    
    public static void mergeSort(int low, int high, Pair []pair){
        if(low>=high){
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(low, mid, pair);
        mergeSort(mid+1, high, pair);
        merge(low, mid, high, pair);
    }
    
    public static void merge(int low, int mid, int high, Pair []pair){
          Pair temp[] = new Pair[high-low+1];
          int i=low;
          int j=mid+1;
          int k=0; // for temp array.
          int grterCount = 0;
          while(i<=mid && j<=high){ //Sorting in descending order.
              if(pair[j].val > pair[i].val){
                  temp[k++] = pair[j++];
                  grterCount++;
              }
              else{
                  count[pair[i].idx] += grterCount;
                  temp[k++]=pair[i++];
              }
          }
          while(i<=mid){
              count[pair[i].idx] += grterCount;
              temp[k++] = pair[i++];
              
          }
          while(j<=high){
              temp[k++] = pair[j++];
          }
          //move back to original array.
          for(int p=0;p<=high-low;p++){
              pair[low+p] = temp[p]; 
          }
    }
    
    
    static int[] count;
    public static int[] count_NGE(int arr[], int indices[]) {
        // code here.
        int l=arr.length;
        Pair pair[] = new Pair[l];
        count = new int[l];
        int ans[]= new int[indices.length];
        //Create pair array with value and idx of elements in arr.
        for(int i=0;i<l;i++){
            pair[i]  = new Pair(arr[i], i);
        }
        mergeSort(0,l-1, pair);
        for(int j=0;j<indices.length;j++){
            ans[j] = count[indices[j]];
        }
        return ans;
        
        
    }
}
TC:O(NlogN + Queries.length)
SC:O(N)

