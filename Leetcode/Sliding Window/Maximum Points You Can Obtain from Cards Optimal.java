class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum =0;
        int l=k-1;
        int r=n-1;
        for(int i=0;i<=l;i++){
            sum+=cardPoints[i];
        }
        int max=sum;
        while(l>=0){
            sum-=cardPoints[l--];
            sum+=cardPoints[r--];
            max=Math.max(max, sum);
        }
        return max;
    }
}
