// User function Template for Java

class Solution {
    
    
    
    public static boolean isOperator(char ch){
        if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
            return true;
        }
        return false;
    }
    static String preToPost(String pre_exp) {
        // code here
        //IDEA:  Read string from right to left, if it is 
        //an operand,add it into to the stack
        //if operator, take out 2 operands from stack and 
        //add to stack (as op1 op2 oprtr)
        //At last postfix expression is present in the stack,return that
        Stack<String>st=new Stack<>();
        int l=pre_exp.length();
        for(int i=l-1;i>=0;i--){
            char ch=pre_exp.charAt(i);
            if(isOperator(ch)){
                String op2=st.pop();
                String op1=st.pop();
                st.push(op2 + op1 + ch);
            }
            else{ //it is an operand,push it onto stack.
              st.push(ch+"");//have to add "", otherwise it is a character.
            }
        }
        return st.pop();
    }
}
