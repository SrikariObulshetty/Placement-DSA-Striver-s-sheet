class Solution {
    public static String infixToPostfix(String str) {

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                val.push("" + ch);
            }

            else if(ch == '('){
                op.push(ch);
            }

            else if(ch == ')'){
                while(op.peek() != '('){

                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();

                    val.push(v1 + v2 + o);
                }
                op.pop();
            }

            else{

                while(op.size() > 0 && op.peek()!='(' &&
                      (precedence(op.peek()) > precedence(ch) ||
                      (precedence(op.peek()) == precedence(ch) && ch != '^'))){

                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();

                    val.push(v1 + v2 + o);
                }

                op.push(ch);
            }
        }

        while(op.size() > 0){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();

            val.push(v1 + v2 + o);
        }

        return val.peek();
    }

    static int precedence(char ch){

        if(ch=='+' || ch=='-') return 1;
        if(ch=='*' || ch=='/') return 2;
        if(ch=='^') return 3;

        return 0;
    }
}

TC:O(n)
SC:O(n)
