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
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean Search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data>key){
            return Search(root.left, key);
        }
        else if(root.data==key){
            return true;
        }
        else{
            return Search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<val.length;i++){
            root=insert(root, val[i]);
        }
        System.out.println("inorder traversal ");
        inorder(root);
        if(Search(root,4)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}
