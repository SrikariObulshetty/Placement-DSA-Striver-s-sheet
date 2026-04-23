// User function Template for Java
class Solution {
    String merge(String S1, String S2) {
        // code here...
        StringBuilder sb = new StringBuilder();
        int i=0,j=0;
        int n1=S1.length(), n2=S2.length();
        while(i<n1 || j<n2){
            if(i<n1){
                sb.append(S1.charAt(i++));
            }
            if(j<n2){
                sb.append(S2.charAt(j++));
            }
        }
        return sb.toString();
    }
}
