class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=cardPoints[i];
        }
        if(k >= n){
            return sum;
        }
        int minSum=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int temp=0;
        while(j<n){
            while( j<n && j-i+1 <= n- k){ 
                temp+=cardPoints[j++]; 
            }
            minSum = Math.min(minSum, temp); 
            temp-=cardPoints[i++];
        }
        return sum - minSum;
        
    }
}
