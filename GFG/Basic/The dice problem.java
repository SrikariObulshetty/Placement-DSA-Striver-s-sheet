// User function Template for Java
class Solution {
    static int oppositeFaceOfDice(int n) {
        // code here....
        HashMap<Integer,Integer>map = new HashMap<>();
        //1-6,2-5,3-4
        map.put(1,6);
        map.put(2,5);
        map.put(3,4);
        map.put(4,3);
        map.put(5,2);
        map.put(6,1);
        return map.get(n);
    }
}

