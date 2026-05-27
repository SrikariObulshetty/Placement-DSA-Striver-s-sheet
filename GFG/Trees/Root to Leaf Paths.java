/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int val)
    {
        this.data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    
    public void btpath(Node root, ArrayList<ArrayList<Integer>>ans, ArrayList<Integer>temp){
        if(root==null){
            ans.add(new ArrayList<>(temp));
            return;  
        }
        temp.add(root.data); 
        if(root.left!=null){ //add this node nd explore further path.
            btpath(root.left, ans, temp);
            if(temp.size()>0){
              temp.remove(temp.size()-1);
            }
        } 
        
        if(root.right!=null){
            btpath(root.right, ans, temp);
            if(temp.size()>0){
              temp.remove(temp.size()-1);
            }
        }
        
        //if both are null
        if(root.left==null && root.right==null){ //go to any one side just to add the temp list to ans list.
            btpath(root.left, ans, temp);
        }
        
    }
    public ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here.....
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        btpath(root, ans, new ArrayList<>());
        return ans; 
    }
}
