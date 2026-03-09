// User function Template for Java

class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        Stack<String>s1 = new Stack<>();
        int l=pre_exp.length();
        for(int i=l-1;i>=0;i--){
            char ch=pre_exp.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                String st1=s1.pop();
                String st2=s1.pop();
                String temp = "(" + st1 + ch + st2 + ")" ;
                s1.push(temp);
            }
            else{ // it is a operand
              s1.push(ch+"");
            }
        }
        return s1.pop();
        
    }
}
