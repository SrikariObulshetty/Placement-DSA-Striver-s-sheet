// User function Template for Java.....

class Solution {
    public String chartostr(char arr[], int N) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
