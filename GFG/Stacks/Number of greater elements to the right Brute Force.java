
class Solution {
    public static int[] count_NGE(int arr[], int indices[]) {
        // code here
        //BRUTE FORCE.
        int l=arr.length;
        int temp[] = new int[l];
        for(int i=0;i<l;i++){
            int count=0;
            for(int j=i+1;j<l;j++){
                if(arr[i] < arr[j]){
                    count++;
                }
            }
            temp[i]=count;
        }
        int ans[]  = new int[indices.length];
        for(int i=0;i<ans.length;i++){
            ans[i] = temp[indices[i]];
        }
        return ans;
    }
}
TC:O(N^2)
SC:O(N)
