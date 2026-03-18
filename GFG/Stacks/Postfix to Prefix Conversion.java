// User function Template for Java

class Solution {
    static boolean isOperator(char ch){
        if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
            return true;
        }
        return false;
    }
    static String postToPre(String post_exp) {
        // code here
        StringBuilder sb = new StringBuilder();
        Stack<String>st=new Stack<>();
        for(char ch:post_exp.toCharArray()){
            if(isOperator(ch)){
                String op2=st.pop();
                String op1=st.pop();
                st.push(ch + op1 + op2);
            }
            else{ //it is an operand
                st.push(ch+"");
            }
        }
        return st.pop();
    }
}
