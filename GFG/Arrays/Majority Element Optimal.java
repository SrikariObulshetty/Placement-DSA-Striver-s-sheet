class Solution {
    int majorityElement(int arr[]) {
        // code here
        int l=arr.length;
        int num=arr[0];
        int count=1;
        for(int i=1;i<l;i++){
            if(count==0){
                num=arr[i];
                count++;
                continue;
            }
            if(num == arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        //verify again
        int cnt=0;
        for(int p:arr){
            if(p == num){
                cnt++;
            }
        }
        if(cnt > l/2) return num;
        return -1;
    }
}

TC:O(N)
SC:O(1)
