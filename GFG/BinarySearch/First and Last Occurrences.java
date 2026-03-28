// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int i=0;
        int j=arr.length;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==x){
                int st=mid;
                int end=mid;
                while(st>0 && arr[st-1]==x){
                    st--;
                }
                while(end<arr.length-1 && arr[end+1]==x){
                    end++;
                }
                ans.add(st);
                ans.add(end);
                return ans;
            }
            else if(arr[mid]<x){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        ans.add(-1);
        ans.add(-1);
        return ans;
    }
}
