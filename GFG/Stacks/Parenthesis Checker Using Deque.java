class Solution {
    public boolean isBalanced(String s) {
        // code here
        Deque<Character>dq=new ArrayDeque<>(); // AI gave it is better to use deque inplace of stack,coz 
        //there will be no smtg...,find the reason
        int l=s.length();
        int i=0;
        for(;i<l;i++){
            char c=s.charAt(i);
            if(i==0 && (c==')' || c==']' || c=='}')){
                return false; // coz valid one's will not start with any of the closing brackets.
            }
            if(c==')' || c==']' || c=='}'){
                if(dq.isEmpty()  || (c==')' && dq.peek()!='(') ||
                      (c==']' && dq.peek()!='[') ||
                      (c=='}' && dq.peek()!='{')
                      ){
                          return false;
                      }
                      else{
                          dq.pop();
                      }
            }
            else{
                dq.push(c);
            }
        }
        return dq.isEmpty();
    }
}

              
