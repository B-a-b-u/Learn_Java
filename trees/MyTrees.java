// Trees

/*
 * It is a non-linear data structure
 * Tree type:
 *      Binary Tree
 *      Binary Search Tree
 *      Balanced Tree ( AVL, Red flag Tree)
 *      Trie Tree (used in next character prediction in google search engine)
 */


// Even tough the default visibility is public, if we did not specify it, it will not be accessible outside the package

import java.util.Queue;
import java.util.LinkedList;

class TreeNode{
    public int data;
    public TreeNode left;
    public TreeNode right;


    TreeNode(int value){
        this.data = value;
        // by default it is null only, so we dont need to specify here
        this.left = null;
        this.right = null;
    }
}

class Tree{
    public TreeNode root;


    // Traversals
    /*
     * 1. Pre order traversal => Root L R
     * 2. In order Traversal => L Root R
     * 3. Post order Traversal => L R Root
     * 4. Level order Traversal => Traverse level by level
     */
    public void preorderTraversal(TreeNode root){
        TreeNode temp = root;
        if (temp == null) {
            return;
        }
        else{
            System.out.println(temp.data);
            inorderTraversal(temp.left);
            inorderTraversal(temp.right);
        }
    }

    public void inorderTraversal(TreeNode root){
        TreeNode temp = root;
        if (temp == null) {
            return;
        }
        else{
            inorderTraversal(temp.left);
            System.out.println(temp.data);
            inorderTraversal(temp.right);
        }
    }

    public void postorderTraversal(TreeNode root){
        TreeNode temp = root;
        if (temp == null) {
            return;
        }
        else{
            inorderTraversal(temp.left);
            inorderTraversal(temp.right);
            System.out.println(temp.data);

        }
    }

    public void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.data);
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
        }
    }
}

public class MyTrees{
    public static void main(String[] args) {
        
        // Creating the nodes
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(30);
        TreeNode node4 = new TreeNode(40);
        TreeNode node5 = new TreeNode(50);

        //          10
        //     20           30
        //  40                      50
        // Connecting the nodes
        node1.left = node2;
        node1.right = node3;

        node2.left = node4;

        node3.right = node5;
        
        Tree tree = new Tree();
        tree.preorderTraversal(node1);
        System.out.println();
        tree.inorderTraversal(node1);
        System.out.println();
        tree.postorderTraversal(node1);
        System.out.println();
        tree.levelOrderTraversal(node1);
    }
}