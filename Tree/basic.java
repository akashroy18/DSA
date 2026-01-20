public  class basic{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Binary_tree{
         int idx = -1;
        public  Node buildTree(int node[]){
            idx++;
            if(node[idx]==-1){
                return null;
            }
            Node newnode = new Node(node[idx]);
            newnode.left = buildTree(node);
            newnode.right = buildTree(node);
            return newnode;
        }
        public  void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
        public void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
        public void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }
     public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_tree tree = new Binary_tree();
        Node root = tree.buildTree(nodes);
        tree.preOrder(root);
        System.out.println("now inorder traversal");
        tree.inOrder(root);
        System.out.println("now postOrder traversal");
        tree.postOrder(root);
    }

}