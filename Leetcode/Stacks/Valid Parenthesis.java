class Solution {
    public boolean isValid(String s) {
        char arr[]=new char[s.length()];
        int i=0;
        // if(s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']'){
        //     return false;
        // }
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                arr[i++]=ch;
            }
            else{
                if(i>0){
                    if((arr[i-1]=='(' && ch==')') || (arr[i-1]=='{' && ch=='}') || (arr[i-1]=='[' && ch==']')){
                        i=i-1;
                    }
                    else{
                        return false;
                    }
                }
                else{
                       return false;
                }
            }
        }
        return i==0;
    }
}

T.C: O(n)
S.C:O(n)
