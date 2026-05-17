/* Structure of a Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public Node delNode(Node root, int x) {
        // code here.....
        if(root==null){
            return null;
        }
        else if(root.data > x){
            root.left = delNode(root.left, x);
        }
        else if(root.data < x){
            root.right = delNode(root.right, x);
        }
        else{ //Found the key
            if(root.left==null){
                root=root.right;
            }
            else if(root.right==null){
                root=root.left;
            }
            else{
                Node temp = root.left;
                while(temp.right!=null){
                    temp=temp.right;
                }
                root.data=temp.data;
                root.left = delNode(root.left, temp.data);
            }
        }
        return root;
    }
}
