// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        // code here
        Stack<String>st=new Stack<>(); // for operands.
        for(char ch:exp.toCharArray()){
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                String s2=st.pop();
                String s1=st.pop();
                String s = '(' + s1 + ch + s2 + ')';
                st.push(s);
            }
            else{ //operand
                st.push(ch+"");
            }
        }
        return st.pop();
    }
}
T.C : O(n)
S.C  : O(n)
