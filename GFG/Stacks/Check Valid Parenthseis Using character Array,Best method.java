class Solution {
    public boolean isBalanced(String s) {
        // code here.
        int l=s.length();
        char arr[] = new char[l];
        int i=0; // to use in arr;
        for(int j=0;j<l;j++){
            char c = s.charAt(j);
            if(j==0 && (c==')' || c==']' || c=='}')){
                return false;  //valid parenthesis will not start with any of the closed parenthesis.
            }
            else if(c==')' || c==']' || c=='}'){
                if(i==0){
                    return false;
                }
                if( (c==')' && arr[i-1]!='(') ||
                    (c==']' && arr[i-1]!='[') ||
                    (c=='}' && arr[i-1]!='{')
                    ){
                        return false;
                    }
                    else{ 
                        i=i-1; // jus like popping out of stack
                    }
            }
            else{ //it is any of the opening brackets
                arr[i++] = c;
            } 
        }
        return i==0;
    }
}
