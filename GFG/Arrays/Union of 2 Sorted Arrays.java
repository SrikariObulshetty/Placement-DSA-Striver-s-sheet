class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        //Two pointer concept.
        //Use an ordered set to remove dup's 
        ArrayList<Integer>al=new ArrayList<>();
        int i=0;
        int j=0;
        int l1=a.length;
        int l2=b.length;
        while(i<l1 && j<l2){
            if(a[i]<=b[j]){
                al.add(a[i]);
            }
            else{
                al.add(b[j]);
            }
            //write these loops after if-else,coz size()-1 will be -1 when al is empty
            while(i<l1 && al.get(al.size()-1)==a[i]){
                i++;
            }
            while(j<l2 && al.get(al.size()-1)==b[j]){
                j++;
            }
        }
        while(i<l1){
            al.add(a[i++]);
            while(i<l1 && al.get(al.size()-1)==a[i]){
                    i++;
            }
        }
        while(j<l2){ 
            al.add(b[j++]);
            while(j<l2 && al.get(al.size()-1)==b[j]){
                    j++;
                }
        }
        return al;
        
    }
}
