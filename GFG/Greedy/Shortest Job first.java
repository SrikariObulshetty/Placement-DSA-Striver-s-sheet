class Solution {
    static int solve(int bt[]) {
        // code here.....
        Arrays.sort(bt);
        int time = 0;
        int l = bt.length;
        int ans=0;
        for(int i=0;i<l;i++){
            ans+=time;
            time+=bt[i];
        }
        return ans / l; 
    }
}
