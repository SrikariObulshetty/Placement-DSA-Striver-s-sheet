class Solution {
    static String getBinaryRep(int n) {
        // code here....
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            sb.append((char)n%2);
            n/=2;
        }
        sb.reverse();
        StringBuilder t=new StringBuilder();
        for(int i=0;i<32-sb.length();i++){
            t.append('0');
        }
        String s= t.toString() + sb.toString();
        return s;
    }
}
