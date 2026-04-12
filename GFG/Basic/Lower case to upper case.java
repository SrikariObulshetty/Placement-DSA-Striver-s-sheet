// User function Template for Java
class Solution {
    String to_upper(String str) {
        // code here...
        StringBuilder sb = new StringBuilder();
        for(char c:str.toCharArray()){
            sb.append((char)(c-'a'+'A'));
        }
        return sb.toString();
    }
}
