class Solution {
    
    class Meet{
        int start;
        int end;
        Meet(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    
    public int activitySelection(int[] start, int[] finish) {
        // code here.....
        int l = start.length;
        int ans = 0;
        PriorityQueue<Meet>pq = new PriorityQueue<>((a,b) -> a.end -b.end);
        for(int i=0;i<l;i++){
            pq.add(new Meet(start[i], finish[i]) );
        }
        int freeTime=0; 
        while(!pq.isEmpty()){
            Meet m = pq.poll();
            if(m.start > freeTime){
                ans++;
                freeTime = m.end;
            }
        }
        return ans; 
    }
}
