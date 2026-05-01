/* A binary tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        // code here.....
        ArrayList<Integer>ans = new ArrayList<>();
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int l = q.size();
            while(l>0){
                Node node = q.poll();
                if(node!=null){
                   ans.add(node.data);
                   if(node.left!=null){
                     q.add(node.left);
                   }
                   if(node.right!=null){
                     q.add(node.right);
                   }
                }
                l--;
            }
        }
        return ans;
    }
}
