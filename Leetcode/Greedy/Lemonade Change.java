class Solution {
    public boolean lemonadeChange(int[] bills) {
           int l = bills.length;
           int arr[] = new int[3]; //0->5,, 1->10,, 2->20
           for(int n:bills){
              if(n==5){
                 arr[0]++;
              }
              else if(n==10){
                 if(arr[0] > 0){
                    arr[0]--;
                 }
                 else{
                    return false;
                 }
                arr[1]++; 
              }
              else{ //n==20
                 if(arr[0] > 0 && arr[1]>0){ 
                    arr[0]--;
                    arr[1]--;
                 }
                 else if(arr[0] >= 3){ //15 can be given as 3-5Dollars.
                    arr[0] = arr[0]-3;
                 }
                 else{
                    return false;
                 }
                  arr[2]++;
              }
           }
           return true;
    }
}
