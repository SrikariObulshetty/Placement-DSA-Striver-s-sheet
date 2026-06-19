class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int l = intervals.length;
        int ans = 0;
        Arrays.sort(intervals,  (a,b) -> Integer.compare(a[1],b[1])  );
        int freeTime = Integer.MIN_VALUE; 
        for(int i=0;i<l;i++){
            if(intervals[i][0] < freeTime){
                ans++;   
            }   
            else{
                freeTime=intervals[i][1]; 
            }
        } 
        return ans; 
    }
} 
