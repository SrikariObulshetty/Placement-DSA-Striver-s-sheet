class Solution {

    public void recursion( List<List<Integer>>ans, List<Integer> list, int[] candidates, int len, int idx,int sum, int target){
        if(sum == target){
            ans.add(new ArrayList<>(list)); 
            return;
        }
        else if(idx >= len || sum>target){ 
            return;
        }
        list.add(candidates[idx]); 
        recursion(ans, list, candidates, len, idx, sum+candidates[idx], target);
        list.remove(Integer.valueOf(candidates[idx])); 
        
        recursion(ans, list, candidates, len, idx+1, sum, target); 
        return; 

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int  l = candidates.length;
        recursion(ans,list, candidates,l,0,0, target);

        return ans;
         
        
    }
}
