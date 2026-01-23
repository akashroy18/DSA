public class basic {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            this.data=val;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }
        else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void main(String[] args) {
        int val[] = {5,1,3,4,2,7};
    }
}
