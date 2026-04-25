class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here.....
        Set<Integer>set = new HashSet<>();
        int count=0;
        for(int n:a){
            set.add(n);
        }
        for(int n:b){
            if(set.contains(n)){
                count++;
            }
            set.add(n);
        }
        return count;
    }
}
