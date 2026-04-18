// User function Template for Java

class Solution {
    String modify(String s) {
        // your code here.....
        Set<Character>set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        char []arr = s.toCharArray();
        int l=arr.length;
        int i=0,j=l-1;
        while(i<j){
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            while(!set.contains(c1) && i<j){
                i++;
                c1=s.charAt(i);
            }
            while(!set.contains(c2) && i<j){
                j--;
                c2=s.charAt(j);
            }
            //swap
            char temp=c1;
            arr[i]=c2;
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
