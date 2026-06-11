class Solution {
    public int findContentChildren(int[] g, int[] s) {
          int ans=0;
          Arrays.sort(g);
          Arrays.sort(s);
          int gl=g.length;
          int sl=s.length;
          int i=0,j=0; //two pointers.
          while(i<gl && j<sl){
            if(g[i] <= s[j]){
                ans++;
                i++;
            }
            j++;
          }
          return ans;
    }
}
