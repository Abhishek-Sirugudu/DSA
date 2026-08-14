package Trees;

public class BST {
    static class Node{
        int data;
        Node left,right;

        Node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }
    Node root;

    public void insert(int val){
        root = insert(root,val);
    }
    private Node insert(Node root,int val){
        if(root == null){
            return new Node(val);
        }
        if(val > root.data){
            root.right = insert(root.right,val);
        }else if(val < root.data){
            root.left = insert(root.left,val);
        }
        return root;
    }

    public boolean search(int target){
        return search(target,root);
    }

    private boolean search(int target,Node root){
        if(root == null){
            return false;
        }
        if(root.data == target){
            return true;
        }

        if(root.data > target) {
            return search(target, root.left);
        }else{
            return search(target,root.right);
        }
    }

    public void inOrder(){
        inOrder(root);
    }public void preOrder(){
        preOrder(root);
    }   
    public void postOrder(){
        postOrder(root);
    }

    private void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    private void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    private void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public int min(){
        if(root == null){
            return -1;
        }
        return min(root);
    }
    private int min(Node root){
        if(root.left != null){
            return min(root.left);
        }
        return root.data;
    }
    public int max(){
        if(root == null){
            return -1;
        }
        return max(root);
    }
    private int max(Node root){
        if(root.right != null){
            return max(root.right);
        }
        return root.data;
    }

    public int height(){
        return height(root);
    }
    private int height(Node root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }

    public void delete(int target){
        root = delete(root,target);
    }

    private Node delete(Node root,int target){
        if(root == null){
            return null;
        }

        if(target < root.data){
            root.left = delete(root.left,target);
        }else if(target > root.data){
            root.right = delete(root.right,target);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            // CASE 3: The node has TWO children.
            // 1. Find the In-Order Successor (the minimum value in the right subtree)
            // (We are pretending your min() method from earlier accepts a Node and returns an int)
            int minVal = min(root.right);

            // 2. Overwrite the current node's data with that minimum value
            root.data = minVal;

            // 3. We now have two identical values in the tree!
            // We must delete the original minimum node from the right subtree.
            root.right = delete(root.right, minVal);
        }
        return root;

    }

}
