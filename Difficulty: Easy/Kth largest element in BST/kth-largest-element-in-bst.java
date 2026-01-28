/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    int count=0;
    int result=-1;
    public int kthLargest(Node root, int k) {
        inOrder(root,countNodes(root)-k+1);
        return result;
    }
    public int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public void inOrder(Node root, int k) {
        if(root!=null){
            inOrder(root.left,k);
            count++;
            if(count==k){
                result= root.data;
                return;
            } 
            inOrder(root.right,k);
        }
    }
}