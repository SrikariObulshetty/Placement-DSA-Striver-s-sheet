class Solution {
    
    public static boolean isOperator(char ch){
        if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^'){
            return true;
        }
        return false;
        
    }
    public static int prec(char ch){
        if(ch=='^'){
            return 15;
        }
        if(ch=='*' || ch=='/') return 10;
        else if(ch=='+' || ch=='-') return 5;
        return 0;
    }
    
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character>ops=new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(isOperator(ch)){
                //check precedence.
                while(!ops.isEmpty() &&  
                ( prec(ch)<prec(ops.peek()) || ( prec(ch)==prec(ops.peek()) && ch!='^') 
                )){
                     //add that operator to string builder
                     sb.append(ops.pop());
                }
                ops.push(ch); 
                
            }
            else{ //operand.
                 if(ch=='('){ 
                     ops.push(ch);
                 }
                 else if(ch==')'){
                     while(!ops.isEmpty() && ops.peek()!='('){
                         sb.append(ops.pop());
                     }
                     ops.pop(); // pop open bracket.
                 }
                 else{ //it is a normal operand
                     sb.append(ch);
                 }
            }
        }
        while(!ops.isEmpty()){
            sb.append(ops.pop());
        }
        return sb.toString();
        
    }
}
