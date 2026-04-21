class Solution {
    public String longest(List<String> arr) {
        // code here.....
        int idx=-1;
        int max= 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).length() > max){
                idx=i;
                max=arr.get(i).length();
            }
        }
        return arr.get(idx);
    }
}
