





class Solution {
    public class Pack{
        int id;
        int deadline;
        int profit;
        Pack(int id, int dead, int pro){
            this.id=id;
            deadline=dead;
            profit=pro;
        }
    }

    public ArrayList<Integer> JobSequencing(int[] id, int[] deadline, int[] profit) {
        // code here..
        ArrayList<Integer>ans=new ArrayList<>();
        int count=0;
        int prof=0;
        PriorityQueue<Pack> pq= new PriorityQueue<>
        ( (a, b) -> {if(a.profit==b.profit) return a.deadline-b.deadline;
                     return b.profit - a.profit; });
        int n=id.length;
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);
        for(int i=0;i<n;i++){
            pq.offer(new Pack(id[i], deadline[i], profit[i]) );
        }
        while(pq.size() > 0){
            Pack p=pq.poll();
            int i=p.id;
            int de=p.deadline;
            int pro=p.profit;
            while(de>0 && arr[de]!=-1){
                de--;
            }
            if(de>0){
                arr[de]=i;
                prof+=pro;
                count++;
            }
            
        }
        ans.add(count);
        ans.add(prof);
        return ans;
        
        
    }
}
